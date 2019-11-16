package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SendMsgController {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    //发出消息
    @RequestMapping("/sendMsg")
    public String sendMsg(String msg){
        jmsMessagingTemplate.convertAndSend("mq-test001",msg);
        return "send-ok";
    }

    //发送map
    @RequestMapping("/sendMap")
    public String sendMap(){
        Map map = new HashMap();
        map.put("name","张茂");
        map.put("phone","111111");
        map.put("address","南京");
        jmsMessagingTemplate.convertAndSend("mq-test002",map);
        return "sendMap-ok";
    }
}
