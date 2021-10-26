package com.xy.service;

import com.xy.bo.CustomerBo;

import java.util.List;

public interface CustomerService {

    CustomerBo queryCustomer(int id);

    List<CustomerBo> queryCustomerAll();

}
