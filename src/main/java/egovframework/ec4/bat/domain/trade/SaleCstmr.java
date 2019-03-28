package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_SALE_CSTMR")
public class SaleCstmr {

    private String dealerCd = "";
    private String busResNo = "";
    private String brchCd = "";
    private String saleManCd = "";
    private String handPhoneNo = "";
    private String email = "";
    private String customerCd = "";
    private String taxCd = "";
    private String salesPromotionCd = "";
    private String legalPostCd = "";
    private String residentNo = "";
    private String residentNm = "";
    private String residentPhoneNo = "";
    private String residentPostCd = "";
    private String residentPostAddr = "";
    private String residentPostAddr2 = "";
    private String residentAddr = "";
    private String businessNm = "";
    private String businessPhoneNo = "";
    private String businessPostCd = "";
    private String businessPostAddr = "";
    private String businessPostAddr2 = "";
    private String businessAddr = "";
    private String industryTp = "";
    private String businessTp = "";
    private String customerGu = "";
    private String brchCoYn = "";
    private String badResidentDesc = "";
    private String badResidentReq = "";
    private String hobbyCd = "";
    private String industryCd = "";
    private String jobCd = "";
    private String vipYn = "";
    private String comRegNo = "";
    private String comName = "";
    private String positionCd = "";
    private String carLicenseNo = "";
    private String juminPostCd = "";
    private String juminPostAddr = "";
    private String juminPostAddr2 = "";
    private String regDate = "";
    private String updtDate = "";
    private String updtUserCd = "";
    private String residentFaxNo = "";
    private String badResidentReqDt = "";
    private String residentPostRegNo = "";
    private String businessPostRegNo = "";
    private String juminPostRegNo = "";
    private String ipinDi = "";
    private String ipinCi = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public SaleCstmr() {
    }


