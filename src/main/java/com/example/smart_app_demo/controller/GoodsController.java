package com.example.smart_app_demo.controller;

import com.example.smart_app_demo.pojo.SmartAppGoods;
import com.example.smart_app_demo.service.GoodsService;
import com.example.smart_app_demo.utils.Result;
import com.example.smart_app_demo.utils.Resultsim;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shkstart
 * @creatr 2021-11-04-14:17
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @ApiOperation(value = "查询列表")
    @GetMapping("/getList")
    public Result getList(){
        return goodsService.getList();
    }

    @ApiOperation(value = "通过id查询列表")
    @PostMapping("/getById/{id}")
    public Resultsim getById(@PathVariable("id") long id){
        return goodsService.getById(id);
    }

    @ApiOperation(value = "增加数据")
    @PostMapping("/add")
    public Result add(@RequestBody SmartAppGoods smartAppGoods){
        return goodsService.add(smartAppGoods);
    }

    @ApiOperation(value = "修改数据")
    @PostMapping("/update")
    public Result update(@RequestBody SmartAppGoods smartAppGoods){
        return goodsService.update(smartAppGoods);
    }

    @ApiOperation(value = "通过id删除数据")
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable("id") long id){
        return goodsService.delete(id);
    }
}
