package com.steve.insdownloader.service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Pattern;

public final class InsPhotoUtils {

    /**
     * 过滤图片(java一定要加反下划线)
     * https://scontent.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/c180.0.719.719/17881007_267580456985875_5757861933298483200_n.jpg
     × https://scontent.cdninstagram.com/t51.2885-15/sh0.08/e35/17881007_267580456985875_5757861933298483200_n.jpg
     * @param url
     * @return
     */
    public static String accessFilter(String url){
        Pattern pattern = Pattern.compile("/s\\d{3,}x\\d{3,}/");
        // System.out.println(pattern.pattern());
        String newUrl = url.replaceAll(pattern.pattern(),"/");
        pattern = Pattern.compile("/c\\d{1,}.\\d{1,}.\\d{1,}.\\d{1,}/");
        // System.out.println(pattern.pattern());
        newUrl = newUrl.replaceAll(pattern.pattern(), "/");
        return newUrl;
    }

    public static String accessTime(String numTime){
        Instant instant  = new Date(Integer.parseInt(numTime)).toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        String date = localDateTime.toLocalDate().toString();
        String time = localDateTime.toLocalTime().withNano(0).toString();
        return date + " " + time;
    }

    public static String accessContent(String content){
        StringBuffer string = new StringBuffer();
        String[] hex = content.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            // 转换出每一个代码点
            int data = Integer.parseInt(hex[i], 16);
            // 追加成string
            string.append((char) data);
        }
        Pattern pattern = Pattern.compile("\\n");
        String newContent = string.toString().replaceAll(pattern.pattern(), " ");
        return newContent;
    }

    public static String accessNewLine(String caption){
        Pattern pattern = Pattern.compile("\\n");
        String newContent = caption.replaceAll(pattern.pattern(), " ");
        return newContent;
    }

}
