package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_REPLC")
public class Replc {

    private String custType = "";
    private String custCode = "";
    private String maker = "";
    private String histRegistDe = "";
    private String actionCode = "";
    private String custRootType = "";
    private String custRootCode = "";
    private String custPartType = "";
    private String custPartCode = "";
    private String custSvcType = "";
    private String custSvcCode = "";
    private String custAcctType = "";
    private String custAcctCode = "";
    private String custOldType = "";
    private String custOldCode = "";
    private String custSvdType = "";
    private String custSvdCode = "";
    private String regDttm = "";
    private String busiId = "";
    private String pgdtName = "";
    private String firmName = "";
    private String busiKind = "";
    private String busiType = "";
    private String cnfmBank = "";
    private String cnfmPassNo = "";
    private String cnfmPassOwnr = "";
    private String cnfmCond = "";
    private String mlno01 = "";
    private String mlno02 = "";
    private String addrCi = "";
    private String addrGu = "";
    private String addrDong = "";
    private String addrBngi = "";
    private String telNo01 = "";
    private String telNo02 = "";
    private String cellPhone = "";
    private String faxNo = "";
    private String reprMan = "";
    private String reprPgdt = "";
    private String lobCond = "";
    private String partCond = "";
    private String vatCond = "";
    private String ugntPrceMrgn = "";
    private String warrPrceCond = "";
    private String warrPrceRate = "";
    private String salePrceCond = "";
    private String salePrceRate = "";
    private String acctCnfmCond = "";
    private String chngDttm = "";
    private String stat = "";
    private String custKugminType = "";
    private String custKugminCode = "";
    private String ctrToCtrFlag = "";
    private String ctrNum = "";
    private String passwd = "";
    private String histOk = "";
    private String vndrGubn = "";
    private String custReprNo = "";
    private String areaGroupCd = "";


    public Replc() {
    }


    public Replc(String custType, String custCode, String maker, String histRegistDe, String actionCode, String custRootType, String custRootCode,
            String custPartType, String custPartCode, String custSvcType, String custSvcCode, String custAcctType, String custAcctCode, String custOldType,
            String custOldCode, String custSvdType, String custSvdCode, String regDttm, String busiId, String pgdtName, String firmName, String busiKind,
            String busiType, String cnfmBank, String cnfmPassNo, String cnfmPassOwnr, String cnfmCond, String mlno01, String mlno02, String addrCi,
            String addrGu, String addrDong, String addrBngi, String telNo01, String telNo02, String cellPhone, String faxNo, String reprMan, String reprPgdt,
            String lobCond, String partCond, String vatCond, String ugntPrceMrgn, String warrPrceCond, String warrPrceRate, String salePrceCond,
            String salePrceRate, String acctCnfmCond, String chngDttm, String stat, String custKugminType, String custKugminCode, String ctrToCtrFlag,
            String ctrNum, String passwd, String histOk, String vndrGubn, String custReprNo, String areaGroupCd) {
        super();
        this.custType = custType;
        this.custCode = custCode;
        this.maker = maker;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
        this.custRootType = custRootType;
        this.custRootCode = custRootCode;
        this.custPartType = custPartType;
        this.custPartCode = custPartCode;
        this.custSvcType = custSvcType;
        this.custSvcCode = custSvcCode;
        this.custAcctType = custAcctType;
        this.custAcctCode = custAcctCode;
        this.custOldType = custOldType;
        this.custOldCode = custOldCode;
        this.custSvdType = custSvdType;
        this.custSvdCode = custSvdCode;
        this.regDttm = regDttm;
        this.busiId = busiId;
        this.pgdtName = pgdtName;
        this.firmName = firmName;
        this.busiKind = busiKind;
        this.busiType = busiType;
        this.cnfmBank = cnfmBank;
        this.cnfmPassNo = cnfmPassNo;
        this.cnfmPassOwnr = cnfmPassOwnr;
        this.cnfmCond = cnfmCond;
        this.mlno01 = mlno01;
        this.mlno02 = mlno02;
        this.addrCi = addrCi;
        this.addrGu = addrGu;
        this.addrDong = addrDong;
        this.addrBngi = addrBngi;
        this.telNo01 = telNo01;
        this.telNo02 = telNo02;
        this.cellPhone = cellPhone;
        this.faxNo = faxNo;
        this.reprMan = reprMan;
        this.reprPgdt = reprPgdt;
        this.lobCond = lobCond;
        this.partCond = partCond;
        this.vatCond = vatCond;
        this.ugntPrceMrgn = ugntPrceMrgn;
        this.warrPrceCond = warrPrceCond;
        this.warrPrceRate = warrPrceRate;
        this.salePrceCond = salePrceCond;
        this.salePrceRate = salePrceRate;
        this.acctCnfmCond = acctCnfmCond;
        this.chngDttm = chngDttm;
        this.stat = stat;
        this.custKugminType = custKugminType;
        this.custKugminCode = custKugminCode;
        this.ctrToCtrFlag = ctrToCtrFlag;
        this.ctrNum = ctrNum;
        this.passwd = passwd;
        this.histOk = histOk;
        this.vndrGubn = vndrGubn;
        this.custReprNo = custReprNo;
        this.areaGroupCd = areaGroupCd;
    }


