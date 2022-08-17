package com.example.chainofresponsibility.common.pipeline;

/**
 * @author gim
 */
public interface Handler<I, O> {

  /**
   * 处理I 返回O
   *
   * @param input
   * @return
   */
  O process(I input);

}
