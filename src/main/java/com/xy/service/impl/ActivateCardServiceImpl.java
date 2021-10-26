package com.xy.service.impl;

import com.xy.bo.ActivateCardBO;
import com.xy.bo.CustomerBo;
import com.xy.bo.SellGrainInfoBo;
import com.xy.dao.ActivateCardMapping;
import com.xy.dao.CustomerMapping;
import com.xy.service.ActivateCardService;
import com.xy.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO
 * @author: JX。Chang
 * @date: 2021年10月18日 21:42
 */
@Service
public class ActivateCardServiceImpl implements ActivateCardService {

    @Resource
    private ActivateCardMapping activateCardMapping;

    @Override
    public List<SellGrainInfoBo> selectActivateCardAll() {
        return activateCardMapping.selectActivateCardAll();
    }
}
