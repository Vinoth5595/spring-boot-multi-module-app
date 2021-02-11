package com.vinoth.domain.repository;

import com.vinoth.domain.aggregate.Customer;

public interface CustomerRepository {
    public Customer getCustomerById(Integer customerId);
}
