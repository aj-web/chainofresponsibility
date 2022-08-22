package com.example.chainofresponsibility.domainservice.pipeline.filters;

import com.example.chainofresponsibility.common.filters.AbstractOrderFilter;
import com.example.chainofresponsibility.domainservice.pipeline.context.OrderReceiptContext;
import com.example.chainofresponsibility.domainservice.third.IInvoicePipelineFacadeService;
import com.example.chainofresponsibility.domainservice.third.IInvoicePipelineFacadeServiceImpl;

/**
 * @author : chezj
 * @date : 2022/8/18 0:34
 */

public class SaveExchangeLogFilter extends AbstractOrderFilter<OrderReceiptContext> {


    private final IInvoicePipelineFacadeService facadeService = new IInvoicePipelineFacadeServiceImpl();

    @Override
    protected void handle(OrderReceiptContext orderReceiptContext){

        System.out.println("SaveExchangeLogFilter，记录了操作日志");
    }
}
