package com.example.chainofresponsibility.common.filters;


import com.example.chainofresponsibility.common.model.OrderContext;

/**
 * @author gim
 */
public interface OrderFilterChain<T extends OrderContext> {


  /**
   * 订单上送支付处理流程
   * @param context
   */
  void handle(T context);

  /**
   * 开启下一个鉴权
   * @param ctx
   */
  void fireNext(T ctx);

}
