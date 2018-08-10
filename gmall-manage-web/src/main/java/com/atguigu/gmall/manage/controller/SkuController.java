package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.SkuInfo;
import com.atguigu.gmall.service.SkuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.manage.controller
 * @className SkuController
 * @Date 2018/8/9 - 17:11
 */
@Controller
public class SkuController {

    @Reference
    private SkuService skuService;

    @RequestMapping("getSkuListBySpu")
    @ResponseBody
    public List<SkuInfo> getSkuListBySpu(String spuId){

        return skuService.getSkuListBySpu(spuId);
    }

    @RequestMapping("saveSku")
    @ResponseBody
    public String saveSku(SkuInfo skuInfo){
        skuService.saveSku(skuInfo);
        return "success";
    }

}
