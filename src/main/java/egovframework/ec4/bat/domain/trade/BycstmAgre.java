package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_BYCSTM_AGRE")
public class BycstmAgre {

    private String dealerCd = "";
    private String busResNo = "";
    private String acctSeq = "";
    private String acctCd = "";
    private String acctYn1 = "";
    private String acctYn2 = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public BycstmAgre() {
    }


    public BycstmAgre(String dealerCd, String busResNo, String acctSeq, String acctCd, String acctYn1, String acctYn2, String histRegistDe, String actionCode) {
        super();
        this.dealerCd = dealerCd;
        this.busResNo = busResNo;
        this.acctSeq = acctSeq;
        this.acctCd = acctCd;
        this.acctYn1 = acctYn1;
        this.acctYn2 = acctYn2;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "BycstmAgre [dealerCd=" + dealerCd + ", busResNo=" + busResNo + ", acctSeq=" + acctSeq + ", acctCd=" + acctCd + ", acctYn1=" + acctYn1
                + ", acctYn2=" + acctYn2 + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
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


    public String getAcctSeq() {

        return acctSeq;
    }


    public void setAcctSeq(String acctSeq) {

        this.acctSeq = acctSeq;
    }


    public String getAcctCd() {

        return acctCd;
    }


    public void setAcctCd(String acctCd) {

        this.acctCd = acctCd;
    }


    public String getAcctYn1() {

        return acctYn1;
    }


    public void setAcctYn1(String acctYn1) {

        this.acctYn1 = acctYn1;
    }


    public String getAcctYn2() {

        return acctYn2;
    }


    public void setAcctYn2(String acctYn2) {

        this.acctYn2 = acctYn2;
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