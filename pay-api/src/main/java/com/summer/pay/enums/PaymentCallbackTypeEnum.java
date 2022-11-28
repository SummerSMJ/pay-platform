package com.summer.pay.enums;

import lombok.Getter;

/**
 * 支付单回调类型枚举
 *
 * @author summer
 */
@Getter
public enum PaymentCallbackTypeEnum {

    /**
     * 支付回调
     */
    PAYMENT(0, "未退款"),
    REFUND(1, "全部退款");

    private final Integer paymentCallbackTypeStatus;
    private final String paymentCallbackTypeStatusDesc;

    PaymentCallbackTypeEnum(Integer paymentCallbackTypeStatus, String paymentCallbackTypeStatusDesc) {
        this.paymentCallbackTypeStatus = paymentCallbackTypeStatus;
        this.paymentCallbackTypeStatusDesc = paymentCallbackTypeStatusDesc;
    }

    //根据支付单回调类型获取描述
    public static String getPaymentCallbackTypeStatusDesc(Integer paymentCallbackTypeStatus) {
        for (PaymentCallbackTypeEnum refundStatus : PaymentCallbackTypeEnum.values()) {
            if (refundStatus.getPaymentCallbackTypeStatus().equals(paymentCallbackTypeStatus)) {
                return refundStatus.getPaymentCallbackTypeStatusDesc();
            }
        }
        return null;
    }
}
