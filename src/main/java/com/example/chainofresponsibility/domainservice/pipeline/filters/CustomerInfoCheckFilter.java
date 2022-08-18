package com.example.chainofresponsibility.domainservice.pipeline.filters;

import com.example.chainofresponsibility.common.filters.AbstractOrderFilter;
import com.example.chainofresponsibility.domainservice.pipeline.context.OrderReceiptContext;

/**
 * @author : chezj
 * @date : 2022/8/18 0:30
 */

/**
 * 客户信息检查
 */
public class CustomerInfoCheckFilter extends AbstractOrderFilter<OrderReceiptContext> {


//    private final IInvoicePipelineFacadeService facadeService;


    @Override
    protected void handle(OrderReceiptContext orderReceiptContext){

        System.out.println("执行了CustomerInfoCheckFilter，检查了客户信息");
    }
}
