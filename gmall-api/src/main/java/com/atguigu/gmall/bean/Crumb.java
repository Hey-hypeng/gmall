package com.atguigu.gmall.bean;

import java.io.Serializable;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.bean
 * @className Crumb
 * @Date 2018/8/4 - 15:07
 */
public class Crumb implements Serializable {

    private String valueName;

    private String urlParam;

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getUrlParam() {
        return urlParam;
    }

    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }
}
