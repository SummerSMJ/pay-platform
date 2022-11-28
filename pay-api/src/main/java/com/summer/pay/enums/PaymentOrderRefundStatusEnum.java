package com.summer.pay.enums;

import lombok.Getter;

/**
 * 支付单退款状态枚举
 *
 * @author summer
 */
@Getter
public enum PaymentOrderRefundStatusEnum {

    /**
     * 未退款
     */
    UN_REFUND(0, "未退款"),
    PARTIAL_REFUND(1, "部分退款"),
    FULL_REFUND(2, "全部退款");

    private final Integer paymentOrderRefundStatus;
    private final String paymentOrderRefundStatusDesc;

    PaymentOrderRefundStatusEnum(Integer paymentOrderRefundStatus, String paymentOrderRefundStatusDesc) {
        this.paymentOrderRefundStatus = paymentOrderRefundStatus;
        this.paymentOrderRefundStatusDesc = paymentOrderRefundStatusDesc;
    }

    //根据支付单退款状态获取描述
    public static String getPaymentOrderRefundStatusDesc(Integer paymentOrderRefundStatus) {
        for (PaymentOrderRefundStatusEnum refundStatus : PaymentOrderRefundStatusEnum.values()) {
            if (refundStatus.getPaymentOrderRefundStatus().equals(paymentOrderRefundStatus)) {
                return refundStatus.getPaymentOrderRefundStatusDesc();
            }
        }
        return null;
    }
}
