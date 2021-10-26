package com.xy.bo;

/**
 * @Description: 开卡表
 * @author: JX。Chang
 * @date: 2021年10月20日 14:02
 */
public class ActivateCardBO {
        /**
         *
         */
        private String code;

        /**
         *
         */
        private String businesscompanycode;

        /**
         *
         */
        private String businesscompanyname;

        /**
         *
         */
        private String departmentcode;

        /**
         *
         */
        private String departmentname;

        /**
         *
         */
        private String batchcode;

        /**
         *
         */
        private String batchname;

        /**
         *
         */
        private String purchasetypecode;

        /**
         *
         */
        private String purchasetypename;

        /**
         *
         */
        private String goodstypecode;

        /**
         *
         */
        private String goodstypename;

        /**
         *
         */
        private String goodscode;

        /**
         *
         */
        private String goodsname;

        /**
         *
         */
        private String companypurchaseplacecode;

        /**
         *
         */
        private String companypurchaseplacename;

        /**
         *
         */
        private String salePersonnelMc;

        /**
         *
         */
        private String salePersonnelSfzh;

        /**
         *
         */
        private String salePersonnelYhkh;

        /**
         *
         */
        private String salePersonnelLxfs;

        /**
         *
         */
        private String salePersonnelZz;

        /**
         *
         */
        private String salePersonnelQfjg;

        /**
         *
         */
        private String salePersonnelYxqx;

        /**
         *
         */
        private String salePersonnelMz;

        /**
         *
         */
        private String salePersonnelXb;

        /**
         *
         */
        private String salePersonnelCsrq;

        /**
         *
         */
        private String salePersonnelYhkhProvince;

        /**
         *
         */
        private String salePersonnelYhkhProvinceandcity;

        /**
         *
         */
        private String salePersonnelYhkhBank;

        /**
         *
         */
        private String salePersonnelYhkhOpenbank;

        /**
         *
         */
        private String salePersonnelYhkhBankcode;

        /**
         *
         */
        private String salePersonnelYhkhUser;

        /**
         *
         */
        private String salePersonnelCx;

        /**
         *
         */
        private String salePersonnelCph;

        /**
         *
         */
        private String salePersonnelAgentSfzh;

        /**
         *
         */
        private String activatecardPersonnel;

        /**
         *
         */
        private String activatecardDate;

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
        private String activatecardFrom;

        /**
         *
         */
        private String activatecardState;

        /**
         *
         */
        private String uploadstate;

        /**
         *
         */
        private String foodsourcepersonnel;

        /**
         *
         */
        private String docstate;

        /**
         *
         */
        private String companycode;

        /**
         *
         */
        private String companyname;

        /**
         *
         */
        private String insertType;

        /**
         *
         */
        private String remark;

        /**
         *
         */
        private String customercode;

        /**
         *
         */
        private String reapyearcode;

        /**
         *
         */
        private String foodsourceplacecode;

        /**
         *
         */
        private String foodsourceplacename;

        /**
         *
         */
        private String buytype;

        /**
         *
         */
        private String contractstate;

        /**
         *
         */
        private String contractcode;

        /**
         *
         */
        private String purchasetypedetailedcode;

        /**
         *
         */
        private String purchasetypedetailedname;

        /**
         *
         */
        private String paymentstate;

        /**
         *
         */
        private String salePersonnelAgentName;

        /**
         *
         */
        private String templatecode;

        /**
         *
         */
        private String status;

        private PurchaseTestBO purchaseTestBO;
        private WeightBO weightBO;
        private SettlementBO settlementBO;
        private PaymentBO paymentBO;

    public PurchaseTestBO getPurchaseTestBO() {
        return purchaseTestBO;
    }

    public void setPurchaseTestBO(PurchaseTestBO purchaseTestBO) {
        this.purchaseTestBO = purchaseTestBO;
    }

    public WeightBO getWeightBO() {
        return weightBO;
    }

    public void setWeightBO(WeightBO weightBO) {
        this.weightBO = weightBO;
    }

    public SettlementBO getSettlementBO() {
        return settlementBO;
    }

    public void setSettlementBO(SettlementBO settlementBO) {
        this.settlementBO = settlementBO;
    }

    public PaymentBO getPaymentBO() {
        return paymentBO;
    }

    public void setPaymentBO(PaymentBO paymentBO) {
        this.paymentBO = paymentBO;
    }

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
        public void setBusinesscompanycode(String businesscompanycode) {
        this.businesscompanycode = businesscompanycode;
    }

        /**
         * getter for column
         */
        public String getBusinesscompanycode() {
        return this.businesscompanycode;
    }

        /**
         * setter for column
         */
        public void setBusinesscompanyname(String businesscompanyname) {
        this.businesscompanyname = businesscompanyname;
    }

        /**
         * getter for column
         */
        public String getBusinesscompanyname() {
        return this.businesscompanyname;
    }

        /**
         * setter for column
         */
        public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

