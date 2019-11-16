package com.offcn.b1.impl;

import com.offcn.b1.bservice;

public class bserviceImpl   implements bservice {

    @Override
    public void alipay() {
        System.out.println("111");
    }

    @Override
    public String queryStatus(String out_trade_num) {
        return "222";
    }
}
