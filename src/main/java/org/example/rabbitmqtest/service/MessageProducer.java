package org.example.rabbitmqtest.service;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendOrderMessage(String message) {
        rabbitTemplate.convertAndSend("ecommerceExchange", "order.created", message);
        System.out.println("Sent Order Message: " + message);
    }

    public void sendPaymentMessage(String message) {
        rabbitTemplate.convertAndSend("ecommerceExchange", "payment.processed", message);
        System.out.println("Sent Payment Message: " + message);
    }

    public void sendNotificationMessage(String message) {
        rabbitTemplate.convertAndSend("ecommerceExchange", "notification.sent", message);
        System.out.println("Sent Notification Message: " + message);
    }

    public void sendShippingMessage(String message) {
        rabbitTemplate.convertAndSend("ecommerceExchange", "shipping.processed", message);
        System.out.println("Sent Shipping Message: " + message);
    }
}