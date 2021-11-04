package com.example.smart_app_demo.controller;
import com.example.smart_app_demo.utils.Result;
import com.example.smart_app_demo.utils.Resultsim;
import com.example.smart_app_demo.pojo.SmartAppGoodsCategory;
import com.example.smart_app_demo.service.GoodsCategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author shkstart
 * @creatr 2021-11-04-11:14
 */
@RestController
@RequestMapping("/goodsCategory")
public class GoodsCategoryController {

    @Autowired
    private GoodsCategoryService goodsCategoryService;

    @ApiOperation(value = "查询列表")
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public Result getList(){
        return goodsCategoryService.getList();
    }

    @ApiOperation(value = "通过id查询列表")
    @RequestMapping(value = "/getById/{id}",method = RequestMethod.POST)
    public Resultsim getById(@PathVariable("id") long id){
        return goodsCategoryService.getById(id);
    }

    @ApiOperation(value = "增加数据")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(@RequestBody SmartAppGoodsCategory s){
        return goodsCategoryService.add(s);
    }

    @ApiOperation(value = "修改数据")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result update(@RequestBody SmartAppGoodsCategory s){
        return goodsCategoryService.update(s);
    }

    @ApiOperation(value = "通过id删除数据")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public Result delete(@PathVariable("id") long id){
        return goodsCategoryService.delete(id);
    }
}
