package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseSaleAttr;
import com.atguigu.gmall.bean.SpuImage;
import com.atguigu.gmall.bean.SpuInfo;
import com.atguigu.gmall.bean.SpuSaleAttr;
import com.atguigu.gmall.manage.utils.MyUploadUtil;
import com.atguigu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.manage.controller
 * @className SpuController
 * @Date 2018/8/6 - 16:31
 */
@Controller
public class SpuController {

    @Reference
    private SpuService spuService;

    @RequestMapping("getSaleAttrListBySpuId")
    @ResponseBody
    public List<SpuSaleAttr> getSaleAttrListBySpuId(String spuId){
        return spuService.getSaleAttrListBySpuId(spuId);
    }

    @RequestMapping("spuList")
    @ResponseBody
    public List<SpuInfo> spuList(String catalog3Id){
        return spuService.spuList(catalog3Id);
    }

    @RequestMapping("baseSaleAttrList")
    @ResponseBody
    public List<BaseSaleAttr> baseSaleAttrList(){
        return spuService.baseSaleAttrList();
    }

    @RequestMapping("saveSpu")
    @ResponseBody
    public String saveSpu(SpuInfo spuInfo){
        spuService.saveSpu(spuInfo);
        return "success";
    }

    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile file){
        // fdfs的上传工具
        String imgUrl = MyUploadUtil.uploadImage(file);
        
        return imgUrl;
    }

    @RequestMapping("getSpuImageListBySpuId")
    @ResponseBody
    public List<SpuImage> getSpuImageListBySpuId(String spuId){
        return spuService.getSpuImageListBySpuId(spuId);
    }

}
