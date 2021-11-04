package com.example.smart_app_demo.mapper;

import com.example.smart_app_demo.pojo.SmartAppGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shkstart
 * @creatr 2021-11-04-14:21
 */
@Mapper
public interface GoodsMapper {
    List<SmartAppGoods> getList();
    SmartAppGoods getById(long id);
    int add(SmartAppGoods smartAppGoods);
    int update(SmartAppGoods smartAppGoods);
    int delete(long id);
}
