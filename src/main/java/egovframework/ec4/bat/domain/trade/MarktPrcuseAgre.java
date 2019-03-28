package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_MARKT_PRCUSE_AGRE")
public class MarktPrcuseAgre {

    private String custId = "";
    private String custNm = "";
    private String realCustChk = "";
    private String realCustDt = "";
    private String realCustCode = "";
    private String agre01Chk = "";
    private String agre01Dt = "";
    private String agre02Chk = "";
    private String agre02Dt = "";
    private String agre03Chk = "";
    private String agre03Dt = "";
    private String agre04Chk = "";
    private String agre04Dt = "";
    private String agre05Chk = "";
    private String agre05Dt = "";
    private String agre06Chk = "";
    private String agre06Dt = "";
    private String agre07Chk = "";
    private String agre07Dt = "";
    private String agre08Chk = "";
    private String agre08Dt = "";
    private String agre09Chk = "";
    private String agre09Dt = "";
    private String agre10Chk = "";
    private String agre10Dt = "";
    private String regId = "";
    private String regDttm = "";
    private String lastCustCode = "";
    private String signImg = "";
    private String agntFg = "";
    private String fileImg = "";
    private String chngDttm = "";
    private String chngId = "";
    private String oldCustId = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public MarktPrcuseAgre() {
    }


    public MarktPrcuseAgre(String custId, String custNm, String realCustChk, String realCustDt, String realCustCode, String agre01Chk, String agre01Dt,
            String agre02Chk, String agre02Dt, String agre03Chk, String agre03Dt, String agre04Chk, String agre04Dt, String agre05Chk, String agre05Dt,
            String agre06Chk, String agre06Dt, String agre07Chk, String agre07Dt, String agre08Chk, String agre08Dt, String agre09Chk, String agre09Dt,
            String agre10Chk, String agre10Dt, String regId, String regDttm, String lastCustCode, String signImg, String agntFg, String fileImg,
            String chngDttm, String chngId, String oldCustId, String histRegistDe, String actionCode) {
        super();
        this.custId = custId;
        this.custNm = custNm;
        this.realCustChk = realCustChk;
        this.realCustDt = realCustDt;
        this.realCustCode = realCustCode;
        this.agre01Chk = agre01Chk;
        this.agre01Dt = agre01Dt;
        this.agre02Chk = agre02Chk;
        this.agre02Dt = agre02Dt;
        this.agre03Chk = agre03Chk;
        this.agre03Dt = agre03Dt;
        this.agre04Chk = agre04Chk;
        this.agre04Dt = agre04Dt;
        this.agre05Chk = agre05Chk;
        this.agre05Dt = agre05Dt;
        this.agre06Chk = agre06Chk;
        this.agre06Dt = agre06Dt;
        this.agre07Chk = agre07Chk;
        this.agre07Dt = agre07Dt;
        this.agre08Chk = agre08Chk;
        this.agre08Dt = agre08Dt;
        this.agre09Chk = agre09Chk;
        this.agre09Dt = agre09Dt;
        this.agre10Chk = agre10Chk;
        this.agre10Dt = agre10Dt;
        this.regId = regId;
        this.regDttm = regDttm;
        this.lastCustCode = lastCustCode;
        this.signImg = signImg;
        this.agntFg = agntFg;
        this.fileImg = fileImg;
        this.chngDttm = chngDttm;
        this.chngId = chngId;
        this.oldCustId = oldCustId;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "MarktPrcuseAgre [custId=" + custId + ", custNm=" + custNm + ", realCustChk=" + realCustChk + ", realCustDt=" + realCustDt + ", realCustCode="
                + realCustCode + ", agre01Chk=" + agre01Chk + ", agre01Dt=" + agre01Dt + ", agre02Chk=" + agre02Chk + ", agre02Dt=" + agre02Dt + ", agre03Chk="
                + agre03Chk + ", agre03Dt=" + agre03Dt + ", agre04Chk=" + agre04Chk + ", agre04Dt=" + agre04Dt + ", agre05Chk=" + agre05Chk + ", agre05Dt="
                + agre05Dt + ", agre06Chk=" + agre06Chk + ", agre06Dt=" + agre06Dt + ", agre07Chk=" + agre07Chk + ", agre07Dt=" + agre07Dt + ", agre08Chk="
                + agre08Chk + ", agre08Dt=" + agre08Dt + ", agre09Chk=" + agre09Chk + ", agre09Dt=" + agre09Dt + ", agre10Chk=" + agre10Chk + ", agre10Dt="
                + agre10Dt + ", regId=" + regId + ", regDttm=" + regDttm + ", lastCustCode=" + lastCustCode + ", signImg=" + signImg + ", agntFg=" + agntFg
                + ", fileImg=" + fileImg + ", chngDttm=" + chngDttm + ", chngId=" + chngId + ", oldCustId=" + oldCustId + ", histRegistDe=" + histRegistDe
                + ", actionCode=" + actionCode + "]";
    }


    public String getCustId() {

        return custId;
    }


    public void setCustId(String custId) {

        this.custId = custId;
    }


    public String getCustNm() {

        return custNm;
    }


