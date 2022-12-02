package com.summer.service;

import com.summer.pay.dto.CreatePaymentOrderDTO;
import com.summer.pay.dto.PaymentCallbackDTO;
import com.summer.pay.dto.PaymentCashierConfigDTO;
import com.summer.pay.dto.RefundCallbackDTO;
import com.summer.pay.dto.param.*;
import com.summer.pay.dto.res.*;
import com.summer.pay.service.PayService;

import java.util.List;

/**
 * @author summer
 */
public class PayServiceImpl implements PayService {


    @Override
    public Long createPaymentOrder(CreatePaymentOrderDTO paymentOrderDTO) {
        return null;
    }

    @Override
    public List<PaymentCashierConfigDTO> getPaymentCashier(String businessCode, String env) {
        return null;
    }

    @Override
    public GetPaymentInfoResDTO getPaymentInfo(GetPaymentParamsDTO getPaymentParamsDTO) {
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
    public RefundResDTO refund(PaymentRefundParamsDTO paymentRefundParamsDTO) {
        return null;
    }

    @Override
    public RefundQueryResDTO refundQuery(RefundQueryParamsDTO refundQueryParamsDTO) {
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
