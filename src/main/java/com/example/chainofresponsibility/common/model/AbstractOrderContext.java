package com.example.chainofresponsibility.common.model;


import com.example.chainofresponsibility.common.constants.BizEnum;
import com.example.chainofresponsibility.common.filters.selector.FilterSelector;

/**
 * @author gim
 */
public abstract class AbstractOrderContext implements OrderContext{

  private final BizEnum bizEnum;
  private final FilterSelector selector;

  public AbstractOrderContext(BizEnum bizEnum, FilterSelector selector) {
    this.bizEnum = bizEnum;
    this.selector = selector;
  }

  @Override
  public BizEnum getBizCode() {
    return bizEnum;
  }

  @Override
  public FilterSelector getFilterSelector() {
    return selector;
  }
}
