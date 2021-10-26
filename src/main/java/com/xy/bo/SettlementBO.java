package com.xy.bo;

/**
 * @Description: 结算表
 * @author: JX。Chang
 * @date: 2021年10月20日 14:06
 */
public class SettlementBO {

    /**
     *
     */
    private String code;

    /**
     *
     */
    private String companycode;

    /**
     *
     */
    private String companypurchaseplacecode;

    /**
     *
     */
    private String qsCode1WeightKzsl;

    /**
     *
     */
    private String qsCode1MoneyZjje;

    /**
     *
     */
    private String qsCode1MoneyKjje;

    /**
     *
     */
    private String qsCode2WeightKzsl;

    /**
     *
     */
    private String qsCode2MoneyZjje;

    /**
     *
     */
    private String qsCode2MoneyKjje;

    /**
     *
     */
    private String qsCode3WeightKzsl;

    /**
     *
     */
    private String qsCode3MoneyZjje;

    /**
     *
     */
    private String qsCode3MoneyKjje;

    /**
     *
     */
    private String qsCode4WeightKzsl;

    /**
     *
     */
    private String qsCode4MoneyZjje;

    /**
     *
     */
    private String qsCode4MoneyKjje;

    /**
     *
     */
    private String qsCode5WeightKzsl;

    /**
     *
     */
    private String qsCode5MoneyZjje;

    /**
     *
     */
    private String qsCode5MoneyKjje;

    /**
     *
     */
    private String qsCode6WeightKzsl;

    /**
     *
     */
    private String qsCode6MoneyZjje;

    /**
     *
     */
    private String qsCode6MoneyKjje;

    /**
     *
     */
    private String qsCode7WeightKzsl;

    /**
     *
     */
    private String qsCode7MoneyZjje;

    /**
     *
     */
    private String qsCode7MoneyKjje;

    /**
     *
     */
    private String qsCode8WeightKzsl;

    /**
     *
     */
    private String qsCode8MoneyZjje;

    /**
     *
     */
    private String qsCode8MoneyKjje;

    /**
     *
     */
    private String moneyBzdjje;

    /**
     *
     */
    private String moneyBzlkje;

    /**
     *
     */
    private String moneyZjzje;

    /**
     *
     */
    private String moneyKjzje;

    /**
     *
     */
    private String moneyDjje;

    /**
     *
     */
    private String moneyDryje;

    /**
     *
     */
    private String moneyYfkje;

    /**
     *
     */
    private String moneySfkje;

    /**
     *
     */
    private String moneyDxje;

    /**
     *
     */
    private String weightKzzsl;

    /**
     *
     */
    private String weightCz;

    /**
     *
     */
    private String dateJsrq;

    /**
     *
     */
    private String personnelJsy;

    /**
     *
     */
    private String uploadstate;

    /**
     *
     */
    private String insertType;

    /**
     *
     */
    private String checkDate;

    /**
     *
     */
    private String checkPersonnel;

    /**
     *
     */
    private String checkState;

    /**
     *
     */
    private String checkUppermodify;

    /**
     *
     */
    private String remark;

    /**
     *
     */
    private String state;

    /**
     *
     */
    private String qsCode9WeightKzsl;

    /**
     *
     */
    private String qsCode9MoneyZjje;

    /**
     *
     */
    private String qsCode9MoneyKjje;

    /**
     *
     */
    private String qsCode10WeightKzsl;

    /**
     *
     */
    private String qsCode10MoneyZjje;

    /**
     *
     */
    private String qsCode10MoneyKjje;

    /**
     *
     */
    private String qsCode11WeightKzsl;

    /**
     *
     */
    private String qsCode11MoneyZjje;

    /**
     *
     */
    private String qsCode11MoneyKjje;

    /**
     *
     */
    private String qsCode12WeightKzsl;

    /**
     *
     */
    private String qsCode12MoneyZjje;

    /**
     *
     */
    private String qsCode12MoneyKjje;

    /**
     *
     */
    private String qsCode13WeightKzsl;

    /**
     *
     */
    private String qsCode13MoneyZjje;

    /**
     *
     */
    private String qsCode13MoneyKjje;

    /**
     *
     */
    private String qsCode14WeightKzsl;

    /**
     *
     */
    private String qsCode14MoneyZjje;

