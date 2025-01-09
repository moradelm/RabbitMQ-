package org.example.rabbitmqtest.service;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @RabbitListener(queues = "notificationQueue")
    public void sendNotification(String message) {
        System.out.println("Sending Notification: " + message);
    }
}