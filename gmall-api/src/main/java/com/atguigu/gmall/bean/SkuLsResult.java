package com.atguigu.gmall.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.bean
 * @className SkuLsResult
 * @Date 2018/8/4 - 12:44
 */
public class SkuLsResult implements Serializable {
    private List<SkuLsInfo> skuLsInfoList;

    private int Total;

    private List<String> valueIdList;

    public List<SkuLsInfo> getSkuLsInfoList() {
        return skuLsInfoList;
    }

    public void setSkuLsInfoList(List<SkuLsInfo> skuLsInfoList) {
        this.skuLsInfoList = skuLsInfoList;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public List<String> getValueIdList() {
        return valueIdList;
    }

    public void setValueIdList(List<String> valueIdList) {
        this.valueIdList = valueIdList;
    }
}
