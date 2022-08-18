package com.example.chainofresponsibility.domainservice.pipeline.context;

import com.example.chainofresponsibility.common.constants.BizEnum;
import com.example.chainofresponsibility.common.filters.selector.FilterSelector;
import com.example.chainofresponsibility.common.model.AbstractOrderContext;
import com.example.chainofresponsibility.domainservice.model.OrderRegisterModel;
import com.example.chainofresponsibility.domainservice.model.OrderRegisterResultModel;

/**
 * 接受订单对象
 * @author : chezj
 * @date : 2022/8/18 0:41
 */
public class OrderReceiptContext extends AbstractOrderContext {

    private boolean continueFlag = true;
    private boolean preview = true;


    private OrderRegisterModel model;

    private OrderRegisterResultModel registeResultrModel;


    public OrderReceiptContext(BizEnum bizEnum, FilterSelector filterSelector) {
        super(bizEnum,filterSelector);

    }


    @Override
    public boolean continueChain(){
        return continueFlag;
    }


    public OrderRegisterModel getModel() {
        return model;
    }

    public void setModel(OrderRegisterModel model) {
        this.model = model;
    }

    public OrderRegisterResultModel getRegisteResultrModel() {
        return registeResultrModel;
    }

    public void setRegisteResultrModel(OrderRegisterResultModel registeResultrModel) {
        this.registeResultrModel = registeResultrModel;
    }
}
