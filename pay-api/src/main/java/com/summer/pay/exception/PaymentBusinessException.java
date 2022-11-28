package com.summer.pay.exception;

import com.summer.pay.enums.PaymentExceptionCodeEnum;

/**
 * 支付异常类
 *
 * @author summer
 */
public class PaymentBusinessException extends RuntimeException {
    private static final long serialVersionUID = 2332608236621015981L;

    private String code;
    private PaymentExceptionCodeEnum paymentExceptionCodeEnum;

    public PaymentBusinessException(PaymentExceptionCodeEnum paymentExceptionCodeEnum, Throwable cause) {
        super(cause);
        this.paymentExceptionCodeEnum = paymentExceptionCodeEnum;
    }

    public PaymentBusinessException(Throwable cause) {
        super(cause);
    }

    public PaymentBusinessException(String message) {
        super(message);
    }

    public PaymentBusinessException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public PaymentBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PaymentExceptionCodeEnum getPaymentExceptionCodeEnum() {
        return paymentExceptionCodeEnum;
    }

    public void setPaymentExceptionCodeEnum(PaymentExceptionCodeEnum paymentExceptionCodeEnum) {
        this.paymentExceptionCodeEnum = paymentExceptionCodeEnum;
    }

}
