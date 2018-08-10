package com.atguigu.gmall.bean.enums;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.bean
 * @className PaymentWay
 * @Date 2018/8/4 - 15:24
 */
public enum PaymentWay {

    ONLINE("在线支付"),
    OUTLINE("货到付款");

    private String comment;

    PaymentWay(String comment){
        this.comment = comment;
    }

    public String getComment(){
        return comment;
    }

    public void setComment(String comment){
        this.comment = comment;
    }
}
