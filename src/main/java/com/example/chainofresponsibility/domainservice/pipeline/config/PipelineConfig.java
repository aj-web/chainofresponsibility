package com.example.chainofresponsibility.domainservice.pipeline.config;

import com.example.chainofresponsibility.domainservice.pipeline.FilterChainPipeline;
import com.example.chainofresponsibility.domainservice.pipeline.filters.CustomerInfoCheckFilter;
import com.example.chainofresponsibility.domainservice.pipeline.filters.SaveExchangeLogFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : chezj
 * @date : 2022/8/18 0:27
 */
@Configuration
public class PipelineConfig {

    /**
     * 管道
     * 例如：订单处理pipeline
     */
    @Bean
    public FilterChainPipeline orderRegisterPipeline(){
        FilterChainPipeline filterChainPipeline = new FilterChainPipeline();
        filterChainPipeline.addFilter(new CustomerInfoCheckFilter());
        return filterChainPipeline;
    }


    /**
     * 凭据开票pipeline
     */
    @Bean
    public FilterChainPipeline exchangeInvoicePipeline(){
        FilterChainPipeline filterChainPipeline = new FilterChainPipeline();
//        filterChainPipeline.add....
        return filterChainPipeline;
    }


    @Bean
    public CustomerInfoCheckFilter customerInfoCheckFilter(){
        return new CustomerInfoCheckFilter();
    }

    @Bean
    public SaveExchangeLogFilter saveExchangeLogFilter(){
        return new SaveExchangeLogFilter();
    }
}
