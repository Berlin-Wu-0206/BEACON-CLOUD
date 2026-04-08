package com.mashibing.smsgateway.mq;

import com.mashibing.common.model.StandardSubmit;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * @author zjw
 * @description
 */
@Component
@Slf4j
public class SmsGatewayListener {

    @RabbitListener(queues = "${gateway.sendtopic}",containerFactory = "gatewayContainerFactory")
    public void consume(StandardSubmit submit, Channel channel, Message message) throws IOException, InterruptedException {
        log.info("【短信网关模块】 接收到消息 submit = {}",submit);
        // =====================完成运营商交互，发送一次请求，接收两次响应==========================
        channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
    }


}
