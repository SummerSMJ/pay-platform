package com.summer.pay.service;

import com.summer.pay.dto.CreatePaymentOrderDTO;
import com.summer.pay.dto.PaymentCallbackDTO;
import com.summer.pay.dto.PaymentCashierConfigDTO;
import com.summer.pay.dto.RefundCallbackDTO;
import com.summer.pay.dto.param.*;
import com.summer.pay.dto.res.*;

import java.util.List;

/**
 * 支付接口
 *
 * @author summer
 */
public interface PayService {

    /**
     * 创建支付单
     *
     * @param paymentOrderDTO paymentOrderDTO
     * @return long 支付单id
     */
    Long createPaymentOrder(CreatePaymentOrderDTO paymentOrderDTO);

    /**
     * 收银台
     *
     * @param businessCode 业务code
     * @param env          触点
     * @return 返回收银台列表
     */
    List<PaymentCashierConfigDTO> getPaymentCashier(String businessCode, String env);

    /**
     * 收银台根据渠道获取支付参数
     *
     * @param getPaymentParamsDTO getPaymentParamsDTO
     * @return PaymentParamsDTO
     */
    GetPaymentInfoResDTO getPaymentInfo(GetPaymentParamsDTO getPaymentParamsDTO);

    /**
     * 查询订单
     *
     * @param orderQueryParamsDTO orderQueryParamsDTO
     * @return OrderQueryResDTO
     */
    OrderQueryResDTO orderQuery(OrderQueryParamsDTO orderQueryParamsDTO);

    /**
     * 关闭订单
     *
     * @param closeOrderParamsDTO closeOrderParamsDTO
     * @return CloseOrderResDTO
     */
    CloseOrderResDTO closeOrder(CloseOrderParamsDTO closeOrderParamsDTO);

    /**
     * 申请退款
     *
     * @param paymentRefundParamsDTO paymentRefundParamsDTO
     * @return RefundResDTO
     */
    RefundResDTO refund(PaymentRefundParamsDTO paymentRefundParamsDTO);

    /**
     * 查询退款
     *
     * @param refundQueryParamsDTO 三方单号
     * @return RefundQueryResDTO
     */
    RefundQueryResDTO refundQuery(RefundQueryParamsDTO refundQueryParamsDTO);

    /**
     * 支付回调
     *
     * @param paymentCallbackDTO paymentCallbackDTO
     * @return PaymentCallbackResDTO
     */
    PaymentCallbackResDTO paymentCallback(PaymentCallbackDTO paymentCallbackDTO);

    /**
     * 退款回调
     *
     * @param refundCallbackDTO refundCallbackDTO
     * @return RefundCallbackResDTO
     */
    RefundCallbackResDTO refundCallback(RefundCallbackDTO refundCallbackDTO);
}
