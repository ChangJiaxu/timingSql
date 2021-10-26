package com.xy.dao;

import com.xy.bo.CustomerBo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 接口
 * @author: JX。Chang
 * @date: 2021年10月18日 21:43
 */
@Mapper
public interface CustomerMapping {
    CustomerBo selectById( int customerId);

    List<CustomerBo> selectCustomerAll();

}
