package com.example.smart_app_demo.service;

import com.example.smart_app_demo.mapper.GoodsMapper;
import com.example.smart_app_demo.pojo.SmartAppGoods;
import com.example.smart_app_demo.pojo.SmartAppGoodsCategory;
import com.example.smart_app_demo.utils.Result;
import com.example.smart_app_demo.utils.ResultCode;
import com.example.smart_app_demo.utils.Resultsim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @creatr 2021-11-04-14:22
 */
@Service
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public Result getList() {
        List<SmartAppGoods> goodslist = goodsMapper.getList();
        if(goodslist != null){
            return new Result<SmartAppGoods>(ResultCode.SUCCESS,goodslist);
        }else{
            return new Result<SmartAppGoods>(ResultCode.NOTFIND,null);
        }
    }

    @Override
    public Resultsim getById(long id) {
        SmartAppGoods goodsById = goodsMapper.getById(id);
        if(goodsById != null){
            return new Resultsim(ResultCode.SUCCESS,goodsById);
        }else{
            return new Resultsim(ResultCode.NOTFIND,null);
        }
    }

    @Override
    public Result add(SmartAppGoods smartAppGoods) {
        int add = goodsMapper.add(smartAppGoods);
        if(add > 0){
            return new Result(ResultCode.SUCCESS,null);
        }else{
            return new Result(ResultCode.ERROR,null);
        }
    }

    @Override
    public Result update(SmartAppGoods smartAppGoods) {
        int update = goodsMapper.update(smartAppGoods);
        if(update > 0){
            return new Result(ResultCode.SUCCESS,null);
        }else{
            return new Result(ResultCode.ERROR,null);
        }
    }

    @Override
    public Result delete(long id) {
        int delete = goodsMapper.delete(id);
        if(delete > 0){
            return new Result(ResultCode.SUCCESS,null);
        }else{
            return new Result(ResultCode.ERROR,null);
        }
    }
}
