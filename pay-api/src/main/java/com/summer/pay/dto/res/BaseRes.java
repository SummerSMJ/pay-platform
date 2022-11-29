package com.summer.pay.dto.res;

import lombok.Data;

/**
 * @author summer
 */
@Data
public class BaseRes {

    /**
     * 只是代表调用成功  业务是否执行成功需要异步回调
     */
    private Boolean isSuccess;

    private String msg;

}
