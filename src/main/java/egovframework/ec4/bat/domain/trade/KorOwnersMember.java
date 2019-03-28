package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_KOR_OWNERS_MEMBER")
public class KorOwnersMember {

    private String id = "";
    private String loyaltyCheck = "";
    private String regDate = "";
    private String counName = "";
    private String agencyYn = "";
    private String ssn = "";
    private String businNum = "";
    private String businYn = "";
    private String ipinDi = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public KorOwnersMember() {
    }


    public KorOwnersMember(String id, String loyaltyCheck, String regDate, String counName, String agencyYn, String ssn, String businNum, String businYn,
            String ipinDi, String histRegistDe, String actionCode) {
        super();
        this.id = id;
        this.loyaltyCheck = loyaltyCheck;
        this.regDate = regDate;
        this.counName = counName;
        this.agencyYn = agencyYn;
        this.ssn = ssn;
        this.businNum = businNum;
        this.businYn = businYn;
        this.ipinDi = ipinDi;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "KorOwnersMember [id=" + id + ", loyaltyCheck=" + loyaltyCheck + ", regDate=" + regDate + ", counName=" + counName + ", agencyYn=" + agencyYn
                + ", ssn=" + ssn + ", businNum=" + businNum + ", businYn=" + businYn + ", ipinDi=" + ipinDi + ", histRegistDe=" + histRegistDe + ", actionCode="
                + actionCode + "]";
    }


    public String getId() {

        return id;
    }


    public void setId(String id) {

        this.id = id;
    }


    public String getLoyaltyCheck() {

        return loyaltyCheck;
    }


    public void setLoyaltyCheck(String loyaltyCheck) {

        this.loyaltyCheck = loyaltyCheck;
    }


    public String getRegDate() {

        return regDate;
    }


    public void setRegDate(String regDate) {

        this.regDate = regDate;
    }


    public String getCounName() {

        return counName;
    }


    public void setCounName(String counName) {

        this.counName = counName;
    }


    public String getAgencyYn() {

        return agencyYn;
    }


    public void setAgencyYn(String agencyYn) {

        this.agencyYn = agencyYn;
    }


    public String getSsn() {

        return ssn;
    }


    public void setSsn(String ssn) {

        this.ssn = ssn;
    }


    public String getBusinNum() {

        return businNum;
    }


    public void setBusinNum(String businNum) {

        this.businNum = businNum;
    }


    public String getBusinYn() {

        return businYn;
    }


    public void setBusinYn(String businYn) {

        this.businYn = businYn;
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