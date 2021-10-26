package com.xy.dao;

import com.xy.bo.ActivateCardBO;
import com.xy.bo.CustomerBo;
import com.xy.bo.SellGrainInfoBo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description: 接口
 * @author: JX。Chang
 * @date: 2021年10月18日 21:43
 */
@Mapper
public interface ActivateCardMapping {

    List<SellGrainInfoBo> selectActivateCardAll();

}
