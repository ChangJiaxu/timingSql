package com.xy.service;

import com.xy.bo.ActivateCardBO;
import com.xy.bo.CustomerBo;
import com.xy.bo.SellGrainInfoBo;

import java.util.List;

public interface ActivateCardService {

    List<SellGrainInfoBo> selectActivateCardAll();
}
