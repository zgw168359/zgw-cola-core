package com.zgw.cola.domain.customer.gateway;

import com.zgw.cola.domain.customer.Customer;
import com.zgw.cola.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
