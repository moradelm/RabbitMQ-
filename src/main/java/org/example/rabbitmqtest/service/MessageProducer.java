package org.example.rabbitmqtest.service;

import org.example.rabbitmqtest.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RabbitMQConfig rabbitMQConfig;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(rabbitMQConfig.myQueue().getName(), message);
        System.out.println("Sent: " + message);
    }
}
