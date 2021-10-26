package com.xy.excel.model;

import com.xy.bo.SellGrainInfoBo;
import com.xy.common.ExcelCommon;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import java.util.List;

/**
 * @Description: TODO
 * @author: JX。Chang
 * @date: 2021年10月19日 14:09
 */
public class ActivateCardSheet {
    public HSSFSheet  ActivateCardSheet(HSSFSheet customerSheet, List<SellGrainInfoBo> activateCardBOList){

        HSSFRow headRow = customerSheet.createRow(0);
        String[] titleArray =ExcelCommon.CUSTOMER_ACTIVATE_CARD_TITLE;
        for (int titleNo = 0;titleNo < titleArray.length;titleNo++) {
            headRow.createCell(titleNo).setCellValue(titleArray[titleNo]);
        }

        for (int infoNo = 0; infoNo <activateCardBOList.size(); infoNo++) {
            //内容行号从0起，但是要把首行给标题。因此+1
            HSSFRow infoRow = customerSheet.createRow(infoNo + 1 );
            SellGrainInfoBo sellGrainInfoBo = activateCardBOList.get(infoNo);
            infoRow.createCell(0).setCellValue(sellGrainInfoBo.getGoodstypename());
            infoRow.createCell(1).setCellValue(sellGrainInfoBo.getSalePersonnelCph());
            infoRow.createCell(2).setCellValue(sellGrainInfoBo.getSalePersonnelAgentName());
            infoRow.createCell(3).setCellValue(sellGrainInfoBo.getSalePersonnelAgentSfzh());
            infoRow.createCell(4).setCellValue(sellGrainInfoBo.getSalePersonnelMc());
            infoRow.createCell(5).setCellValue(sellGrainInfoBo.getSalePersonnelSfzh());
            infoRow.createCell(6).setCellValue(sellGrainInfoBo.getQsCode1Name());
            infoRow.createCell(7).setCellValue(sellGrainInfoBo.getQsCode1Value());
            infoRow.createCell(8).setCellValue(sellGrainInfoBo.getQsCode2Name());
            infoRow.createCell(9).setCellValue(sellGrainInfoBo.getQsCode2Value());
            infoRow.createCell(10).setCellValue(sellGrainInfoBo.getQsCode3Name());
            infoRow.createCell(11).setCellValue(sellGrainInfoBo.getQsCode3Value());
            infoRow.createCell(12).setCellValue(sellGrainInfoBo.getQsCode4Name());
            infoRow.createCell(13).setCellValue(sellGrainInfoBo.getQsCode4Value());
            infoRow.createCell(14).setCellValue(sellGrainInfoBo.getQsCode5Name());
            infoRow.createCell(15).setCellValue(sellGrainInfoBo.getQsCode5Value());
            infoRow.createCell(16).setCellValue(sellGrainInfoBo.getQsCode6Name());
            infoRow.createCell(17).setCellValue(sellGrainInfoBo.getQsCode6Value());
            infoRow.createCell(18).setCellValue(sellGrainInfoBo.getQsCode7Name());
            infoRow.createCell(19).setCellValue(sellGrainInfoBo.getQsCode7Value());
            infoRow.createCell(20).setCellValue(sellGrainInfoBo.getQsCode8Name());
            infoRow.createCell(21).setCellValue(sellGrainInfoBo.getQsCode8Value());
            infoRow.createCell(22).setCellValue(sellGrainInfoBo.getDateMjrq());
            infoRow.createCell(23).setCellValue(sellGrainInfoBo.getDatePjrq());
            infoRow.createCell(24).setCellValue(sellGrainInfoBo.getWeightCzkz());
            infoRow.createCell(25).setCellValue(sellGrainInfoBo.getWeightJz());
            infoRow.createCell(26).setCellValue(sellGrainInfoBo.getMoneyDjjeJz());
            infoRow.createCell(27).setCellValue(sellGrainInfoBo.getWeightCz());
            infoRow.createCell(28).setCellValue(sellGrainInfoBo.getPaymentstate());
            infoRow.createCell(29).setCellValue(sellGrainInfoBo.getMoneySfkje());
            infoRow.createCell(30).setCellValue(sellGrainInfoBo.getSettlementtype());
            infoRow.createCell(31).setCellValue(sellGrainInfoBo.getMoneyPrice());
            infoRow.createCell(32).setCellValue(sellGrainInfoBo.getMoneySfkje2());
            infoRow.createCell(33).setCellValue(sellGrainInfoBo.getDateFkrq());
            infoRow.createCell(34).setCellValue(sellGrainInfoBo.getDocstate());


        }

        return customerSheet;
    }

}
