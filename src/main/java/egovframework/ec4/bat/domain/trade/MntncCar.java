package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_MNTNC_CAR")
public class MntncCar {

    private String vin = "";
    private String vehiNo01 = "";
    private String vehiNo02 = "";
    private String bossName = "";
    private String maker = "";
    private String mdlYear = "";
    private String saleMdl = "";
    private String typeYear = "";
    private String engnNo = "";
    private String prodNo = "";
    private String deliMastNo = "";
    private String prodEvnt = "";
    private String mfgDate = "";
    private String deliDate = "";
    private String frstInspDate = "";
    private String nextInspDate = "";
    private String lastRcptDate = "";
    private String lastReadKm = "";
    private String lastCustType = "";
    private String lastCustCode = "";
    private String saleShopCode = "";
    private String areaCode = "";
    private String colrCode = "";
    private String colrBody = "";
    private String colrTrim = "";
    private String rcptCnt = "";
    private String warrRcptCnt = "";
    private String saleType = "";
    private String useCode = "";
    private String spclCode = "";
    private String histPrntFlag = "";
    private String exptCond = "";
    private String regiCond = "";
    private String regDttm = "";
    private String optn01 = "";
    private String optn02 = "";
    private String optn03 = "";
    private String optn04 = "";
    private String optn05 = "";
    private String misnLot = "";
    private String ecmLot = "";
    private String warrRqstCnt = "";
    private String rqstCumDate = "";
    private String jobFlag = "";
    private String resnFlag = "";
    private String lastChngDttm = "";
    private String dayReadKm = "";
    private String saleEmplNo = "";
    private String avgReadKm = "";
    private String engType = "";
    private String engPart = "";
    private String modelYear = "";
    private String optnEng = "";
    private String optnTrn = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public MntncCar() {
    }


