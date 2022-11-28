package com.summer.pay.enums;

import lombok.Getter;

/**
 * 支付单流水状态枚举
 *
 * @author summer
 */
@Getter
public enum PaymentOrderDetailStatusEnum {

    /**
     * 未支付
     */
    UN_PAY(0, "待支付"),
    PAYING(1, "支付中"),
    SUCCESS(2, "支付成功"),
    PAY_ERROR(3, "支付失败"),
    REVOKED(4, "支付取消"),
    CLOSED(5, "已关闭");

    private final Integer paymentOrderStatus;
    private final String paymentOrderStatusDesc;

    PaymentOrderDetailStatusEnum(Integer paymentOrderStatus, String paymentOrderStatusDesc) {
        this.paymentOrderStatus = paymentOrderStatus;
        this.paymentOrderStatusDesc = paymentOrderStatusDesc;
    }

    /**
     * 根据支付单流水状态获取描述
     */
    public static String getPaymentOrderStatusDesc(Integer paymentOrderStatus) {
        for (PaymentOrderDetailStatusEnum status : PaymentOrderDetailStatusEnum.values()) {
            if (status.getPaymentOrderStatus().equals(paymentOrderStatus)) {
                return status.getPaymentOrderStatusDesc();
            }
        }
        return null;
    }
}
