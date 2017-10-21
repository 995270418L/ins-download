package com.steve.insdownloader.entities.basic;

/**
 * Created by steve on 17-7-15.
 * 错误消息处理
 */
public class ErrorExtend {

    private String error_en;
    private String error_zh;

    public ErrorExtend(String err_zh, String err_en){
        this.error_en = err_en;
        this.error_zh = err_zh;
    }

    public String getError_en() {
        return error_en;
    }

    public void setError_en(String error_en) {
        this.error_en = error_en;
    }

    public String getError_zh() {
        return error_zh;
    }

    public void setError_zh(String error_zh) {
        this.error_zh = error_zh;
    }
}
