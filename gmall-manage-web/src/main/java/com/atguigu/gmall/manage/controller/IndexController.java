package com.atguigu.gmall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.manage.controller
 * @className IndexController
 * @Date 2018/8/1 - 12:15
 */
@Controller
public class IndexController {

    @RequestMapping("spuListPage")
    public String spuListPage(){
        return "spuListPage";
    }

    @RequestMapping("attrListPage")
    public String attrListPage(){
        return "attrListPage";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