    @Override
    public String toString() {

        return "Replc [custType=" + custType + ", custCode=" + custCode + ", maker=" + maker + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode
                + ", custRootType=" + custRootType + ", custRootCode=" + custRootCode + ", custPartType=" + custPartType + ", custPartCode=" + custPartCode
                + ", custSvcType=" + custSvcType + ", custSvcCode=" + custSvcCode + ", custAcctType=" + custAcctType + ", custAcctCode=" + custAcctCode
                + ", custOldType=" + custOldType + ", custOldCode=" + custOldCode + ", custSvdType=" + custSvdType + ", custSvdCode=" + custSvdCode
                + ", regDttm=" + regDttm + ", busiId=" + busiId + ", pgdtName=" + pgdtName + ", firmName=" + firmName + ", busiKind=" + busiKind + ", busiType="
                + busiType + ", cnfmBank=" + cnfmBank + ", cnfmPassNo=" + cnfmPassNo + ", cnfmPassOwnr=" + cnfmPassOwnr + ", cnfmCond=" + cnfmCond + ", mlno01="
                + mlno01 + ", mlno02=" + mlno02 + ", addrCi=" + addrCi + ", addrGu=" + addrGu + ", addrDong=" + addrDong + ", addrBngi=" + addrBngi
                + ", telNo01=" + telNo01 + ", telNo02=" + telNo02 + ", cellPhone=" + cellPhone + ", faxNo=" + faxNo + ", reprMan=" + reprMan + ", reprPgdt="
                + reprPgdt + ", lobCond=" + lobCond + ", partCond=" + partCond + ", vatCond=" + vatCond + ", ugntPrceMrgn=" + ugntPrceMrgn + ", warrPrceCond="
                + warrPrceCond + ", warrPrceRate=" + warrPrceRate + ", salePrceCond=" + salePrceCond + ", salePrceRate=" + salePrceRate + ", acctCnfmCond="
                + acctCnfmCond + ", chngDttm=" + chngDttm + ", stat=" + stat + ", custKugminType=" + custKugminType + ", custKugminCode=" + custKugminCode
                + ", ctrToCtrFlag=" + ctrToCtrFlag + ", ctrNum=" + ctrNum + ", passwd=" + passwd + ", histOk=" + histOk + ", vndrGubn=" + vndrGubn
                + ", custReprNo=" + custReprNo + ", areaGroupCd=" + areaGroupCd + "]";
    }


    public String getCustType() {

        return custType;
    }


    public void setCustType(String custType) {

        this.custType = custType;
    }


    public String getCustCode() {

        return custCode;
    }


    public void setCustCode(String custCode) {

        this.custCode = custCode;
    }


    public String getMaker() {

        return maker;
    }


    public void setMaker(String maker) {

        this.maker = maker;
    }


    public String getHistRegistDe() {

        return histRegistDe;
    }


    public void setHistRegistDe(String histRegistDe) {

        this.histRegistDe = histRegistDe;
    }


    public String getActionCode() {

        return actionCode;
    }


    public void setActionCode(String actionCode) {

        this.actionCode = actionCode;
    }


    public String getCustRootType() {

        return custRootType;
    }


    public void setCustRootType(String custRootType) {

        this.custRootType = custRootType;
    }


    public String getCustRootCode() {

        return custRootCode;
    }


