package com.xiao.chain;

public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Request request) {
        request.str=request.str.replace("<", "[").replace(">", "]");
        return true;
    }
}
