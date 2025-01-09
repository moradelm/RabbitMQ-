Project Title
"E-Commerce Order Processing System with RabbitMQ and Spring Boot"

This title reflects the core functionality of the project: using RabbitMQ to handle asynchronous order processing in an e-commerce system.

Architecture Overview
The project is designed to simulate an e-commerce order processing system using RabbitMQ as the message broker and Spring Boot for building the application. Here’s how the architecture works:

1. Components
a. RabbitMQ (Message Broker)
Acts as the central hub for message exchange.

Uses queues to store messages and exchanges to route them.

Ensures reliable and asynchronous communication between producers and consumers.

b. Producer (Spring Boot Application)
Sends messages to RabbitMQ.

Simulates different e-commerce events (e.g., order creation, payment processing, notifications, shipping).

c. Consumers (Spring Boot Application)
Listen to specific queues and process messages.

Handle tasks like order processing, payment handling, notification sending, and shipping.

d. Queues
orderQueue: Stores order creation messages.

paymentQueue: Stores payment processing messages.

notificationQueue: Stores notification messages.

shippingQueue: Stores shipping messages.

e. Topic Exchange
Routes messages to the correct queues based on routing keys.

Example: Messages with the routing key order.* go to the orderQueue.
