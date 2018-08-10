package com.atguigu.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.bean
 * @className BaseSaleAttr
 * @Date 2018/8/4 - 14:25
 */
public class BaseSaleAttr implements Serializable {

    @Id
    @Column
    private String id;

    @Column
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
