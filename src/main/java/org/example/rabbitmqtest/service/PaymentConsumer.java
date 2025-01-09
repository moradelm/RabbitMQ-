package org.example.rabbitmqtest.service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {

    @RabbitListener(queues = "paymentQueue")
    public void processPayment(String message) {
        System.out.println("Processing Payment: " + message);
    }
}
