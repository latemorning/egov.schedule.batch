package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_KOR_OWNERS_FLAG_VIN")
public class KorOwnersFlagVin {

    private String custId = "";
    private String vinCd = "";
    private String carCode = "";
    private String vehiNo = "";
    private String asFlag = "";
    private String regDate = "";
    private String moDate = "";
    private String charmFlag = "";
    private String deliDate = "";
    private String saleMdl = "";
    private String newFlag = "";
    private String lastRcptDate = "";
    private String lastReadKm = "";
    private String dayDeliRcpt = "";
    private String dayRunKm = "";
    private String dayDeliToday = "";
    private String exptCheckKm = "";
    private String residentNo = "";
    private String assResNo = "";
    private String ipinDi = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public KorOwnersFlagVin() {
    }


    public KorOwnersFlagVin(String custId, String vinCd, String carCode, String vehiNo, String asFlag, String regDate, String moDate, String charmFlag,
            String deliDate, String saleMdl, String newFlag, String lastRcptDate, String lastReadKm, String dayDeliRcpt, String dayRunKm, String dayDeliToday,
            String exptCheckKm, String residentNo, String assResNo, String ipinDi, String histRegistDe, String actionCode) {
        super();
        this.custId = custId;
        this.vinCd = vinCd;
        this.carCode = carCode;
        this.vehiNo = vehiNo;
        this.asFlag = asFlag;
        this.regDate = regDate;
        this.moDate = moDate;
        this.charmFlag = charmFlag;
        this.deliDate = deliDate;
        this.saleMdl = saleMdl;
        this.newFlag = newFlag;
        this.lastRcptDate = lastRcptDate;
        this.lastReadKm = lastReadKm;
        this.dayDeliRcpt = dayDeliRcpt;
        this.dayRunKm = dayRunKm;
        this.dayDeliToday = dayDeliToday;
        this.exptCheckKm = exptCheckKm;
        this.residentNo = residentNo;
        this.assResNo = assResNo;
        this.ipinDi = ipinDi;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "KorOwnersFlagVin [custId=" + custId + ", vinCd=" + vinCd + ", carCode=" + carCode + ", vehiNo=" + vehiNo + ", asFlag=" + asFlag + ", regDate="
                + regDate + ", moDate=" + moDate + ", charmFlag=" + charmFlag + ", deliDate=" + deliDate + ", saleMdl=" + saleMdl + ", newFlag=" + newFlag
                + ", lastRcptDate=" + lastRcptDate + ", lastReadKm=" + lastReadKm + ", dayDeliRcpt=" + dayDeliRcpt + ", dayRunKm=" + dayRunKm
                + ", dayDeliToday=" + dayDeliToday + ", exptCheckKm=" + exptCheckKm + ", residentNo=" + residentNo + ", assResNo=" + assResNo + ", ipinDi="
                + ipinDi + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getCustId() {

        return custId;
    }


    public void setCustId(String custId) {

        this.custId = custId;
    }


    public String getVinCd() {

        return vinCd;
    }


    public void setVinCd(String vinCd) {

        this.vinCd = vinCd;
    }


    public String getCarCode() {

        return carCode;
    }


    public void setCarCode(String carCode) {

        this.carCode = carCode;
    }


    public String getVehiNo() {

        return vehiNo;
    }


    public void setVehiNo(String vehiNo) {

        this.vehiNo = vehiNo;
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


    public String getCharmFlag() {

        return charmFlag;
    }


    public void setCharmFlag(String charmFlag) {

        this.charmFlag = charmFlag;
    }


    public String getDeliDate() {

        return deliDate;
    }


    public void setDeliDate(String deliDate) {

        this.deliDate = deliDate;
    }


    public String getSaleMdl() {

        return saleMdl;
    }


    public void setSaleMdl(String saleMdl) {

        this.saleMdl = saleMdl;
    }


    public String getNewFlag() {

        return newFlag;
    }


    public void setNewFlag(String newFlag) {

        this.newFlag = newFlag;
    }


    public String getLastRcptDate() {

        return lastRcptDate;
    }


    public void setLastRcptDate(String lastRcptDate) {

        this.lastRcptDate = lastRcptDate;
    }


    public String getLastReadKm() {

        return lastReadKm;
    }


    public void setLastReadKm(String lastReadKm) {

        this.lastReadKm = lastReadKm;
    }


    public String getDayDeliRcpt() {

        return dayDeliRcpt;
    }


    public void setDayDeliRcpt(String dayDeliRcpt) {

        this.dayDeliRcpt = dayDeliRcpt;
    }


    public String getDayRunKm() {

        return dayRunKm;
    }


    public void setDayRunKm(String dayRunKm) {

        this.dayRunKm = dayRunKm;
    }


    public String getDayDeliToday() {

        return dayDeliToday;
    }


    public void setDayDeliToday(String dayDeliToday) {

        this.dayDeliToday = dayDeliToday;
    }


    public String getExptCheckKm() {

        return exptCheckKm;
    }


    public void setExptCheckKm(String exptCheckKm) {

        this.exptCheckKm = exptCheckKm;
    }


    public String getResidentNo() {

        return residentNo;
    }


    public void setResidentNo(String residentNo) {

        this.residentNo = residentNo;
    }


    public String getAssResNo() {

        return assResNo;
    }


    public void setAssResNo(String assResNo) {

        this.assResNo = assResNo;
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