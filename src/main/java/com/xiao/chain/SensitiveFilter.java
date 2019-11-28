package com.xiao.chain;

public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request) {
        request.str= request.str.replaceAll("996", "955");
        return true;
    }
}