    /**
     *
     */
    private String qsCode14MoneyKjje;

    /**
     *
     */
    private String qsCode15WeightKzsl;

    /**
     *
     */
    private String qsCode15MoneyZjje;

    /**
     *
     */
    private String qsCode15MoneyKjje;

    /**
     *
     */
    private String weightDryafter;

    /**
     *
     */
    private String moneySubsidydjje;

    /**
     *
     */
    private String moneySubsidyje;

    /**
     *
     */
    private String weightSubsidycz;

    /**
     *
     */
    private String originalWeightKzzsl;

    /**
     *
     */
    private String originalWeightCz;

    /**
     *
     */
    private String originalMoneyYfkje;

    /**
     *
     */
    private String originalMoneyDjje;

    /**
     *
     */
    private String originalMoneyBzdjje;

    /**
     *
     */
    private String originalMoneyZjzje;

    /**
     *
     */
    private String originalMoneyKjzje;

    /**
     *
     */
    private String settlementtype;

    /**
     *
     */
    private String prepaymentrate;

    /**
     *
     */
    private String prepaymentamount;

    /**
     *
     */
    private String estimatedate;

    /**
     *
     */
    private String estimateinterestrate;

    /**
     *
     */
    private String estimateinterest;

    /**
     *
     */
    private String paymentstate;

    /**
     *
     */
    private String docstate;

    /**
     *
     */
    private String weightDrycode;

    /**
     *
     */
    private String status;

    private SecondSettlementBO secondSettlementBO;


    /**
     * setter for column
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * getter for column
     */
    public String getCode() {
        return this.code;
    }

    /**
     * setter for column
     */
    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    /**
     * getter for column
     */
    public String getCompanycode() {
        return this.companycode;
    }

    /**
     * setter for column
     */
    public void setCompanypurchaseplacecode(String companypurchaseplacecode) {
        this.companypurchaseplacecode = companypurchaseplacecode;
    }

    /**
     * getter for column
     */
    public String getCompanypurchaseplacecode() {
        return this.companypurchaseplacecode;
    }

