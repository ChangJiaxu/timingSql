package com.xy.controller;

import com.xy.bo.ActivateCardBO;
import com.xy.bo.CustomerBo;
import com.xy.bo.SellGrainInfoBo;
import com.xy.excel.ExcelWork;
import com.xy.mail.SendMail;
import com.xy.service.ActivateCardService;
import com.xy.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: JX。Chang
 * @date: 2021年10月18日 22:10
 */
@RestController
@RequestMapping(value = "/Area")
public class TimingSqlController {


    @Resource
    CustomerService customerService;

    @Resource
    ActivateCardService activateCardService;

    @RequestMapping("find_by_id")
    public Object findById(int id, HttpServletRequest request) throws IOException {


        List<CustomerBo> customerBoList = customerService.queryCustomerAll();
        for (CustomerBo customerBo :
                customerBoList) {

            System.out.println(customerBo.toString());
        }
        List<SellGrainInfoBo> activateCardBOList = activateCardService.selectActivateCardAll();
        ExcelWork excelWork = new ExcelWork();
        String excelFileUrl = excelWork.ExcelWork(customerBoList,activateCardBOList);

        SendMail sendMail = new SendMail();
       // 发送邮件  暂时屏蔽
        // sendMail.SendMail(excelFileUrl);
        return excelFileUrl;
    }
}
