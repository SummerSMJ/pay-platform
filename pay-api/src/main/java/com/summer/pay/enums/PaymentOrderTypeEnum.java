package com.summer.pay.enums;

import lombok.Getter;

/**
 * 支付单类型枚举
 *
 * @author summer
 */
@Getter
public enum PaymentOrderTypeEnum {

    /**
     * 付款单
     */
    PAYMENT_ORDER(0, "付款单"),
    ADVANCED_ORDER(1, "预付单");

    private final Integer paymentOrderType;
    private final String paymentOrderTypeDesc;

    PaymentOrderTypeEnum(Integer paymentOrderType, String paymentOrderTypeDesc) {
        this.paymentOrderType = paymentOrderType;
        this.paymentOrderTypeDesc = paymentOrderTypeDesc;
    }

    //根据支付单类型获取描述
    public static String getPaymentOrderTypeDesc(Integer paymentOrderType) {
        for (PaymentOrderTypeEnum type : PaymentOrderTypeEnum.values()) {
            if (type.getPaymentOrderType().equals(paymentOrderType)) {
                return type.getPaymentOrderTypeDesc();
            }
        }
        return null;
    }
}
