package com.summer.pay.enums;

import lombok.Getter;

/**
 * 支付单下单类型枚举
 *
 * @author summer
 */
@Getter
public enum PaymentOrderTradeTypeEnum {

    /**
     * 付款
     */
    PAYMENT(0, "付款"),
    REFUND(1, "退款");

    private final Integer paymentOrderTradeType;
    private final String paymentOrderTradeTypeDesc;

    PaymentOrderTradeTypeEnum(Integer paymentOrderTradeType, String paymentOrderTradeTypeDesc) {
        this.paymentOrderTradeType = paymentOrderTradeType;
        this.paymentOrderTradeTypeDesc = paymentOrderTradeTypeDesc;
    }

    /**
     * 根据支付单下单类型获取描述
     * @param paymentOrderTradeType paymentOrderTradeType
     * @return paymentOrderTradeTypeDesc
     */
    public static String getPaymentOrderTradeTypeDesc(Integer paymentOrderTradeType) {
        for (PaymentOrderTradeTypeEnum type : PaymentOrderTradeTypeEnum.values()) {
            if (type.getPaymentOrderTradeType().equals(paymentOrderTradeType)) {
                return type.getPaymentOrderTradeTypeDesc();
            }
        }
        return null;
    }
}
