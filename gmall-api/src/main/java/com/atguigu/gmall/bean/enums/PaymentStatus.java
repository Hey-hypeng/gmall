package com.atguigu.gmall.bean.enums;

public enum PaymentStatus {

    UNPAID("支付中"),
    PAID("已支付"),
    PAY_FALL("支付失败"),
    CLOSED("已关闭");

    private String name;

    PaymentStatus(String name) {
        this.name = name;
    }
}
