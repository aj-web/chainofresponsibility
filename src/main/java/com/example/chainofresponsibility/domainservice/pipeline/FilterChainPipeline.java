package com.example.chainofresponsibility.domainservice.pipeline;

import com.example.chainofresponsibility.common.filters.DefaultFilterChain;
import com.example.chainofresponsibility.common.filters.OrderFilter;

/**
 * @author : chezj
 * @date : 2022/8/18 0:26
 */
public class FilterChainPipeline<T extends OrderFilter> {

    private DefaultFilterChain last;

    public FilterChainPipeline() {
    }

    public DefaultFilterChain getFilterChain() {
        return last;
    }

    public FilterChainPipeline addFilter(T filter) {
        DefaultFilterChain newChain = new DefaultFilterChain(this.last, filter);
        this.last = newChain;
        return this;
    }

    public FilterChainPipeline addFilter(String desc, T filter) {
        DefaultFilterChain newChain = new DefaultFilterChain(this.last, filter);
        this.last = newChain;
        return this;
    }
}
