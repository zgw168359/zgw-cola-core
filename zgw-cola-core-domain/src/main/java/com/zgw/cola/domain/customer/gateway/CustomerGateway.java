package com.zgw.cola.domain.customer.gateway;

import com.zgw.cola.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
