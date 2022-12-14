package com.example.chainofresponsibility.common.filters.selector;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author gim
 */
public class LocalListBasedFilterSelector implements FilterSelector {

    private List<String> filterNames = new ArrayList<>();

    @Override
    public boolean matchFilter(String classSimpleName) {
        return filterNames.stream().anyMatch(s -> Objects.equals(s, classSimpleName));
    }

    @Override
    public List<String> getFilterNames() {
        return filterNames;
    }

    public void addFilter(String clsNames) {
        filterNames.add(clsNames);
    }

    public void addFilters(List<String> filterNames) {
        filterNames.addAll(filterNames);
    }

    public LocalListBasedFilterSelector() {
    }

    public LocalListBasedFilterSelector(List<String> filterNames) {
        this.filterNames = filterNames;
    }
}
