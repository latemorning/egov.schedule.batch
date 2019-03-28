package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_CSTMR_AGRE_CODE")
public class CstmrAgreCode {

    private String dealerCd = "";
    private String acctCd = "";
    private String acctFrom = "";
    private String acctTo = "";
    private String acctNm = "";
    private String ckCount = "";
    private String grp = "";
    private String srt = "";
    private String titleYn = "";
    private String type = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public CstmrAgreCode() {
    }


    public CstmrAgreCode(String dealerCd, String acctCd, String acctFrom, String acctTo, String acctNm, String ckCount, String grp, String srt, String titleYn,
            String type, String histRegistDe, String actionCode) {
        super();
        this.dealerCd = dealerCd;
        this.acctCd = acctCd;
        this.acctFrom = acctFrom;
        this.acctTo = acctTo;
        this.acctNm = acctNm;
        this.ckCount = ckCount;
        this.grp = grp;
        this.srt = srt;
        this.titleYn = titleYn;
        this.type = type;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "CstmrAgreCode [dealerCd=" + dealerCd + ", acctCd=" + acctCd + ", acctFrom=" + acctFrom + ", acctTo=" + acctTo + ", acctNm=" + acctNm
                + ", ckCount=" + ckCount + ", grp=" + grp + ", srt=" + srt + ", titleYn=" + titleYn + ", type=" + type + ", histRegistDe=" + histRegistDe
                + ", actionCode=" + actionCode + "]";
    }


    public String getDealerCd() {

        return dealerCd;
    }


    public void setDealerCd(String dealerCd) {

        this.dealerCd = dealerCd;
    }


    public String getAcctCd() {

        return acctCd;
    }


    public void setAcctCd(String acctCd) {

        this.acctCd = acctCd;
    }


    public String getAcctFrom() {

        return acctFrom;
    }


    public void setAcctFrom(String acctFrom) {

        this.acctFrom = acctFrom;
    }


    public String getAcctTo() {

        return acctTo;
    }


    public void setAcctTo(String acctTo) {

        this.acctTo = acctTo;
    }


    public String getAcctNm() {

        return acctNm;
    }


    public void setAcctNm(String acctNm) {

        this.acctNm = acctNm;
    }


    public String getCkCount() {

        return ckCount;
    }


    public void setCkCount(String ckCount) {

        this.ckCount = ckCount;
    }


    public String getGrp() {

        return grp;
    }


    public void setGrp(String grp) {

        this.grp = grp;
    }


    public String getSrt() {

        return srt;
    }


    public void setSrt(String srt) {

        this.srt = srt;
    }


    public String getTitleYn() {

        return titleYn;
    }


    public void setTitleYn(String titleYn) {

        this.titleYn = titleYn;
    }


    public String getType() {

        return type;
    }


    public void setType(String type) {

        this.type = type;
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