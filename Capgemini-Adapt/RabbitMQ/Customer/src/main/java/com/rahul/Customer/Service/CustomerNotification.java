package com.rahul.Customer.Service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rahul.Customer.RabbitMQConfig;
import com.rahul.Customer.Model.Customer;
import com.rahul.Customer.Repo.CustomerRepo;

@Component
public class CustomerNotification {

    @Autowired
    CustomerRepo customerRepo;

    /**
     * use a new queue for consuming the customer produced
     * each time a customer is added to the DB
     */
    @RabbitListener(queues = RabbitMQConfig.queueName)
    public void consumeMess(Customer customer){
        customerRepo.save(customer);
        System.out.println("Customer added to DB");
    }
}
