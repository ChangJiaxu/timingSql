package com.xy.service.impl;

import com.xy.bo.CustomerBo;
import com.xy.dao.CustomerMapping;
import com.xy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO
 * @author: JX。Chang
 * @date: 2021年10月18日 21:42
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapping customerMapping;

    @Override
    public CustomerBo queryCustomer(int id) {
        return customerMapping.selectById(id);
    }

    @Override
    public List<CustomerBo> queryCustomerAll() {
        return customerMapping.selectCustomerAll();
    }
}