    public void setCustRootCode(String custRootCode) {

        this.custRootCode = custRootCode;
    }


    public String getCustPartType() {

        return custPartType;
    }


    public void setCustPartType(String custPartType) {

        this.custPartType = custPartType;
    }


    public String getCustPartCode() {

        return custPartCode;
    }


    public void setCustPartCode(String custPartCode) {

        this.custPartCode = custPartCode;
    }


    public String getCustSvcType() {

        return custSvcType;
    }


    public void setCustSvcType(String custSvcType) {

        this.custSvcType = custSvcType;
    }


    public String getCustSvcCode() {

        return custSvcCode;
    }


    public void setCustSvcCode(String custSvcCode) {

        this.custSvcCode = custSvcCode;
    }


    public String getCustAcctType() {

        return custAcctType;
    }


    public void setCustAcctType(String custAcctType) {

        this.custAcctType = custAcctType;
    }


    public String getCustAcctCode() {

        return custAcctCode;
    }


    public void setCustAcctCode(String custAcctCode) {

        this.custAcctCode = custAcctCode;
    }


    public String getCustOldType() {

        return custOldType;
    }


    public void setCustOldType(String custOldType) {

        this.custOldType = custOldType;
    }


    public String getCustOldCode() {

        return custOldCode;
    }


    public void setCustOldCode(String custOldCode) {

        this.custOldCode = custOldCode;
    }


    public String getCustSvdType() {

        return custSvdType;
    }


    public void setCustSvdType(String custSvdType) {

        this.custSvdType = custSvdType;
    }


    public String getCustSvdCode() {

        return custSvdCode;
    }


    public void setCustSvdCode(String custSvdCode) {

        this.custSvdCode = custSvdCode;
    }


    public String getRegDttm() {

        return regDttm;
    }


    public void setRegDttm(String regDttm) {

        this.regDttm = regDttm;
    }


    public String getBusiId() {

        return busiId;
    }


    public void setBusiId(String busiId) {

        this.busiId = busiId;
    }


    public String getPgdtName() {

        return pgdtName;
    }


    public void setPgdtName(String pgdtName) {

        this.pgdtName = pgdtName;
    }


    public String getFirmName() {

        return firmName;
    }


    public void setFirmName(String firmName) {

        this.firmName = firmName;
    }


    public String getBusiKind() {

        return busiKind;
    }


    public void setBusiKind(String busiKind) {

        this.busiKind = busiKind;
    }


    public String getBusiType() {

        return busiType;
    }


    public void setBusiType(String busiType) {

        this.busiType = busiType;
    }


    public String getCnfmBank() {

        return cnfmBank;
    }


    public void setCnfmBank(String cnfmBank) {

        this.cnfmBank = cnfmBank;
    }


    public String getCnfmPassNo() {

        return cnfmPassNo;
    }


    public void setCnfmPassNo(String cnfmPassNo) {

        this.cnfmPassNo = cnfmPassNo;
    }


    public String getCnfmPassOwnr() {

        return cnfmPassOwnr;
    }


    public void setCnfmPassOwnr(String cnfmPassOwnr) {

        this.cnfmPassOwnr = cnfmPassOwnr;
    }


    public String getCnfmCond() {

        return cnfmCond;
    }


    public void setCnfmCond(String cnfmCond) {

        this.cnfmCond = cnfmCond;
    }


    public String getMlno01() {

        return mlno01;
    }


    public void setMlno01(String mlno01) {

        this.mlno01 = mlno01;
    }


    public String getMlno02() {

        return mlno02;
    }


    public void setMlno02(String mlno02) {

        this.mlno02 = mlno02;
    }


    public String getAddrCi() {

        return addrCi;
    }


    public void setAddrCi(String addrCi) {

        this.addrCi = addrCi;
    }


    public String getAddrGu() {

        return addrGu;
    }


    public void setAddrGu(String addrGu) {

        this.addrGu = addrGu;
    }


    public String getAddrDong() {

        return addrDong;
    }


    public void setAddrDong(String addrDong) {

        this.addrDong = addrDong;
    }


    public String getAddrBngi() {

        return addrBngi;
    }


    public void setAddrBngi(String addrBngi) {

        this.addrBngi = addrBngi;
    }


