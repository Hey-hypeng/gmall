package com.atguigu.gmall.bean;

import java.io.Serializable;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.bean
 * @className SkuLsAttrValue
 * @Date 2018/8/4 - 12:31
 */
public class SkuLsAttrValue implements Serializable {

    private String valueId;

    public String getValueId(){
        return valueId;
    }

    public void setValueId(String valueId){
        this.valueId = valueId;
    }
}
