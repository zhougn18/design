package com.xiao.chain;

public class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Request request) {
        request.str= request.str.replace(":)","*_*");
       return true;
    }
}
