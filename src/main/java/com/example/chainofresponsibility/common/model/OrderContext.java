package com.example.chainofresponsibility.common.model;


import com.example.chainofresponsibility.common.constants.BizEnum;
import com.example.chainofresponsibility.common.filters.selector.FilterSelector;

/**
 * @author gim
 */
public interface OrderContext {

    /**
     * 获取业务编码
     *
     * @return
     */
    BizEnum getBizCode();

    /**
     * 获取过滤器选择器
     *
     * @return
     */
    FilterSelector getFilterSelector();

    /**
     * 是否继续链
     *
     * @return
     */
    boolean continueChain();


}
