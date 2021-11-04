package com.example.smart_app_demo.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shkstart
 * @creatr 2021-11-04-11:12
 */
@Data
public class Resultsim <T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public Resultsim(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }
}
