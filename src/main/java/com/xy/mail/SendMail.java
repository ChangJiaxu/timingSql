package com.xy.mail;

import mail.set.Send;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: JX。Chang
 * @date: 2021年10月19日 22:19
 */
public class SendMail {

    public void SendMail(String excelFileUrl){
        mail.SendMail sendMail = new mail.SendMail(
                Send.create()
                        .setPersonal("农产数字化")
                        .setStmp("smtp.xiangyu.cn")
                        .setUserName("changjx")
                        .setUserPassword("#EDC3edc")
                        .setSendMail("changjx@xiangyu.cn").build()
        );
        //邮件主题
        String theme = "数据提取文件";
        //邮件内容
        String content = "您好：<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;附件是运行的文件，请查收。";
        //收信邮箱
        List<String> to = new ArrayList<String>();
        to.add("68598918@qq.com");
        //抄送邮箱 null
        //密送邮箱 null
        //附件地址

        sendMail.sendMail(theme,content,to,null,null,excelFileUrl);
        //cescss
//master


        }

}
