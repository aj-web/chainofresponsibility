package com.example.chainofresponsibility.common.filters;


import com.example.chainofresponsibility.common.model.OrderContext;

/**
 * @author gim
 */
public interface OrderFilter<T extends OrderContext> {

    /**
     * 过滤逻辑封装点
     *
     * @param context
     * @param chain
     */
    void doFilter(T context, OrderFilterChain chain);


}
