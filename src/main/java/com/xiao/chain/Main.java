package com.xiao.chain;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str ="大家好:)，<script>，欢迎访问 www.aa.com ，大家都是996 ";
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter()).add(new SensitiveFilter()).add(new FaceFilter());
        filterChain.doFitler(request);
        System.out.println(request.str);
    }
}