        /**
         * getter for column
         */
        public String getDepartmentcode() {
        return this.departmentcode;
    }

        /**
         * setter for column
         */
        public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

        /**
         * getter for column
         */
        public String getDepartmentname() {
        return this.departmentname;
    }

        /**
         * setter for column
         */
        public void setBatchcode(String batchcode) {
        this.batchcode = batchcode;
    }

        /**
         * getter for column
         */
        public String getBatchcode() {
        return this.batchcode;
    }

        /**
         * setter for column
         */
        public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

        /**
         * getter for column
         */
        public String getBatchname() {
        return this.batchname;
    }

        /**
         * setter for column
         */
        public void setPurchasetypecode(String purchasetypecode) {
        this.purchasetypecode = purchasetypecode;
    }

        /**
         * getter for column
         */
        public String getPurchasetypecode() {
        return this.purchasetypecode;
    }

        /**
         * setter for column
         */
        public void setPurchasetypename(String purchasetypename) {
        this.purchasetypename = purchasetypename;
    }

        /**
         * getter for column
         */
        public String getPurchasetypename() {
        return this.purchasetypename;
    }

        /**
         * setter for column
         */
        public void setGoodstypecode(String goodstypecode) {
        this.goodstypecode = goodstypecode;
    }

        /**
         * getter for column
         */
        public String getGoodstypecode() {
        return this.goodstypecode;
    }

        /**
         * setter for column
         */
        public void setGoodstypename(String goodstypename) {
        this.goodstypename = goodstypename;
    }

        /**
         * getter for column
         */
        public String getGoodstypename() {
        return this.goodstypename;
    }

        /**
         * setter for column
         */
        public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

        /**
         * getter for column
         */
        public String getGoodscode() {
        return this.goodscode;
    }

        /**
         * setter for column
         */
        public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