    public SaleCstmr(String dealerCd, String busResNo, String brchCd, String saleManCd, String handPhoneNo, String email, String customerCd, String taxCd,
            String salesPromotionCd, String legalPostCd, String residentNo, String residentNm, String residentPhoneNo, String residentPostCd,
            String residentPostAddr, String residentPostAddr2, String residentAddr, String businessNm, String businessPhoneNo, String businessPostCd,
            String businessPostAddr, String businessPostAddr2, String businessAddr, String industryTp, String businessTp, String customerGu, String brchCoYn,
            String badResidentDesc, String badResidentReq, String hobbyCd, String industryCd, String jobCd, String vipYn, String comRegNo, String comName,
            String positionCd, String carLicenseNo, String juminPostCd, String juminPostAddr, String juminPostAddr2, String regDate, String updtDate,
            String updtUserCd, String residentFaxNo, String badResidentReqDt, String residentPostRegNo, String businessPostRegNo, String juminPostRegNo,
            String ipinDi, String ipinCi, String histRegistDe, String actionCode) {
        super();
        this.dealerCd = dealerCd;
        this.busResNo = busResNo;
        this.brchCd = brchCd;
        this.saleManCd = saleManCd;
        this.handPhoneNo = handPhoneNo;
        this.email = email;
        this.customerCd = customerCd;
        this.taxCd = taxCd;
        this.salesPromotionCd = salesPromotionCd;
        this.legalPostCd = legalPostCd;
        this.residentNo = residentNo;
        this.residentNm = residentNm;
        this.residentPhoneNo = residentPhoneNo;
        this.residentPostCd = residentPostCd;
        this.residentPostAddr = residentPostAddr;
        this.residentPostAddr2 = residentPostAddr2;
        this.residentAddr = residentAddr;
        this.businessNm = businessNm;
        this.businessPhoneNo = businessPhoneNo;
        this.businessPostCd = businessPostCd;
        this.businessPostAddr = businessPostAddr;
        this.businessPostAddr2 = businessPostAddr2;
        this.businessAddr = businessAddr;
        this.industryTp = industryTp;
        this.businessTp = businessTp;
        this.customerGu = customerGu;
        this.brchCoYn = brchCoYn;
        this.badResidentDesc = badResidentDesc;
        this.badResidentReq = badResidentReq;
        this.hobbyCd = hobbyCd;
        this.industryCd = industryCd;
        this.jobCd = jobCd;
        this.vipYn = vipYn;
        this.comRegNo = comRegNo;
        this.comName = comName;
        this.positionCd = positionCd;
        this.carLicenseNo = carLicenseNo;
        this.juminPostCd = juminPostCd;
        this.juminPostAddr = juminPostAddr;
        this.juminPostAddr2 = juminPostAddr2;
        this.regDate = regDate;
        this.updtDate = updtDate;
        this.updtUserCd = updtUserCd;
        this.residentFaxNo = residentFaxNo;
        this.badResidentReqDt = badResidentReqDt;
        this.residentPostRegNo = residentPostRegNo;
        this.businessPostRegNo = businessPostRegNo;
        this.juminPostRegNo = juminPostRegNo;
        this.ipinDi = ipinDi;
        this.ipinCi = ipinCi;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "SaleCstmr [dealerCd=" + dealerCd + ", busResNo=" + busResNo + ", brchCd=" + brchCd + ", saleManCd=" + saleManCd + ", handPhoneNo=" + handPhoneNo
                + ", email=" + email + ", customerCd=" + customerCd + ", taxCd=" + taxCd + ", salesPromotionCd=" + salesPromotionCd + ", legalPostCd="
                + legalPostCd + ", residentNo=" + residentNo + ", residentNm=" + residentNm + ", residentPhoneNo=" + residentPhoneNo + ", residentPostCd="
                + residentPostCd + ", residentPostAddr=" + residentPostAddr + ", residentPostAddr2=" + residentPostAddr2 + ", residentAddr=" + residentAddr
                + ", businessNm=" + businessNm + ", businessPhoneNo=" + businessPhoneNo + ", businessPostCd=" + businessPostCd + ", businessPostAddr="
                + businessPostAddr + ", businessPostAddr2=" + businessPostAddr2 + ", businessAddr=" + businessAddr + ", industryTp=" + industryTp
                + ", businessTp=" + businessTp + ", customerGu=" + customerGu + ", brchCoYn=" + brchCoYn + ", badResidentDesc=" + badResidentDesc
                + ", badResidentReq=" + badResidentReq + ", hobbyCd=" + hobbyCd + ", industryCd=" + industryCd + ", jobCd=" + jobCd + ", vipYn=" + vipYn
                + ", comRegNo=" + comRegNo + ", comName=" + comName + ", positionCd=" + positionCd + ", carLicenseNo=" + carLicenseNo + ", juminPostCd="
                + juminPostCd + ", juminPostAddr=" + juminPostAddr + ", juminPostAddr2=" + juminPostAddr2 + ", regDate=" + regDate + ", updtDate=" + updtDate
                + ", updtUserCd=" + updtUserCd + ", residentFaxNo=" + residentFaxNo + ", badResidentReqDt=" + badResidentReqDt + ", residentPostRegNo="
                + residentPostRegNo + ", businessPostRegNo=" + businessPostRegNo + ", juminPostRegNo=" + juminPostRegNo + ", ipinDi=" + ipinDi + ", ipinCi="
                + ipinCi + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getDealerCd() {

        return dealerCd;
    }


    public void setDealerCd(String dealerCd) {

        this.dealerCd = dealerCd;
    }


    public String getBusResNo() {

        return busResNo;
    }


    public void setBusResNo(String busResNo) {

        this.busResNo = busResNo;
    }


    public String getBrchCd() {

        return brchCd;
    }


    public void setBrchCd(String brchCd) {

        this.brchCd = brchCd;
    }


    public String getSaleManCd() {

        return saleManCd;
    }


    public void setSaleManCd(String saleManCd) {

        this.saleManCd = saleManCd;
    }


    public String getHandPhoneNo() {

        return handPhoneNo;
    }


    public void setHandPhoneNo(String handPhoneNo) {

        this.handPhoneNo = handPhoneNo;
    }


    public String getEmail() {

        return email;
    }


    public void setEmail(String email) {

        this.email = email;
    }


    public String getCustomerCd() {

        return customerCd;
    }


    public void setCustomerCd(String customerCd) {

        this.customerCd = customerCd;
    }


    public String getTaxCd() {

        return taxCd;
    }


    public void setTaxCd(String taxCd) {

        this.taxCd = taxCd;
    }


    public String getSalesPromotionCd() {

        return salesPromotionCd;
    }


    public void setSalesPromotionCd(String salesPromotionCd) {

        this.salesPromotionCd = salesPromotionCd;
    }


    public String getLegalPostCd() {

        return legalPostCd;
    }


    public void setLegalPostCd(String legalPostCd) {

        this.legalPostCd = legalPostCd;
    }


    public String getResidentNo() {

        return residentNo;
    }


    public void setResidentNo(String residentNo) {

        this.residentNo = residentNo;
    }


    public String getResidentNm() {

        return residentNm;
    }


    public void setResidentNm(String residentNm) {

        this.residentNm = residentNm;
    }


    public String getResidentPhoneNo() {

        return residentPhoneNo;
    }


    public void setResidentPhoneNo(String residentPhoneNo) {

        this.residentPhoneNo = residentPhoneNo;
    }


    public String getResidentPostCd() {

        return residentPostCd;
    }


    public void setResidentPostCd(String residentPostCd) {

        this.residentPostCd = residentPostCd;
    }


    public String getResidentPostAddr() {

        return residentPostAddr;
    }


    public void setResidentPostAddr(String residentPostAddr) {

        this.residentPostAddr = residentPostAddr;
    }


    public String getResidentPostAddr2() {

        return residentPostAddr2;
    }


    public void setResidentPostAddr2(String residentPostAddr2) {

        this.residentPostAddr2 = residentPostAddr2;
    }


    public String getResidentAddr() {

        return residentAddr;
    }


    public void setResidentAddr(String residentAddr) {

        this.residentAddr = residentAddr;
    }


    public String getBusinessNm() {

        return businessNm;
    }


    public void setBusinessNm(String businessNm) {

        this.businessNm = businessNm;
    }


    public String getBusinessPhoneNo() {

        return businessPhoneNo;
    }


    public void setBusinessPhoneNo(String businessPhoneNo) {

        this.businessPhoneNo = businessPhoneNo;
    }


    public String getBusinessPostCd() {

        return businessPostCd;
    }


    public void setBusinessPostCd(String businessPostCd) {

        this.businessPostCd = businessPostCd;
    }


    public String getBusinessPostAddr() {

        return businessPostAddr;
    }


    public void setBusinessPostAddr(String businessPostAddr) {

        this.businessPostAddr = businessPostAddr;
    }


    public String getBusinessPostAddr2() {

        return businessPostAddr2;
    }


    public void setBusinessPostAddr2(String businessPostAddr2) {

        this.businessPostAddr2 = businessPostAddr2;
    }


    public String getBusinessAddr() {

        return businessAddr;
    }


    public void setBusinessAddr(String businessAddr) {

        this.businessAddr = businessAddr;
    }


    public String getIndustryTp() {

        return industryTp;
    }


    public void setIndustryTp(String industryTp) {

        this.industryTp = industryTp;
    }


    public String getBusinessTp() {

        return businessTp;
    }


    public void setBusinessTp(String businessTp) {

        this.businessTp = businessTp;
    }


    public String getCustomerGu() {

        return customerGu;
    }


    public void setCustomerGu(String customerGu) {

        this.customerGu = customerGu;
    }


    public String getBrchCoYn() {

        return brchCoYn;
    }


    public void setBrchCoYn(String brchCoYn) {

        this.brchCoYn = brchCoYn;
    }


    public String getBadResidentDesc() {

        return badResidentDesc;
    }


    public void setBadResidentDesc(String badResidentDesc) {

        this.badResidentDesc = badResidentDesc;
    }


    public String getBadResidentReq() {

        return badResidentReq;
    }


    public void setBadResidentReq(String badResidentReq) {

        this.badResidentReq = badResidentReq;
    }


    public String getHobbyCd() {

        return hobbyCd;
    }


    public void setHobbyCd(String hobbyCd) {

        this.hobbyCd = hobbyCd;
    }


    public String getIndustryCd() {

        return industryCd;
    }


    public void setIndustryCd(String industryCd) {

        this.industryCd = industryCd;
    }


    public String getJobCd() {

        return jobCd;
    }


    public void setJobCd(String jobCd) {

        this.jobCd = jobCd;
    }


    public String getVipYn() {

        return vipYn;
    }


    public void setVipYn(String vipYn) {

        this.vipYn = vipYn;
    }


    public String getComRegNo() {

        return comRegNo;
    }


    public void setComRegNo(String comRegNo) {

        this.comRegNo = comRegNo;
    }


    public String getComName() {

        return comName;
    }


    public void setComName(String comName) {

        this.comName = comName;
    }


    public String getPositionCd() {

        return positionCd;
    }


    public void setPositionCd(String positionCd) {

        this.positionCd = positionCd;
    }


    public String getCarLicenseNo() {

        return carLicenseNo;
    }


    public void setCarLicenseNo(String carLicenseNo) {

        this.carLicenseNo = carLicenseNo;
    }


    public String getJuminPostCd() {

        return juminPostCd;
    }


    public void setJuminPostCd(String juminPostCd) {

        this.juminPostCd = juminPostCd;
    }


    public String getJuminPostAddr() {

        return juminPostAddr;
    }


    public void setJuminPostAddr(String juminPostAddr) {

        this.juminPostAddr = juminPostAddr;
    }


    public String getJuminPostAddr2() {

        return juminPostAddr2;
    }


    public void setJuminPostAddr2(String juminPostAddr2) {

        this.juminPostAddr2 = juminPostAddr2;
    }


    public String getRegDate() {

        return regDate;
    }


    public void setRegDate(String regDate) {

        this.regDate = regDate;
    }


    public String getUpdtDate() {

        return updtDate;
    }


    public void setUpdtDate(String updtDate) {

        this.updtDate = updtDate;
    }


    public String getUpdtUserCd() {

        return updtUserCd;
    }


    public void setUpdtUserCd(String updtUserCd) {

        this.updtUserCd = updtUserCd;
    }


    public String getResidentFaxNo() {

        return residentFaxNo;
    }


    public void setResidentFaxNo(String residentFaxNo) {

        this.residentFaxNo = residentFaxNo;
    }


    public String getBadResidentReqDt() {

        return badResidentReqDt;
    }


    public void setBadResidentReqDt(String badResidentReqDt) {

        this.badResidentReqDt = badResidentReqDt;
    }


    public String getResidentPostRegNo() {

        return residentPostRegNo;
    }


    public void setResidentPostRegNo(String residentPostRegNo) {

        this.residentPostRegNo = residentPostRegNo;
    }


    public String getBusinessPostRegNo() {

        return businessPostRegNo;
    }


    public void setBusinessPostRegNo(String businessPostRegNo) {

        this.businessPostRegNo = businessPostRegNo;
    }


    public String getJuminPostRegNo() {

        return juminPostRegNo;
    }


    public void setJuminPostRegNo(String juminPostRegNo) {

        this.juminPostRegNo = juminPostRegNo;
    }


    public String getIpinDi() {

        return ipinDi;
    }


    public void setIpinDi(String ipinDi) {

        this.ipinDi = ipinDi;
    }


    public String getIpinCi() {

        return ipinCi;
    }


    public void setIpinCi(String ipinCi) {

        this.ipinCi = ipinCi;
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
