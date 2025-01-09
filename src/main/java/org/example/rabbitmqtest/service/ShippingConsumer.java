package org.example.rabbitmqtest.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ShippingConsumer {

    @RabbitListener(queues = "shippingQueue")
    public void processShipping(String message) {
        System.out.println("Processing Shipping: " + message);
    }
}