    /**
     * setter for column
     */
    public void setQsCode1WeightKzsl(String qsCode1WeightKzsl) {
        this.qsCode1WeightKzsl = qsCode1WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode1WeightKzsl() {
        return this.qsCode1WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode1MoneyZjje(String qsCode1MoneyZjje) {
        this.qsCode1MoneyZjje = qsCode1MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode1MoneyZjje() {
        return this.qsCode1MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode1MoneyKjje(String qsCode1MoneyKjje) {
        this.qsCode1MoneyKjje = qsCode1MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode1MoneyKjje() {
        return this.qsCode1MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode2WeightKzsl(String qsCode2WeightKzsl) {
        this.qsCode2WeightKzsl = qsCode2WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode2WeightKzsl() {
        return this.qsCode2WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode2MoneyZjje(String qsCode2MoneyZjje) {
        this.qsCode2MoneyZjje = qsCode2MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode2MoneyZjje() {
        return this.qsCode2MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode2MoneyKjje(String qsCode2MoneyKjje) {
        this.qsCode2MoneyKjje = qsCode2MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode2MoneyKjje() {
        return this.qsCode2MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode3WeightKzsl(String qsCode3WeightKzsl) {
        this.qsCode3WeightKzsl = qsCode3WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode3WeightKzsl() {
        return this.qsCode3WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode3MoneyZjje(String qsCode3MoneyZjje) {
        this.qsCode3MoneyZjje = qsCode3MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode3MoneyZjje() {
        return this.qsCode3MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode3MoneyKjje(String qsCode3MoneyKjje) {
        this.qsCode3MoneyKjje = qsCode3MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode3MoneyKjje() {
        return this.qsCode3MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode4WeightKzsl(String qsCode4WeightKzsl) {
        this.qsCode4WeightKzsl = qsCode4WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode4WeightKzsl() {
        return this.qsCode4WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode4MoneyZjje(String qsCode4MoneyZjje) {
        this.qsCode4MoneyZjje = qsCode4MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode4MoneyZjje() {
        return this.qsCode4MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode4MoneyKjje(String qsCode4MoneyKjje) {
        this.qsCode4MoneyKjje = qsCode4MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode4MoneyKjje() {
        return this.qsCode4MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode5WeightKzsl(String qsCode5WeightKzsl) {
        this.qsCode5WeightKzsl = qsCode5WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode5WeightKzsl() {
        return this.qsCode5WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode5MoneyZjje(String qsCode5MoneyZjje) {
        this.qsCode5MoneyZjje = qsCode5MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode5MoneyZjje() {
        return this.qsCode5MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode5MoneyKjje(String qsCode5MoneyKjje) {
        this.qsCode5MoneyKjje = qsCode5MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode5MoneyKjje() {
        return this.qsCode5MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode6WeightKzsl(String qsCode6WeightKzsl) {
        this.qsCode6WeightKzsl = qsCode6WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode6WeightKzsl() {
        return this.qsCode6WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode6MoneyZjje(String qsCode6MoneyZjje) {
        this.qsCode6MoneyZjje = qsCode6MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode6MoneyZjje() {
        return this.qsCode6MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode6MoneyKjje(String qsCode6MoneyKjje) {
        this.qsCode6MoneyKjje = qsCode6MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode6MoneyKjje() {
        return this.qsCode6MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode7WeightKzsl(String qsCode7WeightKzsl) {
        this.qsCode7WeightKzsl = qsCode7WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode7WeightKzsl() {
        return this.qsCode7WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode7MoneyZjje(String qsCode7MoneyZjje) {
        this.qsCode7MoneyZjje = qsCode7MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode7MoneyZjje() {
        return this.qsCode7MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode7MoneyKjje(String qsCode7MoneyKjje) {
        this.qsCode7MoneyKjje = qsCode7MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode7MoneyKjje() {
        return this.qsCode7MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode8WeightKzsl(String qsCode8WeightKzsl) {
        this.qsCode8WeightKzsl = qsCode8WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode8WeightKzsl() {
        return this.qsCode8WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode8MoneyZjje(String qsCode8MoneyZjje) {
        this.qsCode8MoneyZjje = qsCode8MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode8MoneyZjje() {
        return this.qsCode8MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode8MoneyKjje(String qsCode8MoneyKjje) {
        this.qsCode8MoneyKjje = qsCode8MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode8MoneyKjje() {
        return this.qsCode8MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setMoneyBzdjje(String moneyBzdjje) {
        this.moneyBzdjje = moneyBzdjje;
    }

    /**
     * getter for column
     */
    public String getMoneyBzdjje() {
        return this.moneyBzdjje;
    }

    /**
     * setter for column
     */
    public void setMoneyBzlkje(String moneyBzlkje) {
        this.moneyBzlkje = moneyBzlkje;
    }

    /**
     * getter for column
     */
    public String getMoneyBzlkje() {
        return this.moneyBzlkje;
    }

    /**
     * setter for column
     */
    public void setMoneyZjzje(String moneyZjzje) {
        this.moneyZjzje = moneyZjzje;
    }

    /**
     * getter for column
     */
    public String getMoneyZjzje() {
        return this.moneyZjzje;
    }

    /**
     * setter for column
     */
    public void setMoneyKjzje(String moneyKjzje) {
        this.moneyKjzje = moneyKjzje;
    }

    /**
     * getter for column
     */
    public String getMoneyKjzje() {
        return this.moneyKjzje;
    }

    /**
     * setter for column
     */
    public void setMoneyDjje(String moneyDjje) {
        this.moneyDjje = moneyDjje;
    }

    /**
     * getter for column
     */
    public String getMoneyDjje() {
        return this.moneyDjje;
    }

    /**
     * setter for column
     */
    public void setMoneyDryje(String moneyDryje) {
        this.moneyDryje = moneyDryje;
    }

    /**
     * getter for column
     */
    public String getMoneyDryje() {
        return this.moneyDryje;
    }

    /**
     * setter for column
     */
    public void setMoneyYfkje(String moneyYfkje) {
        this.moneyYfkje = moneyYfkje;
    }

    /**
     * getter for column
     */
    public String getMoneyYfkje() {
        return this.moneyYfkje;
    }

    /**
     * setter for column
     */
    public void setMoneySfkje(String moneySfkje) {
        this.moneySfkje = moneySfkje;
    }

    /**
     * getter for column
     */
    public String getMoneySfkje() {
        return this.moneySfkje;
    }

    /**
     * setter for column
     */
    public void setMoneyDxje(String moneyDxje) {
        this.moneyDxje = moneyDxje;
    }

    /**
     * getter for column
     */
    public String getMoneyDxje() {
        return this.moneyDxje;
    }

    /**
     * setter for column
     */
    public void setWeightKzzsl(String weightKzzsl) {
        this.weightKzzsl = weightKzzsl;
    }

    /**
     * getter for column
     */
    public String getWeightKzzsl() {
        return this.weightKzzsl;
    }

    /**
     * setter for column
     */
    public void setWeightCz(String weightCz) {
        this.weightCz = weightCz;
    }

    /**
     * getter for column
     */
    public String getWeightCz() {
        return this.weightCz;
    }

    /**
     * setter for column
     */
    public void setDateJsrq(String dateJsrq) {
        this.dateJsrq = dateJsrq;
    }

    /**
     * getter for column
     */
    public String getDateJsrq() {
        return this.dateJsrq;
    }

    /**
     * setter for column
     */
    public void setPersonnelJsy(String personnelJsy) {
        this.personnelJsy = personnelJsy;
    }

    /**
     * getter for column
     */
    public String getPersonnelJsy() {
        return this.personnelJsy;
    }

    /**
     * setter for column
     */
    public void setUploadstate(String uploadstate) {
        this.uploadstate = uploadstate;
    }

    /**
     * getter for column
     */
    public String getUploadstate() {
        return this.uploadstate;
    }

    /**
     * setter for column
     */
    public void setInsertType(String insertType) {
        this.insertType = insertType;
    }

    /**
     * getter for column
     */
    public String getInsertType() {
        return this.insertType;
    }

    /**
     * setter for column
     */
    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * getter for column
     */
    public String getCheckDate() {
        return this.checkDate;
    }

    /**
     * setter for column
     */
    public void setCheckPersonnel(String checkPersonnel) {
        this.checkPersonnel = checkPersonnel;
    }

    /**
     * getter for column
     */
    public String getCheckPersonnel() {
        return this.checkPersonnel;
    }

    /**
     * setter for column
     */
    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    /**
     * getter for column
     */
    public String getCheckState() {
        return this.checkState;
    }

    /**
     * setter for column
     */
    public void setCheckUppermodify(String checkUppermodify) {
        this.checkUppermodify = checkUppermodify;
    }

    /**
     * getter for column
     */
    public String getCheckUppermodify() {
        return this.checkUppermodify;
    }

    /**
     * setter for column
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * getter for column
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * setter for column
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * getter for column
     */
    public String getState() {
        return this.state;
    }

    /**
     * setter for column
     */
    public void setQsCode9WeightKzsl(String qsCode9WeightKzsl) {
        this.qsCode9WeightKzsl = qsCode9WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode9WeightKzsl() {
        return this.qsCode9WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode9MoneyZjje(String qsCode9MoneyZjje) {
        this.qsCode9MoneyZjje = qsCode9MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode9MoneyZjje() {
        return this.qsCode9MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode9MoneyKjje(String qsCode9MoneyKjje) {
        this.qsCode9MoneyKjje = qsCode9MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode9MoneyKjje() {
        return this.qsCode9MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode10WeightKzsl(String qsCode10WeightKzsl) {
        this.qsCode10WeightKzsl = qsCode10WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode10WeightKzsl() {
        return this.qsCode10WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode10MoneyZjje(String qsCode10MoneyZjje) {
        this.qsCode10MoneyZjje = qsCode10MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode10MoneyZjje() {
        return this.qsCode10MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode10MoneyKjje(String qsCode10MoneyKjje) {
        this.qsCode10MoneyKjje = qsCode10MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode10MoneyKjje() {
        return this.qsCode10MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode11WeightKzsl(String qsCode11WeightKzsl) {
        this.qsCode11WeightKzsl = qsCode11WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode11WeightKzsl() {
        return this.qsCode11WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode11MoneyZjje(String qsCode11MoneyZjje) {
        this.qsCode11MoneyZjje = qsCode11MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode11MoneyZjje() {
        return this.qsCode11MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode11MoneyKjje(String qsCode11MoneyKjje) {
        this.qsCode11MoneyKjje = qsCode11MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode11MoneyKjje() {
        return this.qsCode11MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode12WeightKzsl(String qsCode12WeightKzsl) {
        this.qsCode12WeightKzsl = qsCode12WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode12WeightKzsl() {
        return this.qsCode12WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode12MoneyZjje(String qsCode12MoneyZjje) {
        this.qsCode12MoneyZjje = qsCode12MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode12MoneyZjje() {
        return this.qsCode12MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode12MoneyKjje(String qsCode12MoneyKjje) {
        this.qsCode12MoneyKjje = qsCode12MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode12MoneyKjje() {
        return this.qsCode12MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode13WeightKzsl(String qsCode13WeightKzsl) {
        this.qsCode13WeightKzsl = qsCode13WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode13WeightKzsl() {
        return this.qsCode13WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode13MoneyZjje(String qsCode13MoneyZjje) {
        this.qsCode13MoneyZjje = qsCode13MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode13MoneyZjje() {
        return this.qsCode13MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode13MoneyKjje(String qsCode13MoneyKjje) {
        this.qsCode13MoneyKjje = qsCode13MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode13MoneyKjje() {
        return this.qsCode13MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode14WeightKzsl(String qsCode14WeightKzsl) {
        this.qsCode14WeightKzsl = qsCode14WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode14WeightKzsl() {
        return this.qsCode14WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode14MoneyZjje(String qsCode14MoneyZjje) {
        this.qsCode14MoneyZjje = qsCode14MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode14MoneyZjje() {
        return this.qsCode14MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode14MoneyKjje(String qsCode14MoneyKjje) {
        this.qsCode14MoneyKjje = qsCode14MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode14MoneyKjje() {
        return this.qsCode14MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setQsCode15WeightKzsl(String qsCode15WeightKzsl) {
        this.qsCode15WeightKzsl = qsCode15WeightKzsl;
    }

    /**
     * getter for column
     */
    public String getQsCode15WeightKzsl() {
        return this.qsCode15WeightKzsl;
    }

    /**
     * setter for column
     */
    public void setQsCode15MoneyZjje(String qsCode15MoneyZjje) {
        this.qsCode15MoneyZjje = qsCode15MoneyZjje;
    }

    /**
     * getter for column
     */
    public String getQsCode15MoneyZjje() {
        return this.qsCode15MoneyZjje;
    }

    /**
     * setter for column
     */
    public void setQsCode15MoneyKjje(String qsCode15MoneyKjje) {
        this.qsCode15MoneyKjje = qsCode15MoneyKjje;
    }

    /**
     * getter for column
     */
    public String getQsCode15MoneyKjje() {
        return this.qsCode15MoneyKjje;
    }

    /**
     * setter for column
     */
    public void setWeightDryafter(String weightDryafter) {
        this.weightDryafter = weightDryafter;
    }

    /**
     * getter for column
     */
    public String getWeightDryafter() {
        return this.weightDryafter;
    }

    /**
     * setter for column
     */
    public void setMoneySubsidydjje(String moneySubsidydjje) {
        this.moneySubsidydjje = moneySubsidydjje;
    }

    /**
     * getter for column
     */
    public String getMoneySubsidydjje() {
        return this.moneySubsidydjje;
    }

    /**
     * setter for column
     */
    public void setMoneySubsidyje(String moneySubsidyje) {
        this.moneySubsidyje = moneySubsidyje;
    }

    /**
     * getter for column
     */
    public String getMoneySubsidyje() {
        return this.moneySubsidyje;
    }

    /**
     * setter for column
     */
    public void setWeightSubsidycz(String weightSubsidycz) {
        this.weightSubsidycz = weightSubsidycz;
    }

    /**
     * getter for column
     */
    public String getWeightSubsidycz() {
        return this.weightSubsidycz;
    }

    /**
     * setter for column
     */
    public void setOriginalWeightKzzsl(String originalWeightKzzsl) {
        this.originalWeightKzzsl = originalWeightKzzsl;
    }

    /**
     * getter for column
     */
    public String getOriginalWeightKzzsl() {
        return this.originalWeightKzzsl;
    }

    /**
     * setter for column
     */
    public void setOriginalWeightCz(String originalWeightCz) {
        this.originalWeightCz = originalWeightCz;
    }

    /**
     * getter for column
     */
    public String getOriginalWeightCz() {
        return this.originalWeightCz;
    }

    /**
     * setter for column
     */
    public void setOriginalMoneyYfkje(String originalMoneyYfkje) {
        this.originalMoneyYfkje = originalMoneyYfkje;
    }

    /**
     * getter for column
     */
    public String getOriginalMoneyYfkje() {
        return this.originalMoneyYfkje;
    }

    /**
     * setter for column
     */
    public void setOriginalMoneyDjje(String originalMoneyDjje) {
        this.originalMoneyDjje = originalMoneyDjje;
    }

    /**
     * getter for column
     */
    public String getOriginalMoneyDjje() {
        return this.originalMoneyDjje;
    }

    /**
     * setter for column
     */
    public void setOriginalMoneyBzdjje(String originalMoneyBzdjje) {
        this.originalMoneyBzdjje = originalMoneyBzdjje;
    }

    /**
     * getter for column
     */
    public String getOriginalMoneyBzdjje() {
        return this.originalMoneyBzdjje;
    }

    /**
     * setter for column
     */
    public void setOriginalMoneyZjzje(String originalMoneyZjzje) {
        this.originalMoneyZjzje = originalMoneyZjzje;
    }

    /**
     * getter for column
     */
    public String getOriginalMoneyZjzje() {
        return this.originalMoneyZjzje;
    }

    /**
     * setter for column
     */
    public void setOriginalMoneyKjzje(String originalMoneyKjzje) {
        this.originalMoneyKjzje = originalMoneyKjzje;
    }

    /**
     * getter for column
     */
    public String getOriginalMoneyKjzje() {
        return this.originalMoneyKjzje;
    }

    /**
     * setter for column
     */
    public void setSettlementtype(String settlementtype) {
        this.settlementtype = settlementtype;
    }

    /**
     * getter for column
     */
    public String getSettlementtype() {
        return this.settlementtype;
    }

    /**
     * setter for column
     */
    public void setPrepaymentrate(String prepaymentrate) {
        this.prepaymentrate = prepaymentrate;
    }

    /**
     * getter for column
     */
    public String getPrepaymentrate() {
        return this.prepaymentrate;
    }

    /**
     * setter for column
     */
    public void setPrepaymentamount(String prepaymentamount) {
        this.prepaymentamount = prepaymentamount;
    }

    /**
     * getter for column
     */
    public String getPrepaymentamount() {
        return this.prepaymentamount;
    }

    /**
     * setter for column
     */
    public void setEstimatedate(String estimatedate) {
        this.estimatedate = estimatedate;
    }

    /**
     * getter for column
     */
    public String getEstimatedate() {
        return this.estimatedate;
    }

    /**
     * setter for column
     */
    public void setEstimateinterestrate(String estimateinterestrate) {
        this.estimateinterestrate = estimateinterestrate;
    }

    /**
     * getter for column
     */
    public String getEstimateinterestrate() {
        return this.estimateinterestrate;
    }

    /**
     * setter for column
     */
    public void setEstimateinterest(String estimateinterest) {
        this.estimateinterest = estimateinterest;
    }

    /**
     * getter for column
     */
    public String getEstimateinterest() {
        return this.estimateinterest;
    }

    /**
     * setter for column
     */
    public void setPaymentstate(String paymentstate) {
        this.paymentstate = paymentstate;
    }

    /**
     * getter for column
     */
    public String getPaymentstate() {
        return this.paymentstate;
    }

    /**
     * setter for column
     */
    public void setDocstate(String docstate) {
        this.docstate = docstate;
    }

    /**
     * getter for column
     */
    public String getDocstate() {
        return this.docstate;
    }

    /**
     * setter for column
     */
    public void setWeightDrycode(String weightDrycode) {
        this.weightDrycode = weightDrycode;
    }

    /**
     * getter for column
     */
    public String getWeightDrycode() {
        return this.weightDrycode;
    }

    /**
     * setter for column
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * getter for column
     */
    public String getStatus() {
        return this.status;
    }
}