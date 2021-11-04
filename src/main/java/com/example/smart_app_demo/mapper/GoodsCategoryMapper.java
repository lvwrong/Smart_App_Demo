package com.example.smart_app_demo.mapper;

import com.example.smart_app_demo.pojo.SmartAppGoodsCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author shkstart
 * @creatr 2021-11-04-11:16
 */
@Mapper
public interface GoodsCategoryMapper {
    List<SmartAppGoodsCategory> getList();
    SmartAppGoodsCategory getById(long id);
    int add(SmartAppGoodsCategory s);
    int update(SmartAppGoodsCategory s);
    int delete(long id);
}
