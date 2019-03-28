package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_MNTNC_CSTMR")
public class MntncCstmr {

    private String vinComp = "";
    private String vinType = "";
    private String vinCheck = "";
    private String vinMdlYear = "";
    private String vinPlan = "";
    private String vinBodyNo = "";
    private String vinDup = "";
    private String vehiNo01 = "";
    private String vehiNo02 = "";
    private String maker = "";
    private String custId = "";
    private String mailId = "";
    private String mlno01 = "";
    private String mlno02 = "";
    private String addrCi = "";
    private String addrGu = "";
    private String addrDong = "";
    private String addrBngi = "";
    private String bossName = "";
    private String frstRcptDate = "";
    private String lastRcptDate = "";
    private String lastReadKm = "";
    private String telNo01 = "";
    private String telNo02 = "";
    private String faxNo = "";
    private String cellPhone = "";
    private String inform = "";
    private String regId = "";
    private String regDttm = "";
    private String mailGubn = "";
    private String officeNo = "";
    private String addrGubn = "";
    private String ipinDi = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public MntncCstmr() {
    }


    public MntncCstmr(String vinComp, String vinType, String vinCheck, String vinMdlYear, String vinPlan, String vinBodyNo, String vinDup, String vehiNo01,
            String vehiNo02, String maker, String custId, String mailId, String mlno01, String mlno02, String addrCi, String addrGu, String addrDong,
            String addrBngi, String bossName, String frstRcptDate, String lastRcptDate, String lastReadKm, String telNo01, String telNo02, String faxNo,
            String cellPhone, String inform, String regId, String regDttm, String mailGubn, String officeNo, String addrGubn, String ipinDi,
            String histRegistDe, String actionCode) {
        super();
        this.vinComp = vinComp;
        this.vinType = vinType;
        this.vinCheck = vinCheck;
        this.vinMdlYear = vinMdlYear;
        this.vinPlan = vinPlan;
        this.vinBodyNo = vinBodyNo;
        this.vinDup = vinDup;
        this.vehiNo01 = vehiNo01;
        this.vehiNo02 = vehiNo02;
        this.maker = maker;
        this.custId = custId;
        this.mailId = mailId;
        this.mlno01 = mlno01;
        this.mlno02 = mlno02;
        this.addrCi = addrCi;
        this.addrGu = addrGu;
        this.addrDong = addrDong;
        this.addrBngi = addrBngi;
        this.bossName = bossName;
        this.frstRcptDate = frstRcptDate;
        this.lastRcptDate = lastRcptDate;
        this.lastReadKm = lastReadKm;
        this.telNo01 = telNo01;
        this.telNo02 = telNo02;
        this.faxNo = faxNo;
        this.cellPhone = cellPhone;
        this.inform = inform;
        this.regId = regId;
        this.regDttm = regDttm;
        this.mailGubn = mailGubn;
        this.officeNo = officeNo;
        this.addrGubn = addrGubn;
        this.ipinDi = ipinDi;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "MntncCstmr [vinComp=" + vinComp + ", vinType=" + vinType + ", vinCheck=" + vinCheck + ", vinMdlYear=" + vinMdlYear + ", vinPlan=" + vinPlan
                + ", vinBodyNo=" + vinBodyNo + ", vinDup=" + vinDup + ", vehiNo01=" + vehiNo01 + ", vehiNo02=" + vehiNo02 + ", maker=" + maker + ", custId="
                + custId + ", mailId=" + mailId + ", mlno01=" + mlno01 + ", mlno02=" + mlno02 + ", addrCi=" + addrCi + ", addrGu=" + addrGu + ", addrDong="
                + addrDong + ", addrBngi=" + addrBngi + ", bossName=" + bossName + ", frstRcptDate=" + frstRcptDate + ", lastRcptDate=" + lastRcptDate
                + ", lastReadKm=" + lastReadKm + ", telNo01=" + telNo01 + ", telNo02=" + telNo02 + ", faxNo=" + faxNo + ", cellPhone=" + cellPhone + ", inform="
                + inform + ", regId=" + regId + ", regDttm=" + regDttm + ", mailGubn=" + mailGubn + ", officeNo=" + officeNo + ", addrGubn=" + addrGubn
                + ", ipinDi=" + ipinDi + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getVinComp() {

        return vinComp;
    }


    public void setVinComp(String vinComp) {

        this.vinComp = vinComp;
    }


    public String getVinType() {

        return vinType;
    }


    public void setVinType(String vinType) {

        this.vinType = vinType;
    }


    public String getVinCheck() {

        return vinCheck;
    }


    public void setVinCheck(String vinCheck) {

        this.vinCheck = vinCheck;
    }


    public String getVinMdlYear() {

        return vinMdlYear;
    }


    public void setVinMdlYear(String vinMdlYear) {

        this.vinMdlYear = vinMdlYear;
    }


    public String getVinPlan() {

        return vinPlan;
    }


    public void setVinPlan(String vinPlan) {

        this.vinPlan = vinPlan;
    }


    public String getVinBodyNo() {

        return vinBodyNo;
    }


    public void setVinBodyNo(String vinBodyNo) {

        this.vinBodyNo = vinBodyNo;
    }


    public String getVinDup() {

        return vinDup;
    }


    public void setVinDup(String vinDup) {

        this.vinDup = vinDup;
    }


    public String getVehiNo01() {

        return vehiNo01;
    }


    public void setVehiNo01(String vehiNo01) {

        this.vehiNo01 = vehiNo01;
    }


    public String getVehiNo02() {

        return vehiNo02;
    }


    public void setVehiNo02(String vehiNo02) {

        this.vehiNo02 = vehiNo02;
    }


    public String getMaker() {

        return maker;
    }


    public void setMaker(String maker) {

        this.maker = maker;
    }


    public String getCustId() {

        return custId;
    }


    public void setCustId(String custId) {

        this.custId = custId;
    }


    public String getMailId() {

        return mailId;
    }


    public void setMailId(String mailId) {

        this.mailId = mailId;
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


    public String getBossName() {

        return bossName;
    }


    public void setBossName(String bossName) {

        this.bossName = bossName;
    }


    public String getFrstRcptDate() {

        return frstRcptDate;
    }


    public void setFrstRcptDate(String frstRcptDate) {

        this.frstRcptDate = frstRcptDate;
    }


    public String getLastRcptDate() {

        return lastRcptDate;
    }


    public void setLastRcptDate(String lastRcptDate) {

        this.lastRcptDate = lastRcptDate;
    }


    public String getLastReadKm() {

        return lastReadKm;
    }


    public void setLastReadKm(String lastReadKm) {

        this.lastReadKm = lastReadKm;
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


    public String getFaxNo() {

        return faxNo;
    }


    public void setFaxNo(String faxNo) {

        this.faxNo = faxNo;
    }


    public String getCellPhone() {

        return cellPhone;
    }


    public void setCellPhone(String cellPhone) {

        this.cellPhone = cellPhone;
    }


    public String getInform() {

        return inform;
    }


    public void setInform(String inform) {

        this.inform = inform;
    }


    public String getRegId() {

        return regId;
    }


    public void setRegId(String regId) {

        this.regId = regId;
    }


    public String getRegDttm() {

        return regDttm;
    }


    public void setRegDttm(String regDttm) {

        this.regDttm = regDttm;
    }


    public String getMailGubn() {

        return mailGubn;
    }


    public void setMailGubn(String mailGubn) {

        this.mailGubn = mailGubn;
    }


    public String getOfficeNo() {

        return officeNo;
    }


    public void setOfficeNo(String officeNo) {

        this.officeNo = officeNo;
    }


    public String getAddrGubn() {

        return addrGubn;
    }


    public void setAddrGubn(String addrGubn) {

        this.addrGubn = addrGubn;
    }


    public String getIpinDi() {

        return ipinDi;
    }


    public void setIpinDi(String ipinDi) {

        this.ipinDi = ipinDi;
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

}