        /**
         * getter for column
         */
        public String getGoodsname() {
        return this.goodsname;
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
        public void setCompanypurchaseplacename(String companypurchaseplacename) {
        this.companypurchaseplacename = companypurchaseplacename;
    }

        /**
         * getter for column
         */
        public String getCompanypurchaseplacename() {
        return this.companypurchaseplacename;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelMc(String salePersonnelMc) {
        this.salePersonnelMc = salePersonnelMc;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelMc() {
        return this.salePersonnelMc;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelSfzh(String salePersonnelSfzh) {
        this.salePersonnelSfzh = salePersonnelSfzh;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelSfzh() {
        return this.salePersonnelSfzh;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelYhkh(String salePersonnelYhkh) {
        this.salePersonnelYhkh = salePersonnelYhkh;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelYhkh() {
        return this.salePersonnelYhkh;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelLxfs(String salePersonnelLxfs) {
        this.salePersonnelLxfs = salePersonnelLxfs;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelLxfs() {
        return this.salePersonnelLxfs;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelZz(String salePersonnelZz) {
        this.salePersonnelZz = salePersonnelZz;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelZz() {
        return this.salePersonnelZz;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelQfjg(String salePersonnelQfjg) {
        this.salePersonnelQfjg = salePersonnelQfjg;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelQfjg() {
        return this.salePersonnelQfjg;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelYxqx(String salePersonnelYxqx) {
        this.salePersonnelYxqx = salePersonnelYxqx;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelYxqx() {
        return this.salePersonnelYxqx;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelMz(String salePersonnelMz) {
        this.salePersonnelMz = salePersonnelMz;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelMz() {
        return this.salePersonnelMz;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelXb(String salePersonnelXb) {
        this.salePersonnelXb = salePersonnelXb;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelXb() {
        return this.salePersonnelXb;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelCsrq(String salePersonnelCsrq) {
        this.salePersonnelCsrq = salePersonnelCsrq;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelCsrq() {
        return this.salePersonnelCsrq;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelYhkhProvince(String salePersonnelYhkhProvince) {
        this.salePersonnelYhkhProvince = salePersonnelYhkhProvince;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelYhkhProvince() {
        return this.salePersonnelYhkhProvince;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelYhkhProvinceandcity(String salePersonnelYhkhProvinceandcity) {
        this.salePersonnelYhkhProvinceandcity = salePersonnelYhkhProvinceandcity;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelYhkhProvinceandcity() {
        return this.salePersonnelYhkhProvinceandcity;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelYhkhBank(String salePersonnelYhkhBank) {
        this.salePersonnelYhkhBank = salePersonnelYhkhBank;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelYhkhBank() {
        return this.salePersonnelYhkhBank;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelYhkhOpenbank(String salePersonnelYhkhOpenbank) {
        this.salePersonnelYhkhOpenbank = salePersonnelYhkhOpenbank;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelYhkhOpenbank() {
        return this.salePersonnelYhkhOpenbank;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelYhkhBankcode(String salePersonnelYhkhBankcode) {
        this.salePersonnelYhkhBankcode = salePersonnelYhkhBankcode;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelYhkhBankcode() {
        return this.salePersonnelYhkhBankcode;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelYhkhUser(String salePersonnelYhkhUser) {
        this.salePersonnelYhkhUser = salePersonnelYhkhUser;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelYhkhUser() {
        return this.salePersonnelYhkhUser;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelCx(String salePersonnelCx) {
        this.salePersonnelCx = salePersonnelCx;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelCx() {
        return this.salePersonnelCx;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelCph(String salePersonnelCph) {
        this.salePersonnelCph = salePersonnelCph;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelCph() {
        return this.salePersonnelCph;
    }

        /**
         * setter for column
         */
        public void setSalePersonnelAgentSfzh(String salePersonnelAgentSfzh) {
        this.salePersonnelAgentSfzh = salePersonnelAgentSfzh;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelAgentSfzh() {
        return this.salePersonnelAgentSfzh;
    }

        /**
         * setter for column
         */
        public void setActivatecardPersonnel(String activatecardPersonnel) {
        this.activatecardPersonnel = activatecardPersonnel;
    }

        /**
         * getter for column
         */
        public String getActivatecardPersonnel() {
        return this.activatecardPersonnel;
    }

        /**
         * setter for column
         */
        public void setActivatecardDate(String activatecardDate) {
        this.activatecardDate = activatecardDate;
    }

        /**
         * getter for column
         */
        public String getActivatecardDate() {
        return this.activatecardDate;
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
        public void setActivatecardFrom(String activatecardFrom) {
        this.activatecardFrom = activatecardFrom;
    }

        /**
         * getter for column
         */
        public String getActivatecardFrom() {
        return this.activatecardFrom;
    }

        /**
         * setter for column
         */
        public void setActivatecardState(String activatecardState) {
        this.activatecardState = activatecardState;
    }

        /**
         * getter for column
         */
        public String getActivatecardState() {
        return this.activatecardState;
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
        public void setFoodsourcepersonnel(String foodsourcepersonnel) {
        this.foodsourcepersonnel = foodsourcepersonnel;
    }

        /**
         * getter for column
         */
        public String getFoodsourcepersonnel() {
        return this.foodsourcepersonnel;
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
        public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

        /**
         * getter for column
         */
        public String getCompanyname() {
        return this.companyname;
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
        public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

        /**
         * getter for column
         */
        public String getCustomercode() {
        return this.customercode;
    }

        /**
         * setter for column
         */
        public void setReapyearcode(String reapyearcode) {
        this.reapyearcode = reapyearcode;
    }

        /**
         * getter for column
         */
        public String getReapyearcode() {
        return this.reapyearcode;
    }

        /**
         * setter for column
         */
        public void setFoodsourceplacecode(String foodsourceplacecode) {
        this.foodsourceplacecode = foodsourceplacecode;
    }

        /**
         * getter for column
         */
        public String getFoodsourceplacecode() {
        return this.foodsourceplacecode;
    }

        /**
         * setter for column
         */
        public void setFoodsourceplacename(String foodsourceplacename) {
        this.foodsourceplacename = foodsourceplacename;
    }

        /**
         * getter for column
         */
        public String getFoodsourceplacename() {
        return this.foodsourceplacename;
    }

        /**
         * setter for column
         */
        public void setBuytype(String buytype) {
        this.buytype = buytype;
    }

        /**
         * getter for column
         */
        public String getBuytype() {
        return this.buytype;
    }

        /**
         * setter for column
         */
        public void setContractstate(String contractstate) {
        this.contractstate = contractstate;
    }

        /**
         * getter for column
         */
        public String getContractstate() {
        return this.contractstate;
    }

        /**
         * setter for column
         */
        public void setContractcode(String contractcode) {
        this.contractcode = contractcode;
    }

        /**
         * getter for column
         */
        public String getContractcode() {
        return this.contractcode;
    }

        /**
         * setter for column
         */
        public void setPurchasetypedetailedcode(String purchasetypedetailedcode) {
        this.purchasetypedetailedcode = purchasetypedetailedcode;
    }

        /**
         * getter for column
         */
        public String getPurchasetypedetailedcode() {
        return this.purchasetypedetailedcode;
    }

        /**
         * setter for column
         */
        public void setPurchasetypedetailedname(String purchasetypedetailedname) {
        this.purchasetypedetailedname = purchasetypedetailedname;
    }

        /**
         * getter for column
         */
        public String getPurchasetypedetailedname() {
        return this.purchasetypedetailedname;
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
        public void setSalePersonnelAgentName(String salePersonnelAgentName) {
        this.salePersonnelAgentName = salePersonnelAgentName;
    }

        /**
         * getter for column
         */
        public String getSalePersonnelAgentName() {
        return this.salePersonnelAgentName;
    }

        /**
         * setter for column
         */
        public void setTemplatecode(String templatecode) {
        this.templatecode = templatecode;
    }

        /**
         * getter for column
         */
        public String getTemplatecode() {
        return this.templatecode;
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
