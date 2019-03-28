package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_RECALL_VHCLE")
public class RecallVhcle {

    private String vin = "";
    private String maker = "";
    private String campNo = "";
    private String custType = "";
    private String custCode = "";
    private String stat1 = "";
    private String stat2 = "";
    private String statDttm = "";
    private String rcptMark = "";
    private String regiDate = "";
    private String wcrNo = "";
    private String memo = "";
    private String contactShopCode = "";
    private String contactDate = "";
    private String gmContactDate = "";
    private String interStatus = "";
    private String exprDate = "";
    private String claimId = "";
    private String releaseDate = "";
    private String releaseBu = "";
    private String sendMailYn = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public RecallVhcle() {
    }


    public RecallVhcle(String vin, String maker, String campNo, String custType, String custCode, String stat1, String stat2, String statDttm, String rcptMark,
            String regiDate, String wcrNo, String memo, String contactShopCode, String contactDate, String gmContactDate, String interStatus, String exprDate,
            String claimId, String releaseDate, String releaseBu, String sendMailYn, String histRegistDe, String actionCode) {
        super();
        this.vin = vin;
        this.maker = maker;
        this.campNo = campNo;
        this.custType = custType;
        this.custCode = custCode;
        this.stat1 = stat1;
        this.stat2 = stat2;
        this.statDttm = statDttm;
        this.rcptMark = rcptMark;
        this.regiDate = regiDate;
        this.wcrNo = wcrNo;
        this.memo = memo;
        this.contactShopCode = contactShopCode;
        this.contactDate = contactDate;
        this.gmContactDate = gmContactDate;
        this.interStatus = interStatus;
        this.exprDate = exprDate;
        this.claimId = claimId;
        this.releaseDate = releaseDate;
        this.releaseBu = releaseBu;
        this.sendMailYn = sendMailYn;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "RecallVhcle [vin=" + vin + ", maker=" + maker + ", campNo=" + campNo + ", custType=" + custType + ", custCode=" + custCode + ", stat1=" + stat1
                + ", stat2=" + stat2 + ", statDttm=" + statDttm + ", rcptMark=" + rcptMark + ", regiDate=" + regiDate + ", wcrNo=" + wcrNo + ", memo=" + memo
                + ", contactShopCode=" + contactShopCode + ", contactDate=" + contactDate + ", gmContactDate=" + gmContactDate + ", interStatus=" + interStatus
                + ", exprDate=" + exprDate + ", claimId=" + claimId + ", releaseDate=" + releaseDate + ", releaseBu=" + releaseBu + ", sendMailYn=" + sendMailYn
                + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getVin() {

        return vin;
    }


    public void setVin(String vin) {

        this.vin = vin;
    }


    public String getMaker() {

        return maker;
    }


    public void setMaker(String maker) {

        this.maker = maker;
    }


    public String getCampNo() {

        return campNo;
    }


    public void setCampNo(String campNo) {

        this.campNo = campNo;
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


    public String getStat1() {

        return stat1;
    }


    public void setStat1(String stat1) {

        this.stat1 = stat1;
    }


    public String getStat2() {

        return stat2;
    }


    public void setStat2(String stat2) {

        this.stat2 = stat2;
    }


    public String getStatDttm() {

        return statDttm;
    }


    public void setStatDttm(String statDttm) {

        this.statDttm = statDttm;
    }


    public String getRcptMark() {

        return rcptMark;
    }


    public void setRcptMark(String rcptMark) {

        this.rcptMark = rcptMark;
    }


    public String getRegiDate() {

        return regiDate;
    }


    public void setRegiDate(String regiDate) {

        this.regiDate = regiDate;
    }


    public String getWcrNo() {

        return wcrNo;
    }


    public void setWcrNo(String wcrNo) {

        this.wcrNo = wcrNo;
    }


    public String getMemo() {

        return memo;
    }


    public void setMemo(String memo) {

        this.memo = memo;
    }


    public String getContactShopCode() {

        return contactShopCode;
    }


    public void setContactShopCode(String contactShopCode) {

        this.contactShopCode = contactShopCode;
    }


    public String getContactDate() {

        return contactDate;
    }


    public void setContactDate(String contactDate) {

        this.contactDate = contactDate;
    }


    public String getGmContactDate() {

        return gmContactDate;
    }


    public void setGmContactDate(String gmContactDate) {

        this.gmContactDate = gmContactDate;
    }


    public String getInterStatus() {

        return interStatus;
    }


    public void setInterStatus(String interStatus) {

        this.interStatus = interStatus;
    }


    public String getExprDate() {

        return exprDate;
    }


    public void setExprDate(String exprDate) {

        this.exprDate = exprDate;
    }


    public String getClaimId() {

        return claimId;
    }


    public void setClaimId(String claimId) {

        this.claimId = claimId;
    }


    public String getReleaseDate() {

        return releaseDate;
    }


    public void setReleaseDate(String releaseDate) {

        this.releaseDate = releaseDate;
    }


    public String getReleaseBu() {

        return releaseBu;
    }


    public void setReleaseBu(String releaseBu) {

        this.releaseBu = releaseBu;
    }


    public String getSendMailYn() {

        return sendMailYn;
    }


    public void setSendMailYn(String sendMailYn) {

        this.sendMailYn = sendMailYn;
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