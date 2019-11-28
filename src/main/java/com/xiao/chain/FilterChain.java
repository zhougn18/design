package com.xiao.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式
 * 比如一个请求经过多个filter 一个接着一个执行  直到所有节点都执行结束
 * 如 对 "大家好:)，<script>，欢迎访问 www.aa.com ，大家都是996"  这句话进行多个过滤执行
 * 最终结果为  "大家好*_*，[script]，欢迎访问 www.aa.com ，大家都是995"
 */
public class FilterChain {
    List<Filter> filterList = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    public void doFitler(Request request){
        for (Filter  f: filterList) {
            boolean res = f.doFilter(request);
            if (!res) {
                break;
            }
        }
    }
}
