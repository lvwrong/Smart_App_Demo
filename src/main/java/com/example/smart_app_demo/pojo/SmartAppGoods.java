package com.example.smart_app_demo.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author shkstart
 * @creatr 2021-11-04-10:28
 */
@Data
public class SmartAppGoods implements Serializable {
    private long goodsId;
    private int goodsType;
    private String goodsName;
    private String goodsPinyin;
    private String goodsGenericName;
    private long goodsCategoryId;
    private long fileId;
    private String goodsDetail;
    private int state;
    private int tenantId;
    private long snowId;
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
}
