package com.xy.excel;

import com.xy.bo.ActivateCardBO;
import com.xy.bo.CustomerBo;
import com.xy.bo.SellGrainInfoBo;
import com.xy.excel.model.ActivateCardSheet;
import com.xy.excel.model.CustomerSheet;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * @Description: Excel文件类
 * @author: JX。Chang
 * @date: 2021年10月19日 08:49
 */
public class ExcelWork implements Serializable {



    /**
     * @Description: 创建EXCEL文件，包含customer和xy两个sheet页。
     * @return*/
    public String ExcelWork(List<CustomerBo> customerBoList, List<SellGrainInfoBo> activateCardBOList) throws IOException {

        // 创建工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 创建工作表sheet页——customer
        HSSFSheet custSheet = workbook.createSheet("sheet1");
        CustomerSheet customerInfoSheet = new CustomerSheet();
        custSheet = customerInfoSheet.CustomerSheet(custSheet,customerBoList);
        // 创建工作表sheet页——Activate
        HSSFSheet activateCardSheet = workbook.createSheet("sheet2");
        ActivateCardSheet activateCardInfoSheet = new ActivateCardSheet();
        activateCardSheet = activateCardInfoSheet.ActivateCardSheet(activateCardSheet,activateCardBOList);


        Properties properties = new Properties();
        // 使用ClassLoader加载properties配置文件生成对应的输入流
        InputStream in = getClass().getClassLoader().getResourceAsStream("config/config.properties");
        // 使用properties对象加载输入流
        properties.load(in);
        //获取key对应的value值
        String excelFolderUrl = properties.getProperty("excelFileUrl");

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleHourFormat = new SimpleDateFormat("yyyy-MM-dd HH");
        String dateString = simpleDateFormat.format(date);
        String hourString = simpleHourFormat.format(date);

        File folder = new File(excelFolderUrl + dateString);
        if (!folder.exists() && !folder.isDirectory()) {
            folder.mkdirs();
            System.out.println("创建文件夹" + folder);
        } else {
            System.out.println("文件夹已存在");
        }

        String excelFileUrl = excelFolderUrl + dateString +"/"+hourString+"H.xls";
        File xlsFile = new File(excelFileUrl);
        FileOutputStream xlsStream = new FileOutputStream(xlsFile);
        workbook.write(xlsStream);
        return excelFileUrl;
    }
}
