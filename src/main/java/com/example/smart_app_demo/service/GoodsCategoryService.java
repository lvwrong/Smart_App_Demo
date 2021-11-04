package com.example.smart_app_demo.service;

import com.example.smart_app_demo.utils.Result;
import com.example.smart_app_demo.utils.Resultsim;
import com.example.smart_app_demo.pojo.SmartAppGoodsCategory;

/**
 * @author shkstart
 * @creatr 2021-11-04-11:18
 */
public interface GoodsCategoryService {
    Result getList();
    Resultsim getById(long id);
    Result add(SmartAppGoodsCategory s);
    Result update(SmartAppGoodsCategory s);
    Result delete(long id);
}
