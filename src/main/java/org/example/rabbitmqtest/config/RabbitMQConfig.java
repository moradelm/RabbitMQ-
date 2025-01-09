package org.example.rabbitmqtest.config;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    // Queues
    @Bean
    public Queue orderQueue() {
        return new Queue("orderQueue", false);
    }

    @Bean
    public Queue paymentQueue() {
        return new Queue("paymentQueue", false);
    }

    @Bean
    public Queue notificationQueue() {
        return new Queue("notificationQueue", false);
    }

    @Bean
    public Queue shippingQueue() {
        return new Queue("shippingQueue", false);
    }

    // Topic Exchange
    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("ecommerceExchange");
    }

    // Bindings
    @Bean
    public Binding bindingOrder(Queue orderQueue, TopicExchange exchange) {
        return BindingBuilder.bind(orderQueue).to(exchange).with("order.*");
    }

    @Bean
    public Binding bindingPayment(Queue paymentQueue, TopicExchange exchange) {
        return BindingBuilder.bind(paymentQueue).to(exchange).with("payment.*");
    }

    @Bean
    public Binding bindingNotification(Queue notificationQueue, TopicExchange exchange) {
        return BindingBuilder.bind(notificationQueue).to(exchange).with("notification.*");
    }

    @Bean
    public Binding bindingShipping(Queue shippingQueue, TopicExchange exchange) {
        return BindingBuilder.bind(shippingQueue).to(exchange).with("shipping.*");
    }
}