package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_RECPTN_REJECT")
public class RecptnReject {

    private String custNo = "";
    private String eml = "";
    private String tel = "";
    private String modDt = "";
    private String custName = "";
    private String channelCd = "";
    private String channelNm = "";
    private String telRegn = "";
    private String telDept = "";
    private String telNo = "";
    private String smsyn = "";
    private String emlyn = "";
    private String custNoOld = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public RecptnReject() {
    }


    public RecptnReject(String custNo, String eml, String tel, String modDt, String custName, String channelCd, String channelNm, String telRegn,
            String telDept, String telNo, String smsyn, String emlyn, String custNoOld, String histRegistDe, String actionCode) {
        super();
        this.custNo = custNo;
        this.eml = eml;
        this.tel = tel;
        this.modDt = modDt;
        this.custName = custName;
        this.channelCd = channelCd;
        this.channelNm = channelNm;
        this.telRegn = telRegn;
        this.telDept = telDept;
        this.telNo = telNo;
        this.smsyn = smsyn;
        this.emlyn = emlyn;
        this.custNoOld = custNoOld;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "RecptnReject [custNo=" + custNo + ", eml=" + eml + ", tel=" + tel + ", modDt=" + modDt + ", custName=" + custName + ", channelCd=" + channelCd
                + ", channelNm=" + channelNm + ", telRegn=" + telRegn + ", telDept=" + telDept + ", telNo=" + telNo + ", smsyn=" + smsyn + ", emlyn=" + emlyn
                + ", custNoOld=" + custNoOld + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getCustNo() {

        return custNo;
    }


    public void setCustNo(String custNo) {

        this.custNo = custNo;
    }


    public String getEml() {

        return eml;
    }


    public void setEml(String eml) {

        this.eml = eml;
    }


    public String getTel() {

        return tel;
    }


    public void setTel(String tel) {

        this.tel = tel;
    }


    public String getModDt() {

        return modDt;
    }


    public void setModDt(String modDt) {

        this.modDt = modDt;
    }


    public String getCustName() {

        return custName;
    }


    public void setCustName(String custName) {

        this.custName = custName;
    }


    public String getChannelCd() {

        return channelCd;
    }


    public void setChannelCd(String channelCd) {

        this.channelCd = channelCd;
    }


    public String getChannelNm() {

        return channelNm;
    }


    public void setChannelNm(String channelNm) {

        this.channelNm = channelNm;
    }


    public String getTelRegn() {

        return telRegn;
    }


    public void setTelRegn(String telRegn) {

        this.telRegn = telRegn;
    }


    public String getTelDept() {

        return telDept;
    }


    public void setTelDept(String telDept) {

        this.telDept = telDept;
    }


    public String getTelNo() {

        return telNo;
    }


    public void setTelNo(String telNo) {

        this.telNo = telNo;
    }


    public String getSmsyn() {

        return smsyn;
    }


    public void setSmsyn(String smsyn) {

        this.smsyn = smsyn;
    }


    public String getEmlyn() {

        return emlyn;
    }


    public void setEmlyn(String emlyn) {

        this.emlyn = emlyn;
    }


    public String getCustNoOld() {

        return custNoOld;
    }


    public void setCustNoOld(String custNoOld) {

        this.custNoOld = custNoOld;
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