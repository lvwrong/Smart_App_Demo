package com.example.smart_app_demo.utils;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author shkstart
 * @creatr 2021-11-04-10:56
 */
@Data
public class Result<T> implements Serializable {
    private int code;
    private String message;
    private List<T> data;

    public Result(ResultCode resultCode, List<T> data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }
}
