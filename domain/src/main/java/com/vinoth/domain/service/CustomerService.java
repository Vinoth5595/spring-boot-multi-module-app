package com.vinoth.domain.service;

import com.vinoth.domain.aggregate.Customer;

public interface CustomerService {
    public Customer getCustomerById(Integer customerId);
}
