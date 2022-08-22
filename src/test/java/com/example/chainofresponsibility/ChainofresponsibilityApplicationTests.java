package com.example.chainofresponsibility;

import com.example.chainofresponsibility.common.constants.BizEnum;
import com.example.chainofresponsibility.common.filters.selector.LocalListBasedFilterSelector;
import com.example.chainofresponsibility.domainservice.model.OrderRegisterModel;
import com.example.chainofresponsibility.domainservice.pipeline.FilterChainPipeline;
import com.example.chainofresponsibility.domainservice.pipeline.context.OrderReceiptContext;
import com.example.chainofresponsibility.domainservice.pipeline.filters.CustomerInfoCheckFilter;
import com.example.chainofresponsibility.domainservice.pipeline.filters.SaveExchangeLogFilter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChainofresponsibilityApplicationTests {

    @Test
    void contextLoads() {

        //可以从spring中获取，这个可以固定死注入spring，每个pipeline对应一个业务抽象，例如下订单
        FilterChainPipeline filterChainPipeline = new FilterChainPipeline();
        filterChainPipeline.addFilter(new CustomerInfoCheckFilter());
        filterChainPipeline.addFilter(new SaveExchangeLogFilter());

        //创建selector,可以创建不同的selector，发票selector或者结算selecotr，每个selector里面可以放不同的filter
        LocalListBasedFilterSelector localListBasedFilterSelector = new LocalListBasedFilterSelector();
        localListBasedFilterSelector.addFilter(CustomerInfoCheckFilter.class.getSimpleName());
        localListBasedFilterSelector.addFilter(SaveExchangeLogFilter.class.getSimpleName());

        //模拟业务开始调用
        //获取服务传过来的model,此处为订单服务，也就是对应的订单表对象
        OrderRegisterModel model = new OrderRegisterModel();

        //创建上下文对象，
        OrderReceiptContext orderReceiptContext = new OrderReceiptContext(BizEnum.BIZ_XXX, localListBasedFilterSelector);
        orderReceiptContext.setModel(model);
        //进行处理
        filterChainPipeline.getFilterChain().handle(orderReceiptContext);
        System.out.println(orderReceiptContext.getRegisteResultrModel());
    }

}