    public MntncCar(String vin, String vehiNo01, String vehiNo02, String bossName, String maker, String mdlYear, String saleMdl, String typeYear, String engnNo,
            String prodNo, String deliMastNo, String prodEvnt, String mfgDate, String deliDate, String frstInspDate, String nextInspDate, String lastRcptDate,
            String lastReadKm, String lastCustType, String lastCustCode, String saleShopCode, String areaCode, String colrCode, String colrBody,
            String colrTrim, String rcptCnt, String warrRcptCnt, String saleType, String useCode, String spclCode, String histPrntFlag, String exptCond,
            String regiCond, String regDttm, String optn01, String optn02, String optn03, String optn04, String optn05, String misnLot, String ecmLot,
            String warrRqstCnt, String rqstCumDate, String jobFlag, String resnFlag, String lastChngDttm, String dayReadKm, String saleEmplNo, String avgReadKm,
            String engType, String engPart, String modelYear, String optnEng, String optnTrn, String histRegistDe, String actionCode) {
        super();
        this.vin = vin;
        this.vehiNo01 = vehiNo01;
        this.vehiNo02 = vehiNo02;
        this.bossName = bossName;
        this.maker = maker;
        this.mdlYear = mdlYear;
        this.saleMdl = saleMdl;
        this.typeYear = typeYear;
        this.engnNo = engnNo;
        this.prodNo = prodNo;
        this.deliMastNo = deliMastNo;
        this.prodEvnt = prodEvnt;
        this.mfgDate = mfgDate;
        this.deliDate = deliDate;
        this.frstInspDate = frstInspDate;
        this.nextInspDate = nextInspDate;
        this.lastRcptDate = lastRcptDate;
        this.lastReadKm = lastReadKm;
        this.lastCustType = lastCustType;
        this.lastCustCode = lastCustCode;
        this.saleShopCode = saleShopCode;
        this.areaCode = areaCode;
        this.colrCode = colrCode;
        this.colrBody = colrBody;
        this.colrTrim = colrTrim;
        this.rcptCnt = rcptCnt;
        this.warrRcptCnt = warrRcptCnt;
        this.saleType = saleType;
        this.useCode = useCode;
        this.spclCode = spclCode;
        this.histPrntFlag = histPrntFlag;
        this.exptCond = exptCond;
        this.regiCond = regiCond;
        this.regDttm = regDttm;
        this.optn01 = optn01;
        this.optn02 = optn02;
        this.optn03 = optn03;
        this.optn04 = optn04;
        this.optn05 = optn05;
        this.misnLot = misnLot;
        this.ecmLot = ecmLot;
        this.warrRqstCnt = warrRqstCnt;
        this.rqstCumDate = rqstCumDate;
        this.jobFlag = jobFlag;
        this.resnFlag = resnFlag;
        this.lastChngDttm = lastChngDttm;
        this.dayReadKm = dayReadKm;
        this.saleEmplNo = saleEmplNo;
        this.avgReadKm = avgReadKm;
        this.engType = engType;
        this.engPart = engPart;
        this.modelYear = modelYear;
        this.optnEng = optnEng;
        this.optnTrn = optnTrn;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "MntncCar [vin=" + vin + ", vehiNo01=" + vehiNo01 + ", vehiNo02=" + vehiNo02 + ", bossName=" + bossName + ", maker=" + maker + ", mdlYear="
                + mdlYear + ", saleMdl=" + saleMdl + ", typeYear=" + typeYear + ", engnNo=" + engnNo + ", prodNo=" + prodNo + ", deliMastNo=" + deliMastNo
                + ", prodEvnt=" + prodEvnt + ", mfgDate=" + mfgDate + ", deliDate=" + deliDate + ", frstInspDate=" + frstInspDate + ", nextInspDate="
                + nextInspDate + ", lastRcptDate=" + lastRcptDate + ", lastReadKm=" + lastReadKm + ", lastCustType=" + lastCustType + ", lastCustCode="
                + lastCustCode + ", saleShopCode=" + saleShopCode + ", areaCode=" + areaCode + ", colrCode=" + colrCode + ", colrBody=" + colrBody
                + ", colrTrim=" + colrTrim + ", rcptCnt=" + rcptCnt + ", warrRcptCnt=" + warrRcptCnt + ", saleType=" + saleType + ", useCode=" + useCode
                + ", spclCode=" + spclCode + ", histPrntFlag=" + histPrntFlag + ", exptCond=" + exptCond + ", regiCond=" + regiCond + ", regDttm=" + regDttm
                + ", optn01=" + optn01 + ", optn02=" + optn02 + ", optn03=" + optn03 + ", optn04=" + optn04 + ", optn05=" + optn05 + ", misnLot=" + misnLot
                + ", ecmLot=" + ecmLot + ", warrRqstCnt=" + warrRqstCnt + ", rqstCumDate=" + rqstCumDate + ", jobFlag=" + jobFlag + ", resnFlag=" + resnFlag
                + ", lastChngDttm=" + lastChngDttm + ", dayReadKm=" + dayReadKm + ", saleEmplNo=" + saleEmplNo + ", avgReadKm=" + avgReadKm + ", engType="
                + engType + ", engPart=" + engPart + ", modelYear=" + modelYear + ", optnEng=" + optnEng + ", optnTrn=" + optnTrn + ", histRegistDe="
                + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getVin() {

        return vin;
    }


    public void setVin(String vin) {

        this.vin = vin;
    }


    public String getVehiNo01() {

        return vehiNo01;
    }


    public void setVehiNo01(String vehiNo01) {

        this.vehiNo01 = vehiNo01;
    }


    public String getVehiNo02() {

        return vehiNo02;
    }


    public void setVehiNo02(String vehiNo02) {

        this.vehiNo02 = vehiNo02;
    }


    public String getBossName() {

        return bossName;
    }


    public void setBossName(String bossName) {

        this.bossName = bossName;
    }


    public String getMaker() {

        return maker;
    }


    public void setMaker(String maker) {

        this.maker = maker;
    }


    public String getMdlYear() {

        return mdlYear;
    }


    public void setMdlYear(String mdlYear) {

        this.mdlYear = mdlYear;
    }


    public String getSaleMdl() {

        return saleMdl;
    }


    public void setSaleMdl(String saleMdl) {

        this.saleMdl = saleMdl;
    }


    public String getTypeYear() {

        return typeYear;
    }


    public void setTypeYear(String typeYear) {

        this.typeYear = typeYear;
    }


    public String getEngnNo() {

        return engnNo;
    }


    public void setEngnNo(String engnNo) {

        this.engnNo = engnNo;
    }


    public String getProdNo() {

        return prodNo;
    }


    public void setProdNo(String prodNo) {

        this.prodNo = prodNo;
    }


    public String getDeliMastNo() {

        return deliMastNo;
    }


    public void setDeliMastNo(String deliMastNo) {

        this.deliMastNo = deliMastNo;
    }


    public String getProdEvnt() {

        return prodEvnt;
    }


    public void setProdEvnt(String prodEvnt) {

        this.prodEvnt = prodEvnt;
    }


    public String getMfgDate() {

        return mfgDate;
    }


    public void setMfgDate(String mfgDate) {

        this.mfgDate = mfgDate;
    }


    public String getDeliDate() {

        return deliDate;
    }


    public void setDeliDate(String deliDate) {

        this.deliDate = deliDate;
    }


    public String getFrstInspDate() {

        return frstInspDate;
    }


    public void setFrstInspDate(String frstInspDate) {

        this.frstInspDate = frstInspDate;
    }


    public String getNextInspDate() {

        return nextInspDate;
    }


    public void setNextInspDate(String nextInspDate) {

        this.nextInspDate = nextInspDate;
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


    public String getLastCustType() {

        return lastCustType;
    }


    public void setLastCustType(String lastCustType) {

        this.lastCustType = lastCustType;
    }


    public String getLastCustCode() {

        return lastCustCode;
    }


    public void setLastCustCode(String lastCustCode) {

        this.lastCustCode = lastCustCode;
    }


    public String getSaleShopCode() {

        return saleShopCode;
    }


    public void setSaleShopCode(String saleShopCode) {

        this.saleShopCode = saleShopCode;
    }


    public String getAreaCode() {

        return areaCode;
    }


    public void setAreaCode(String areaCode) {

        this.areaCode = areaCode;
    }


    public String getColrCode() {

        return colrCode;
    }


    public void setColrCode(String colrCode) {

        this.colrCode = colrCode;
    }


    public String getColrBody() {

        return colrBody;
    }


    public void setColrBody(String colrBody) {

        this.colrBody = colrBody;
    }


    public String getColrTrim() {

        return colrTrim;
    }


    public void setColrTrim(String colrTrim) {

        this.colrTrim = colrTrim;
    }


    public String getRcptCnt() {

        return rcptCnt;
    }


    public void setRcptCnt(String rcptCnt) {

        this.rcptCnt = rcptCnt;
    }


    public String getWarrRcptCnt() {

        return warrRcptCnt;
    }


    public void setWarrRcptCnt(String warrRcptCnt) {

        this.warrRcptCnt = warrRcptCnt;
    }


    public String getSaleType() {

        return saleType;
    }


    public void setSaleType(String saleType) {

        this.saleType = saleType;
    }


    public String getUseCode() {

        return useCode;
    }


    public void setUseCode(String useCode) {

        this.useCode = useCode;
    }


    public String getSpclCode() {

        return spclCode;
    }


    public void setSpclCode(String spclCode) {

        this.spclCode = spclCode;
    }


    public String getHistPrntFlag() {

        return histPrntFlag;
    }


    public void setHistPrntFlag(String histPrntFlag) {

        this.histPrntFlag = histPrntFlag;
    }


    public String getExptCond() {

        return exptCond;
    }


    public void setExptCond(String exptCond) {

        this.exptCond = exptCond;
    }


    public String getRegiCond() {

        return regiCond;
    }


    public void setRegiCond(String regiCond) {

        this.regiCond = regiCond;
    }


    public String getRegDttm() {

        return regDttm;
    }


    public void setRegDttm(String regDttm) {

        this.regDttm = regDttm;
    }


    public String getOptn01() {

        return optn01;
    }


    public void setOptn01(String optn01) {

        this.optn01 = optn01;
    }


    public String getOptn02() {

        return optn02;
    }


    public void setOptn02(String optn02) {

        this.optn02 = optn02;
    }


    public String getOptn03() {

        return optn03;
    }


    public void setOptn03(String optn03) {

        this.optn03 = optn03;
    }


    public String getOptn04() {

        return optn04;
    }


    public void setOptn04(String optn04) {

        this.optn04 = optn04;
    }


    public String getOptn05() {

        return optn05;
    }


    public void setOptn05(String optn05) {

        this.optn05 = optn05;
    }


    public String getMisnLot() {

        return misnLot;
    }


    public void setMisnLot(String misnLot) {

        this.misnLot = misnLot;
    }


    public String getEcmLot() {

        return ecmLot;
    }


    public void setEcmLot(String ecmLot) {

        this.ecmLot = ecmLot;
    }


    public String getWarrRqstCnt() {

        return warrRqstCnt;
    }


    public void setWarrRqstCnt(String warrRqstCnt) {

        this.warrRqstCnt = warrRqstCnt;
    }


    public String getRqstCumDate() {

        return rqstCumDate;
    }


    public void setRqstCumDate(String rqstCumDate) {

        this.rqstCumDate = rqstCumDate;
    }


    public String getJobFlag() {

        return jobFlag;
    }


    public void setJobFlag(String jobFlag) {

        this.jobFlag = jobFlag;
    }


    public String getResnFlag() {

        return resnFlag;
    }


    public void setResnFlag(String resnFlag) {

        this.resnFlag = resnFlag;
    }


    public String getLastChngDttm() {

        return lastChngDttm;
    }


    public void setLastChngDttm(String lastChngDttm) {

        this.lastChngDttm = lastChngDttm;
    }


    public String getDayReadKm() {

        return dayReadKm;
    }


    public void setDayReadKm(String dayReadKm) {

        this.dayReadKm = dayReadKm;
    }


    public String getSaleEmplNo() {

        return saleEmplNo;
    }


    public void setSaleEmplNo(String saleEmplNo) {

        this.saleEmplNo = saleEmplNo;
    }


    public String getAvgReadKm() {

        return avgReadKm;
    }


    public void setAvgReadKm(String avgReadKm) {

        this.avgReadKm = avgReadKm;
    }


    public String getEngType() {

        return engType;
    }


    public void setEngType(String engType) {

        this.engType = engType;
    }


    public String getEngPart() {

        return engPart;
    }


    public void setEngPart(String engPart) {

        this.engPart = engPart;
    }


    public String getModelYear() {

        return modelYear;
    }


    public void setModelYear(String modelYear) {

        this.modelYear = modelYear;
    }


    public String getOptnEng() {

        return optnEng;
    }


    public void setOptnEng(String optnEng) {

        this.optnEng = optnEng;
    }


    public String getOptnTrn() {

        return optnTrn;
    }


    public void setOptnTrn(String optnTrn) {

        this.optnTrn = optnTrn;
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
