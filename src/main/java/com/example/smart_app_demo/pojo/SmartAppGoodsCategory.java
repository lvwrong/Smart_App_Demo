package com.example.smart_app_demo.pojo;

import lombok.*;

import java.util.Date;

/**
 * @author shkstart
 * @creatr 2021-11-04-10:37
 */
@Data
public class SmartAppGoodsCategory {
    private long goodsCategoryId;
    private String goodsCategoryName;
    private int type;
    private int state;
    private long createUserId;
    private Date createTime;
    private int tenantId;
    private long snowId;
}
