package com.summer.service;

import com.summer.pay.dto.PaymentCallbackDTO;
import com.summer.pay.dto.RefundCallbackDTO;
import com.summer.pay.dto.param.*;
import com.summer.pay.dto.res.*;
import com.summer.pay.enums.PayChannelEnum;
import com.summer.pay.service.PayChannelService;

/**
 * @author summer
 */
public class PayChannelServiceImpl implements PayChannelService {
    @Override
    public PayChannelEnum getCode() {
        return null;
    }

    @Override
    public String generateOrderNumber() {
        return null;
    }

    @Override
    public UnifiedOrderResDTO unifiedOrder(UnifiedOrderParamsDTO unifiedOrderParamsDTO) {
        return null;
    }

    @Override
    public OrderQueryResDTO orderQuery(OrderQueryParamsDTO orderQueryParamsDTO) {
        return null;
    }

    @Override
    public CloseOrderResDTO closeOrder(CloseOrderParamsDTO closeOrderParamsDTO) {
        return null;
    }

    @Override
    public RefundResDTO refund(RefundParamsDTO refundParamsDTO) {
        return null;
    }

    @Override
    public RefundCallbackResDTO refundQuery(RefundQueryParamsDTO refundQueryParamsDTO) {
        return null;
    }

    @Override
    public PaymentCallbackResDTO paymentCallback(PaymentCallbackDTO paymentCallbackDTO) {
        return null;
    }

    @Override
    public RefundCallbackResDTO refundCallback(RefundCallbackDTO refundCallbackDTO) {
        return null;
    }
}
