package com.example.chainofresponsibility.common.filters.selector;


import com.example.chainofresponsibility.common.constants.BizEnum;

/**
 * @author gim
 */
public interface BizAware {

  /**
   * 获取当前业务编码
   * @return
   */
  BizEnum getBizCode();
}
