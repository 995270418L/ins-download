package com.steve.insdownloader.service;

import com.alibaba.fastjson.JSON;
import com.steve.framework.exception.InsBuineseException;
import com.steve.insdownloader.entities.basic.Item;
import com.steve.insdownloader.entities.basic.SingleSource;
import com.steve.insdownloader.entities.basic.User;
import com.steve.insdownloader.entities.extend.Carousel_media_single;
import com.steve.insdownloader.entities.extend.Items_single;
import com.steve.insdownloader.entities.extend.Page;
import net.dongliu.requests.RawResponse;
import net.dongliu.requests.Requests;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class InsService {
    private static String MEDIAURL = "https://www.instagram.com/username/media";
    private static String POSTBASEURL = "https://www.instagram.com/p/";
    private static String responseText = "";
    private static String max_id = "";

    public static User getUserInfo(String username){
        System.out.println("get User Info according username");
        if(StringUtils.isNotBlank(username)){
            String mediaUrl = MEDIAURL.replace("username", username);
            String text = Requests.get(mediaUrl).send().readToText();
            Page page = JSON.parseObject(text, Page.class);
            User user = page.getItems().get(0).getUser();
            return user;
        }
        return null;
    }

    /**
     * 根据用户名获取响应的responseText
     * @param username
     * @return
     */
    public static String getResponseText(String username){
        return getResponseText(username,null);
    }

    /**
     * 根据用户名和max_id获取响应的responseText
     * @param username
     * @param max_id page.getItems().get(-1).getId() 获取max_id
     * @return
     */
    public static String getResponseText(String username, String max_id) {
        RawResponse resp = null;
        if(StringUtils.isNotBlank(max_id)){
            resp =  Requests.get(MEDIAURL.replace("username", username) + "?&max_id=" + max_id).send();
        }
        resp =  Requests.get(MEDIAURL.replace("username", username)).send();
        if(resp.getStatusCode() == 404){
            throw new InsBuineseException("user not exists","用户不存在");
        }
        return resp.readToText();
    }

    /**
     * 根据用户名获取resource
     * @param username
     * @return
     */
    public static List<Item> getResources(String username){
        return getResources(username,null);
    }

    /**
     * 根据用户名和max_id获取resource
     * @param username
     * @param max_id
     * @return
     */
    public static List<Item> getResources(String username, String max_id){

        responseText = getResponseText(username, max_id);
        Page page = JSON.parseObject(responseText, Page.class);
        if(page.getItems().size() < 10){
            throw new InsBuineseException("The Account is private", "该用户为私密用户");
        }
        return getResourceList(page);
    }

    /**
     * 专门解析page实体的，
     * @param page 传入page实体类
     * @return 返回一个ArrayLists
     */
    public static List<Item> getResourceList(Page page){
        List<Item> lists = new ArrayList<>();
        String url = "", content = "", time = "",video_url = "";
        Item resource = null;
        if(page.isMore_available()){
            max_id = page.getItems().get(19).getId();
        }
        for (Items_single item : page.getItems()) {
            if (item.getCarousel_media() != null) {
                for(Carousel_media_single images : item.getCarousel_media()){
                    url = InsPhotoUtils.accessFilter(images.getImages().getStandard_resolution().getUrl());
                    resource = new Item(url);
                    lists.add(resource);
                }
            } else if(item.getType().equals("image")){

                url = InsPhotoUtils.accessFilter(item.getImages().getStandard_resolution().getUrl());
                content = InsPhotoUtils.accessNewLine(item.getCaption().getText());
                time = InsPhotoUtils.accessTime(item.getCreated_time());
                resource = new Item(time,content,url, max_id);
            }else if(item.getType().equals("video")){
                url = InsPhotoUtils.accessFilter(item.getVideos().getStandard_resolution().getUrl());
                video_url = InsPhotoUtils.accessFilter(item.getVideos().getStandard_resolution().getUrl());
                content = InsPhotoUtils.accessNewLine(item.getCaption().getText());
                time = InsPhotoUtils.accessTime(item.getCreated_time());
                resource = new Item(time, content, url, max_id);
                resource.setVideo_url(video_url);
            }else{

            }
            lists.add(resource);
        }
        return lists;
    }


    /**
     * 获取复制的帖子地址
     * @param postId eg: 只需一个postid, 其他的数据会自动填充进来
     * @return
     */
    public static SingleSource getSingleResource(String postId){
        String url = POSTBASEURL + postId + "/";
        responseText = Requests.get(url).send().readToText();
        SingleSource ss = null;
        try{
            String share_data = responseText.split("window._sharedData = ")[1].split(";</script>")[0];
            String display_url = share_data.split("\"display_url\": \"")[1].split("\",")[0];
            String caption = null;
            try {
                String hasCaption = share_data.split("\"node\": \\{\"text\": \"")[1];
                caption = InsPhotoUtils.accessContent(share_data.split("\"text\": \"")[1].split("\"}}]},")[0]);
            }catch (ArrayIndexOutOfBoundsException e){
                caption = null;
            }
            String is_video = share_data.split("\"is_video\": ")[1].split(",")[0];
            ss = new SingleSource(display_url, caption, is_video);
            if(is_video.equals("true")){
                String video_url = share_data.split("\"video_url\": \"")[1].split("\",")[0];
                ss.setVideo_url(video_url);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            throw new InsBuineseException("sorry, service not response, please try again.","对不起，服务错误，请稍候重试");
        }
        return ss;
    }

}
