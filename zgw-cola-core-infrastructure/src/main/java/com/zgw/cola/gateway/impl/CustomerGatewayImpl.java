package com.zgw.cola.gateway.impl;

import com.zgw.cola.dao.dataobject.CustomerDO;
import com.zgw.cola.dao.mapper.CustomerMapper;
import com.zgw.cola.domain.customer.Customer;
import com.zgw.cola.domain.customer.gateway.CustomerGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerGatewayImpl implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer getByById(String customerId){
      CustomerDO customerDO = customerMapper.getById(customerId);
      //Convert to Customer
      return null;
    }
}
