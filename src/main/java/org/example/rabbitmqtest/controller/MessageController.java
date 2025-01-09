package org.example.rabbitmqtest.controller;


import org.example.rabbitmqtest.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


    private final MessageProducer messageProducer;

    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @GetMapping("/send-order")
    public String sendOrder(@RequestParam String message) {
        messageProducer.sendOrderMessage(message);
        return "Order message sent!";
    }

    @GetMapping("/send-payment")
    public String sendPayment(@RequestParam String message) {
        messageProducer.sendPaymentMessage(message);
        return "Payment message sent!";
    }

    @GetMapping("/send-notification")
    public String sendNotification(@RequestParam String message) {
        messageProducer.sendNotificationMessage(message);
        return "Notification message sent!";
    }

    @GetMapping("/send-shipping")
    public String sendShipping(@RequestParam String message) {
        messageProducer.sendShippingMessage(message);
        return "Shipping message sent!";
    }
}