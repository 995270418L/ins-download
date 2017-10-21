package com.steve.insdownloader.web.api.v1;

import com.steve.framework.exception.InsBuineseException;
import com.steve.framework.web.error.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Response<String> index(){
        throw new InsBuineseException("url error","地址格式不对");
    }
}
