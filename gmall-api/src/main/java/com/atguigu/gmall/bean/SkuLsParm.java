package com.atguigu.gmall.bean;

import java.io.Serializable;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.bean
 * @className SkuLsParm
 * @Date 2018/8/4 - 12:39
 */
public class SkuLsParm implements Serializable {
    private String catalog3Id;
    private String[] valueId;
    private String keyword;
    private int pageNo= 1;
    private int pageSize = 20;

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String[] getValueId() {
        return valueId;
    }

    public void setValueId(String[] valueId) {
        this.valueId = valueId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
