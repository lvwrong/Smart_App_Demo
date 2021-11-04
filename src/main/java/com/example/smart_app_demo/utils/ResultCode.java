package com.example.smart_app_demo.utils;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @author shkstart
 * @creatr 2021-11-04-11:05
 */
public enum ResultCode {
    SUCCESS(200,"成功"),
    NOTFIND(404,"没有找到数据"),
    ERROR(400,"失败");


    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
