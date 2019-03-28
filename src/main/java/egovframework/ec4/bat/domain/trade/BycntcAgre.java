package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_BYCNTC_AGRE")
public class BycntcAgre {

    private String dealerCd = "";
    private String busResNo = "";
    private String acctSeq = "";
    private String acctDt = "";
    private String custNm1 = "";
    private String custNm2 = "";
    private String agentNm1 = "";
    private String agentNm2 = "";
    private String regDttm = "";
    private String regUser = "";
    private String contractNo = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public BycntcAgre() {
    }


    public BycntcAgre(String dealerCd, String busResNo, String acctSeq, String acctDt, String custNm1, String custNm2, String agentNm1, String agentNm2,
            String regDttm, String regUser, String contractNo, String histRegistDe, String actionCode) {
        super();
        this.dealerCd = dealerCd;
        this.busResNo = busResNo;
        this.acctSeq = acctSeq;
        this.acctDt = acctDt;
        this.custNm1 = custNm1;
        this.custNm2 = custNm2;
        this.agentNm1 = agentNm1;
        this.agentNm2 = agentNm2;
        this.regDttm = regDttm;
        this.regUser = regUser;
        this.contractNo = contractNo;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "BycntcAgre [dealerCd=" + dealerCd + ", busResNo=" + busResNo + ", acctSeq=" + acctSeq + ", acctDt=" + acctDt + ", custNm1=" + custNm1
                + ", custNm2=" + custNm2 + ", agentNm1=" + agentNm1 + ", agentNm2=" + agentNm2 + ", regDttm=" + regDttm + ", regUser=" + regUser
                + ", contractNo=" + contractNo + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
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


    public String getAcctDt() {

        return acctDt;
    }


    public void setAcctDt(String acctDt) {

        this.acctDt = acctDt;
    }


    public String getCustNm1() {

        return custNm1;
    }


    public void setCustNm1(String custNm1) {

        this.custNm1 = custNm1;
    }


    public String getCustNm2() {

        return custNm2;
    }


    public void setCustNm2(String custNm2) {

        this.custNm2 = custNm2;
    }


    public String getAgentNm1() {

        return agentNm1;
    }


    public void setAgentNm1(String agentNm1) {

        this.agentNm1 = agentNm1;
    }


    public String getAgentNm2() {

        return agentNm2;
    }


    public void setAgentNm2(String agentNm2) {

        this.agentNm2 = agentNm2;
    }


    public String getRegDttm() {

        return regDttm;
    }


    public void setRegDttm(String regDttm) {

        this.regDttm = regDttm;
    }


    public String getRegUser() {

        return regUser;
    }


    public void setRegUser(String regUser) {

        this.regUser = regUser;
    }


    public String getContractNo() {

        return contractNo;
    }


    public void setContractNo(String contractNo) {

        this.contractNo = contractNo;
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