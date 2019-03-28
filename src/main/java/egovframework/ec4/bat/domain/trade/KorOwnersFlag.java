package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_KOR_OWNERS_FLAG")
public class KorOwnersFlag {

    private String custId = "";
    private String ipinDi = "";
    private String custName = "";
    private String charmClubFlag = "";
    private String autocardFlag = "";
    private String charmClubGrade = "";
    private String carPurchaseNum = "";
    private String asFlag = "";
    private String regDate = "";
    private String moDate = "";
    private String webFlag = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public KorOwnersFlag() {
    }


    public KorOwnersFlag(String custId, String ipinDi, String custName, String charmClubFlag, String autocardFlag, String charmClubGrade, String carPurchaseNum,
            String asFlag, String regDate, String moDate, String webFlag, String histRegistDe, String actionCode) {
        super();
        this.custId = custId;
        this.ipinDi = ipinDi;
        this.custName = custName;
        this.charmClubFlag = charmClubFlag;
        this.autocardFlag = autocardFlag;
        this.charmClubGrade = charmClubGrade;
        this.carPurchaseNum = carPurchaseNum;
        this.asFlag = asFlag;
        this.regDate = regDate;
        this.moDate = moDate;
        this.webFlag = webFlag;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "KorOwnersFlag [custId=" + custId + ", ipinDi=" + ipinDi + ", custName=" + custName + ", charmClubFlag=" + charmClubFlag + ", autocardFlag="
                + autocardFlag + ", charmClubGrade=" + charmClubGrade + ", carPurchaseNum=" + carPurchaseNum + ", asFlag=" + asFlag + ", regDate=" + regDate
                + ", moDate=" + moDate + ", webFlag=" + webFlag + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getCustId() {

        return custId;
    }


    public void setCustId(String custId) {

        this.custId = custId;
    }


    public String getIpinDi() {

        return ipinDi;
    }


    public void setIpinDi(String ipinDi) {

        this.ipinDi = ipinDi;
    }


    public String getCustName() {

        return custName;
    }


    public void setCustName(String custName) {

        this.custName = custName;
    }


    public String getCharmClubFlag() {

        return charmClubFlag;
    }


    public void setCharmClubFlag(String charmClubFlag) {

        this.charmClubFlag = charmClubFlag;
    }


    public String getAutocardFlag() {

        return autocardFlag;
    }


    public void setAutocardFlag(String autocardFlag) {

        this.autocardFlag = autocardFlag;
    }


    public String getCharmClubGrade() {

        return charmClubGrade;
    }


    public void setCharmClubGrade(String charmClubGrade) {

        this.charmClubGrade = charmClubGrade;
    }


    public String getCarPurchaseNum() {

        return carPurchaseNum;
    }


    public void setCarPurchaseNum(String carPurchaseNum) {

        this.carPurchaseNum = carPurchaseNum;
    }


    public String getAsFlag() {

        return asFlag;
    }


    public void setAsFlag(String asFlag) {

        this.asFlag = asFlag;
    }


    public String getRegDate() {

        return regDate;
    }


    public void setRegDate(String regDate) {

        this.regDate = regDate;
    }


    public String getMoDate() {

        return moDate;
    }


    public void setMoDate(String moDate) {

        this.moDate = moDate;
    }


    public String getWebFlag() {

        return webFlag;
    }


    public void setWebFlag(String webFlag) {

        this.webFlag = webFlag;
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