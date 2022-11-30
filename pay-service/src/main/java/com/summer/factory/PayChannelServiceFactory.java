package com.summer.factory;

import com.summer.pay.enums.PayChannelEnum;
import com.summer.pay.service.PayChannelService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 */
@Component
public class PayChannelServiceFactory implements ApplicationContextAware {

    private static Map<PayChannelEnum, PayChannelService> payChannelServiceMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, PayChannelService> map = applicationContext.getBeansOfType(PayChannelService.class);
        payChannelServiceMap = new HashMap<>(16);
        map.forEach((key, value) -> payChannelServiceMap.put(value.getCode(), value));
    }

    public PayChannelService getPayChannelService(PayChannelEnum typeEnum) {
        return payChannelServiceMap.get(typeEnum);
    }
}