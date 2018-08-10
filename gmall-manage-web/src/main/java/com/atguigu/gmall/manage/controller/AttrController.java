package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseAttrInfo;
import com.atguigu.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.manage.controller
 * @className AttrController
 * @Date 2018/8/1 - 21:25
 */
@Controller
public class AttrController {

    @Reference
    private AttrService attrService;

    @RequestMapping("saveAttr")
    @ResponseBody
    public String saveAttr(BaseAttrInfo baseAttrInfo){
        attrService.saveAttr(baseAttrInfo);
        return "success";
    }

    @RequestMapping("getAttrList")
    @ResponseBody
    public List<BaseAttrInfo> getAttrList(String catalog3Id){
        return attrService.getAttrList(catalog3Id);
    }

    @RequestMapping("getAttrListByCtg3Id")
    @ResponseBody
    public List<BaseAttrInfo> getAttrListByCtg3Id(String catalog3Id){
        return attrService.getAttrListByCtg3Id(catalog3Id);
    }
}