    public String getTelNo01() {

        return telNo01;
    }


    public void setTelNo01(String telNo01) {

        this.telNo01 = telNo01;
    }


    public String getTelNo02() {

        return telNo02;
    }


    public void setTelNo02(String telNo02) {

        this.telNo02 = telNo02;
    }


    public String getCellPhone() {

        return cellPhone;
    }


    public void setCellPhone(String cellPhone) {

        this.cellPhone = cellPhone;
    }


    public String getFaxNo() {

        return faxNo;
    }


    public void setFaxNo(String faxNo) {

        this.faxNo = faxNo;
    }


    public String getReprMan() {

        return reprMan;
    }


    public void setReprMan(String reprMan) {

        this.reprMan = reprMan;
    }


    public String getReprPgdt() {

        return reprPgdt;
    }


    public void setReprPgdt(String reprPgdt) {

        this.reprPgdt = reprPgdt;
    }


    public String getLobCond() {

        return lobCond;
    }


    public void setLobCond(String lobCond) {

        this.lobCond = lobCond;
    }


    public String getPartCond() {

        return partCond;
    }


    public void setPartCond(String partCond) {

        this.partCond = partCond;
    }


    public String getVatCond() {

        return vatCond;
    }


    public void setVatCond(String vatCond) {

        this.vatCond = vatCond;
    }


    public String getUgntPrceMrgn() {

        return ugntPrceMrgn;
    }


    public void setUgntPrceMrgn(String ugntPrceMrgn) {

        this.ugntPrceMrgn = ugntPrceMrgn;
    }


    public String getWarrPrceCond() {

        return warrPrceCond;
    }


    public void setWarrPrceCond(String warrPrceCond) {

        this.warrPrceCond = warrPrceCond;
    }


    public String getWarrPrceRate() {

        return warrPrceRate;
    }


    public void setWarrPrceRate(String warrPrceRate) {

        this.warrPrceRate = warrPrceRate;
    }


    public String getSalePrceCond() {

        return salePrceCond;
    }


    public void setSalePrceCond(String salePrceCond) {

        this.salePrceCond = salePrceCond;
    }


    public String getSalePrceRate() {

        return salePrceRate;
    }


    public void setSalePrceRate(String salePrceRate) {

        this.salePrceRate = salePrceRate;
    }


    public String getAcctCnfmCond() {

        return acctCnfmCond;
    }


    public void setAcctCnfmCond(String acctCnfmCond) {

        this.acctCnfmCond = acctCnfmCond;
    }


    public String getChngDttm() {

        return chngDttm;
    }


    public void setChngDttm(String chngDttm) {

        this.chngDttm = chngDttm;
    }


    public String getStat() {

        return stat;
    }


    public void setStat(String stat) {

        this.stat = stat;
    }


    public String getCustKugminType() {

        return custKugminType;
    }


    public void setCustKugminType(String custKugminType) {

        this.custKugminType = custKugminType;
    }


    public String getCustKugminCode() {

        return custKugminCode;
    }


    public void setCustKugminCode(String custKugminCode) {

        this.custKugminCode = custKugminCode;
    }


    public String getCtrToCtrFlag() {

        return ctrToCtrFlag;
    }


    public void setCtrToCtrFlag(String ctrToCtrFlag) {

        this.ctrToCtrFlag = ctrToCtrFlag;
    }


    public String getCtrNum() {

        return ctrNum;
    }


    public void setCtrNum(String ctrNum) {

        this.ctrNum = ctrNum;
    }


    public String getPasswd() {

        return passwd;
    }


    public void setPasswd(String passwd) {

        this.passwd = passwd;
    }


    public String getHistOk() {

        return histOk;
    }


    public void setHistOk(String histOk) {

        this.histOk = histOk;
    }


    public String getVndrGubn() {

        return vndrGubn;
    }


    public void setVndrGubn(String vndrGubn) {

        this.vndrGubn = vndrGubn;
    }


    public String getCustReprNo() {

        return custReprNo;
    }


    public void setCustReprNo(String custReprNo) {

        this.custReprNo = custReprNo;
    }


    public String getAreaGroupCd() {

        return areaGroupCd;
    }


    public void setAreaGroupCd(String areaGroupCd) {

        this.areaGroupCd = areaGroupCd;
    }

}
