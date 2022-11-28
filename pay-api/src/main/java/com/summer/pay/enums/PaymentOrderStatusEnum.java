package com.summer.pay.enums;

import lombok.Getter;

/**
 * 支付单状态枚举
 *
 * @author summer
 */
@Getter
public enum PaymentOrderStatusEnum {

    /**
     * 未支付
     */
    UN_PAY(0, "未支付"),
    SUCCESS(1, "支付成功"),
    REFUND(2, "转入退款"),
    CLOSED(3, "已关闭"),
    REVOKED(4, "已撤销"),
    PAYING(5, "支付中"),
    PAY_ERROR(6, "支付失败");

    private final Integer paymentOrderStatus;
    private final String paymentOrderStatusDesc;

    PaymentOrderStatusEnum(Integer paymentOrderStatus, String paymentOrderStatusDesc) {
        this.paymentOrderStatus = paymentOrderStatus;
        this.paymentOrderStatusDesc = paymentOrderStatusDesc;
    }

    //根据支付单状态获取描述
    public static String getPaymentOrderStatusDesc(Integer paymentOrderStatus) {
        for (PaymentOrderStatusEnum status : PaymentOrderStatusEnum.values()) {
            if (status.getPaymentOrderStatus().equals(paymentOrderStatus)) {
                return status.getPaymentOrderStatusDesc();
            }
        }
        return null;
    }

    public static PaymentOrderStatusEnum getPaymentOrderStatusEnum(Integer paymentOrderStatus) {
        for (PaymentOrderStatusEnum status : PaymentOrderStatusEnum.values()) {
            if (status.getPaymentOrderStatus().equals(paymentOrderStatus)) {
                return status;
            }
        }
        return null;
    }
}
