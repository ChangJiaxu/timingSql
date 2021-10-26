package com.xy.bo;

/**
 * @Description: Customer表的实体类
 * @author: JX。Chang
 * @date: 2021年10月18日 20:46
 */
public class CustomerBo {
    private int id;
//    用户名
    private String username;
//    昵称
    private String nickname;
//    手机号
    private String phone;
//    真实姓名
    private String realName;
    //身份证号
    private String idCardNum;
    //登录用户名
    private String operatorName;

    @Override
    public String toString() {
        return "CustomerBo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", realName='" + realName + '\'' +
                ", idCardNum='" + idCardNum + '\'' +
                ", operatorName='" + operatorName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
