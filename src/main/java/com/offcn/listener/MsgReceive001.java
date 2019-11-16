package com.offcn.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MsgReceive001 {
    @JmsListener(destination = "mq-test001")
    public void receiveMsg(String msg){
        System.out.println(msg+"接收到消息");
    }

    //接收map
    @JmsListener(destination = "mq-test002")
    public void receiveMap(Map map){
        System.out.println("接收到map:"+map.get("name")+":"+map.get("phone")+":"+map.get("address"));
    }
}
