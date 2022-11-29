package com.summer.pay.service;

import com.summer.pay.dto.PaymentCallbackDTO;
import com.summer.pay.dto.RefundCallbackDTO;
import com.summer.pay.dto.param.*;
import com.summer.pay.dto.res.*;
import com.summer.pay.enums.PayChannelEnum;

/**
 * 支付渠道相关
 *
 * @author summer
 */
public interface PayChannelService {

    /**
     * 实现类路由标识
     *
     * @return 路由标识
     */
    PayChannelEnum getCode();

    /**
     * 生成三方支付单号
     *
     * @return 支付单号
     */
    String generateOrderNumber();

    /**
     * 统一下单
     *
     * @param unifiedOrderParamsDTO unifiedOrderParamsDTO
     * @return UnifiedOrderResDTO
     */
    UnifiedOrderResDTO unifiedOrder(UnifiedOrderParamsDTO unifiedOrderParamsDTO);

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
     * @param refundParamsDTO refundParamsDTO
     * @return RefundResDTO
     */
    RefundResDTO refund(RefundParamsDTO refundParamsDTO);

    /**
     * 查询退款
     *
     * @param refundQueryParamsDTO 三方单号
     * @return RefundQueryResDTO
     */
    RefundCallbackResDTO refundQuery(RefundQueryParamsDTO refundQueryParamsDTO);

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
