package org.example.rabbitmqtest.service;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @RabbitListener(queues = "orderQueue")
    public void processOrder(String message) {
        System.out.println("Processing Order: " + message);
    }
}