package com.example.pr1_manager_data_customer.services;

import com.example.pr1_manager_data_customer.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(Customer customer, int id);

    void remove(int id);
}
