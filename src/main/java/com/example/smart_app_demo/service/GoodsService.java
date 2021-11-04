package com.example.smart_app_demo.service;

import com.example.smart_app_demo.pojo.SmartAppGoods;
import com.example.smart_app_demo.utils.Result;
import com.example.smart_app_demo.utils.Resultsim;

/**
 * @author shkstart
 * @creatr 2021-11-04-14:21
 */
public interface GoodsService {
    Result getList();
    Resultsim getById(long id);
    Result add(SmartAppGoods smartAppGoods);
    Result update(SmartAppGoods smartAppGoods);
    Result delete(long id);
}
