package com.example.chainofresponsibility.domainservice;

import com.example.chainofresponsibility.domainservice.model.OrderRegisterModel;
import com.example.chainofresponsibility.domainservice.model.OrderRegisterResultModel;
import org.springframework.stereotype.Service;

/**
 * @author : chezj
 * @date : 2022/8/18 0:48
 */
@Service
public interface IOrderReceiptDomainService {


    /**
     * 注册凭证
     */
    OrderRegisterResultModel orderRegister(OrderRegisterModel registerModel);


}