    public void setCustNm(String custNm) {

        this.custNm = custNm;
    }


    public String getRealCustChk() {

        return realCustChk;
    }


    public void setRealCustChk(String realCustChk) {

        this.realCustChk = realCustChk;
    }


    public String getRealCustDt() {

        return realCustDt;
    }


    public void setRealCustDt(String realCustDt) {

        this.realCustDt = realCustDt;
    }


    public String getRealCustCode() {

        return realCustCode;
    }


    public void setRealCustCode(String realCustCode) {

        this.realCustCode = realCustCode;
    }


    public String getAgre01Chk() {

        return agre01Chk;
    }


    public void setAgre01Chk(String agre01Chk) {

        this.agre01Chk = agre01Chk;
    }


    public String getAgre01Dt() {

        return agre01Dt;
    }


    public void setAgre01Dt(String agre01Dt) {

        this.agre01Dt = agre01Dt;
    }


    public String getAgre02Chk() {

        return agre02Chk;
    }


    public void setAgre02Chk(String agre02Chk) {

        this.agre02Chk = agre02Chk;
    }


    public String getAgre02Dt() {

        return agre02Dt;
    }


    public void setAgre02Dt(String agre02Dt) {

        this.agre02Dt = agre02Dt;
    }


    public String getAgre03Chk() {

        return agre03Chk;
    }


    public void setAgre03Chk(String agre03Chk) {

        this.agre03Chk = agre03Chk;
    }


    public String getAgre03Dt() {

        return agre03Dt;
    }


    public void setAgre03Dt(String agre03Dt) {

        this.agre03Dt = agre03Dt;
    }


    public String getAgre04Chk() {

        return agre04Chk;
    }


    public void setAgre04Chk(String agre04Chk) {

        this.agre04Chk = agre04Chk;
    }


    public String getAgre04Dt() {

        return agre04Dt;
    }


    public void setAgre04Dt(String agre04Dt) {

        this.agre04Dt = agre04Dt;
    }


    public String getAgre05Chk() {

        return agre05Chk;
    }


    public void setAgre05Chk(String agre05Chk) {

        this.agre05Chk = agre05Chk;
    }


    public String getAgre05Dt() {

        return agre05Dt;
    }


    public void setAgre05Dt(String agre05Dt) {

        this.agre05Dt = agre05Dt;
    }


    public String getAgre06Chk() {

        return agre06Chk;
    }


    public void setAgre06Chk(String agre06Chk) {

        this.agre06Chk = agre06Chk;
    }


    public String getAgre06Dt() {

        return agre06Dt;
    }


    public void setAgre06Dt(String agre06Dt) {

        this.agre06Dt = agre06Dt;
    }


    public String getAgre07Chk() {

        return agre07Chk;
    }


    public void setAgre07Chk(String agre07Chk) {

        this.agre07Chk = agre07Chk;
    }


    public String getAgre07Dt() {

        return agre07Dt;
    }


    public void setAgre07Dt(String agre07Dt) {

        this.agre07Dt = agre07Dt;
    }


    public String getAgre08Chk() {

        return agre08Chk;
    }


    public void setAgre08Chk(String agre08Chk) {

        this.agre08Chk = agre08Chk;
    }


    public String getAgre08Dt() {

        return agre08Dt;
    }


    public void setAgre08Dt(String agre08Dt) {

        this.agre08Dt = agre08Dt;
    }


    public String getAgre09Chk() {

        return agre09Chk;
    }


    public void setAgre09Chk(String agre09Chk) {

        this.agre09Chk = agre09Chk;
    }


    public String getAgre09Dt() {

        return agre09Dt;
    }


    public void setAgre09Dt(String agre09Dt) {

        this.agre09Dt = agre09Dt;
    }


    public String getAgre10Chk() {

        return agre10Chk;
    }


    public void setAgre10Chk(String agre10Chk) {

        this.agre10Chk = agre10Chk;
    }


    public String getAgre10Dt() {

        return agre10Dt;
    }


    public void setAgre10Dt(String agre10Dt) {

        this.agre10Dt = agre10Dt;
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


    public String getLastCustCode() {

        return lastCustCode;
    }


    public void setLastCustCode(String lastCustCode) {

        this.lastCustCode = lastCustCode;
    }


    public String getSignImg() {

        return signImg;
    }


    public void setSignImg(String signImg) {

        this.signImg = signImg;
    }


    public String getAgntFg() {

        return agntFg;
    }


    public void setAgntFg(String agntFg) {

        this.agntFg = agntFg;
    }


    public String getFileImg() {

        return fileImg;
    }


    public void setFileImg(String fileImg) {

        this.fileImg = fileImg;
    }


    public String getChngDttm() {

        return chngDttm;
    }


    public void setChngDttm(String chngDttm) {

        this.chngDttm = chngDttm;
    }


    public String getChngId() {

        return chngId;
    }


    public void setChngId(String chngId) {

        this.chngId = chngId;
    }


    public String getOldCustId() {

        return oldCustId;
    }


    public void setOldCustId(String oldCustId) {

        this.oldCustId = oldCustId;
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