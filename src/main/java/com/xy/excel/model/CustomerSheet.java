package com.xy.excel.model;

import com.xy.bo.CustomerBo;
import com.xy.common.ExcelCommon;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.util.List;

/**
 * @Description: TODO
 * @author: JX。Chang
 * @date: 2021年10月19日 14:09
 */
public class CustomerSheet {
    public HSSFSheet CustomerSheet(HSSFSheet customerSheet, List<CustomerBo> customerBoList){

        HSSFRow headRow = customerSheet.createRow(0);
        String titleArray[] =ExcelCommon.CUSTOMER_EXCEL_TITLE;
        for (int titleNo = 0;titleNo < titleArray.length;titleNo++) {
            headRow.createCell(titleNo).setCellValue(titleArray[titleNo]);
        }

        for (int infoNo = 0; infoNo <customerBoList.size(); infoNo++) {
            //内容行号从0起，但是要把首行给标题。因此+1
            HSSFRow infoRow = customerSheet.createRow(infoNo + 1 );
            CustomerBo customer = customerBoList.get(infoNo);
            infoRow.createCell(0).setCellValue(customer.getId());
            infoRow.createCell(1).setCellValue(customer.getUsername());
            infoRow.createCell(2).setCellValue(customer.getNickname());
            infoRow.createCell(3).setCellValue(customer.getPhone());
            infoRow.createCell(4).setCellValue(customer.getRealName());
            infoRow.createCell(5).setCellValue(customer.getIdCardNum());
            infoRow.createCell(6).setCellValue(customer.getOperatorName());

        }

        return customerSheet;
    }
}
