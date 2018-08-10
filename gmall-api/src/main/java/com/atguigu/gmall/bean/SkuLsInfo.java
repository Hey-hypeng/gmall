package com.atguigu.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.bean
 * @className SkuLsInfo
 * @Date 2018/8/4 - 12:19
 */
public class SkuLsInfo implements Serializable {

    @Id
    @Column
    private String id;

    @Column
    private BigDecimal price;

    @Column
    private String skuName;

    @Column
    private String skuDesc;

    @Column
    private String catalog3Id;

    @Column
    private String skuDefaultImg;

    @Column
    private Long hotScore=0L;

    @Column
    private List<SkuLsAttrValue> skuLsAttrValueList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    public Long getHotScore() {
        return hotScore;
    }

    public void setHotScore(Long hotScore) {
        this.hotScore = hotScore;
    }

    public List<SkuLsAttrValue> getSkuLsAttrValueList() {
        return skuLsAttrValueList;
    }

    public void setSkuLsAttrValueList(List<SkuLsAttrValue> skuLsAttrValueList) {
        this.skuLsAttrValueList = skuLsAttrValueList;
    }

}
