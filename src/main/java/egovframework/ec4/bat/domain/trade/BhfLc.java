package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_BHF_LC")
public class BhfLc {

    private String ssCls1 = "";
    private String histRegistDe = "";
    private String actionCode = "";
    private String ssCode = "";
    private String ssCls2 = "";
    private String ssSurl = "";


    public BhfLc() {
    }


    public BhfLc(String ssCls1, String histRegistDe, String actionCode, String ssCode, String ssCls2, String ssSurl) {
        super();
        this.ssCls1 = ssCls1;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
        this.ssCode = ssCode;
        this.ssCls2 = ssCls2;
        this.ssSurl = ssSurl;
    }


    @Override
    public String toString() {

        return "BhfLc [ssCls1=" + ssCls1 + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + ", ssCode=" + ssCode + ", ssCls2=" + ssCls2
                + ", ssSurl=" + ssSurl + "]";
    }


    public String getSsCls1() {

        return ssCls1;
    }


    public void setSsCls1(String ssCls1) {

        this.ssCls1 = ssCls1;
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


    public String getSsCode() {

        return ssCode;
    }


    public void setSsCode(String ssCode) {

        this.ssCode = ssCode;
    }


    public String getSsCls2() {

        return ssCls2;
    }


    public void setSsCls2(String ssCls2) {

        this.ssCls2 = ssCls2;
    }


    public String getSsSurl() {

        return ssSurl;
    }


    public void setSsSurl(String ssSurl) {

        this.ssSurl = ssSurl;
    }

}
