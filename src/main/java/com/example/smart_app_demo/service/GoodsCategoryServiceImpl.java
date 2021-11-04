package com.example.smart_app_demo.service;

import com.example.smart_app_demo.mapper.GoodsCategoryMapper;
import com.example.smart_app_demo.utils.Result;
import com.example.smart_app_demo.utils.ResultCode;
import com.example.smart_app_demo.utils.Resultsim;
import com.example.smart_app_demo.pojo.SmartAppGoodsCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @creatr 2021-11-04-11:18
 */
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService{
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;

    @Override
    public Result getList() {
        List<SmartAppGoodsCategory> goodsCategorylist = goodsCategoryMapper.getList();
        if(goodsCategorylist != null){
            return new Result<SmartAppGoodsCategory>(ResultCode.SUCCESS,goodsCategorylist);
        }else{
            return new Result<SmartAppGoodsCategory>(ResultCode.NOTFIND,null);
        }
    }

    @Override
    public Resultsim getById(long id) {
        SmartAppGoodsCategory goodsCategoryById = goodsCategoryMapper.getById(id);
        if(goodsCategoryById != null){
            return new Resultsim(ResultCode.SUCCESS,goodsCategoryById);
        }else{
            return new Resultsim(ResultCode.NOTFIND,null);
        }
    }

    @Override
    public Result add(SmartAppGoodsCategory s) {
        int add = goodsCategoryMapper.add(s);
        if(add > 0){
            return new Result(ResultCode.SUCCESS,null);
        }else{
            return new Result(ResultCode.ERROR,null);
        }

    }

    @Override
    public Result update(SmartAppGoodsCategory s) {
        int update = goodsCategoryMapper.update(s);
        if(update > 0){
            return new Result(ResultCode.SUCCESS,null);
        }else{
            return new Result(ResultCode.ERROR,null);
        }
    }

    @Override
    public Result delete(long id) {
        int delete = goodsCategoryMapper.delete(id);
        if(delete > 0){
            return new Result(ResultCode.SUCCESS,null);
        }else{
            return new Result(ResultCode.ERROR,null);
        }
    }
}
