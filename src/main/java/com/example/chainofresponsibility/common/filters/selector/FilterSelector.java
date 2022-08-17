package com.example.chainofresponsibility.common.filters.selector;

import java.util.List;

/**
 * @author gim
 */
public interface FilterSelector {

  /**
   * filter 匹配
   * @param currentFilterName
   * @return
   */
  boolean matchFilter(String currentFilterName);

  /**
   * 获取所有的filterNames
   * @return
   */
  List<String> getFilterNames();

}
