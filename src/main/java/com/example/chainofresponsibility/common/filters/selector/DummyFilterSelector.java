package com.example.chainofresponsibility.common.filters.selector;

import java.util.List;

/**
 * @author gim
 */
public class DummyFilterSelector implements FilterSelector {

    @Override
    public boolean matchFilter(String currentFilterName) {
        return false;
    }

    @Override
    public List<String> getFilterNames() {
        return null;
    }
}
