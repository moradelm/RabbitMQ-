package org.example.rabbitmqtest.service;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @RabbitListener(queues = "myQueue") // Use the queue name directly
    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
    }
}