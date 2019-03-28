package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_RECALL")
public class Recall {

    private String maker = "";
    private String campNo = "";
    private String docuNo = "";
    private String jobMaker = "";
    private String jobCode = "";
    private String campFromDate = "";
    private String campEndDate = "";
    private String stat = "";
    private String statDate = "";
    private String exptCnt = "";
    private String trgtCnt = "";
    private String rcptCnt = "";
    private String reprCnt = "";
    private String mdlFlag = "";
    private String saleMdl = "";
    private String dateFlag = "";
    private String fromDate = "";
    private String toDate = "";
    private String optnFlag = "";
    private String optn01 = "";
    private String optn02 = "";
    private String optn03 = "";
    private String rmrk = "";
    private String docuDate = "";
    private String cbGubn = "";
    private String causMaker = "";
    private String causPartNo = "";
    private String causVndrType = "";
    private String causVndr = "";
    private String chngPartNo = "";
    private String carDfct = "";
    private String partDfct = "";
    private String campGubnt = "";
    private String campCheck = "";
    private String dfctResn = "";
    private String chrgRetnCase = "";
    private String autoRecallFlag = "";
    private String techRptNo = "";
    private String extraRmrk = "";
    private String mileage = "";
    private String regVinFromDate = "";
    private String regVinToDate = "";
    private String faType = "";
    private String engDesc = "";
    private String faNo = "";
    private String compCatCd = "";
    private String compCd = "";
    private String causCd = "";
    private String readKmFr = "";
    private String readKmTo = "";
    private String safeRiskDesc = "";
    private String remedyDesc = "";
    private String customerAction = "";
    private String partAvailability = "";
    private String notes = "";
    private String sendMailYn = "";
    private String gfaStatus = "";
    private String version = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public Recall() {
    }


    public Recall(String maker, String campNo, String docuNo, String jobMaker, String jobCode, String campFromDate, String campEndDate, String stat,
            String statDate, String exptCnt, String trgtCnt, String rcptCnt, String reprCnt, String mdlFlag, String saleMdl, String dateFlag, String fromDate,
            String toDate, String optnFlag, String optn01, String optn02, String optn03, String rmrk, String docuDate, String cbGubn, String causMaker,
            String causPartNo, String causVndrType, String causVndr, String chngPartNo, String carDfct, String partDfct, String campGubnt, String campCheck,
            String dfctResn, String chrgRetnCase, String autoRecallFlag, String techRptNo, String extraRmrk, String mileage, String regVinFromDate,
            String regVinToDate, String faType, String engDesc, String faNo, String compCatCd, String compCd, String causCd, String readKmFr, String readKmTo,
            String safeRiskDesc, String remedyDesc, String customerAction, String partAvailability, String notes, String sendMailYn, String gfaStatus,
            String version, String histRegistDe, String actionCode) {
        super();
        this.maker = maker;
        this.campNo = campNo;
        this.docuNo = docuNo;
        this.jobMaker = jobMaker;
        this.jobCode = jobCode;
        this.campFromDate = campFromDate;
        this.campEndDate = campEndDate;
        this.stat = stat;
        this.statDate = statDate;
        this.exptCnt = exptCnt;
        this.trgtCnt = trgtCnt;
        this.rcptCnt = rcptCnt;
        this.reprCnt = reprCnt;
        this.mdlFlag = mdlFlag;
        this.saleMdl = saleMdl;
        this.dateFlag = dateFlag;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.optnFlag = optnFlag;
        this.optn01 = optn01;
        this.optn02 = optn02;
        this.optn03 = optn03;
        this.rmrk = rmrk;
        this.docuDate = docuDate;
        this.cbGubn = cbGubn;
        this.causMaker = causMaker;
        this.causPartNo = causPartNo;
        this.causVndrType = causVndrType;
        this.causVndr = causVndr;
        this.chngPartNo = chngPartNo;
        this.carDfct = carDfct;
        this.partDfct = partDfct;
        this.campGubnt = campGubnt;
        this.campCheck = campCheck;
        this.dfctResn = dfctResn;
        this.chrgRetnCase = chrgRetnCase;
        this.autoRecallFlag = autoRecallFlag;
        this.techRptNo = techRptNo;
        this.extraRmrk = extraRmrk;
        this.mileage = mileage;
        this.regVinFromDate = regVinFromDate;
        this.regVinToDate = regVinToDate;
        this.faType = faType;
        this.engDesc = engDesc;
        this.faNo = faNo;
        this.compCatCd = compCatCd;
        this.compCd = compCd;
        this.causCd = causCd;
        this.readKmFr = readKmFr;
        this.readKmTo = readKmTo;
        this.safeRiskDesc = safeRiskDesc;
        this.remedyDesc = remedyDesc;
        this.customerAction = customerAction;
        this.partAvailability = partAvailability;
        this.notes = notes;
        this.sendMailYn = sendMailYn;
        this.gfaStatus = gfaStatus;
        this.version = version;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "Recall [maker=" + maker + ", campNo=" + campNo + ", docuNo=" + docuNo + ", jobMaker=" + jobMaker + ", jobCode=" + jobCode + ", campFromDate="
                + campFromDate + ", campEndDate=" + campEndDate + ", stat=" + stat + ", statDate=" + statDate + ", exptCnt=" + exptCnt + ", trgtCnt=" + trgtCnt
                + ", rcptCnt=" + rcptCnt + ", reprCnt=" + reprCnt + ", mdlFlag=" + mdlFlag + ", saleMdl=" + saleMdl + ", dateFlag=" + dateFlag + ", fromDate="
                + fromDate + ", toDate=" + toDate + ", optnFlag=" + optnFlag + ", optn01=" + optn01 + ", optn02=" + optn02 + ", optn03=" + optn03 + ", rmrk="
                + rmrk + ", docuDate=" + docuDate + ", cbGubn=" + cbGubn + ", causMaker=" + causMaker + ", causPartNo=" + causPartNo + ", causVndrType="
                + causVndrType + ", causVndr=" + causVndr + ", chngPartNo=" + chngPartNo + ", carDfct=" + carDfct + ", partDfct=" + partDfct + ", campGubnt="
                + campGubnt + ", campCheck=" + campCheck + ", dfctResn=" + dfctResn + ", chrgRetnCase=" + chrgRetnCase + ", autoRecallFlag=" + autoRecallFlag
                + ", techRptNo=" + techRptNo + ", extraRmrk=" + extraRmrk + ", mileage=" + mileage + ", regVinFromDate=" + regVinFromDate + ", regVinToDate="
                + regVinToDate + ", faType=" + faType + ", engDesc=" + engDesc + ", faNo=" + faNo + ", compCatCd=" + compCatCd + ", compCd=" + compCd
                + ", causCd=" + causCd + ", readKmFr=" + readKmFr + ", readKmTo=" + readKmTo + ", safeRiskDesc=" + safeRiskDesc + ", remedyDesc=" + remedyDesc
                + ", customerAction=" + customerAction + ", partAvailability=" + partAvailability + ", notes=" + notes + ", sendMailYn=" + sendMailYn
                + ", gfaStatus=" + gfaStatus + ", version=" + version + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getMaker() {

        return maker;
    }


    public void setMaker(String maker) {

        this.maker = maker;
    }


    public String getCampNo() {

        return campNo;
    }


    public void setCampNo(String campNo) {

        this.campNo = campNo;
    }


    public String getDocuNo() {

        return docuNo;
    }


    public void setDocuNo(String docuNo) {

        this.docuNo = docuNo;
    }


    public String getJobMaker() {

        return jobMaker;
    }


    public void setJobMaker(String jobMaker) {

        this.jobMaker = jobMaker;
    }


    public String getJobCode() {

        return jobCode;
    }


    public void setJobCode(String jobCode) {

        this.jobCode = jobCode;
    }


    public String getCampFromDate() {

        return campFromDate;
    }


    public void setCampFromDate(String campFromDate) {

        this.campFromDate = campFromDate;
    }


    public String getCampEndDate() {

        return campEndDate;
    }


    public void setCampEndDate(String campEndDate) {

        this.campEndDate = campEndDate;
    }


    public String getStat() {

        return stat;
    }


    public void setStat(String stat) {

        this.stat = stat;
    }


    public String getStatDate() {

        return statDate;
    }


    public void setStatDate(String statDate) {

        this.statDate = statDate;
    }


    public String getExptCnt() {

        return exptCnt;
    }


    public void setExptCnt(String exptCnt) {

        this.exptCnt = exptCnt;
    }


    public String getTrgtCnt() {

        return trgtCnt;
    }


    public void setTrgtCnt(String trgtCnt) {

        this.trgtCnt = trgtCnt;
    }


    public String getRcptCnt() {

        return rcptCnt;
    }


    public void setRcptCnt(String rcptCnt) {

        this.rcptCnt = rcptCnt;
    }


    public String getReprCnt() {

        return reprCnt;
    }


    public void setReprCnt(String reprCnt) {

        this.reprCnt = reprCnt;
    }


    public String getMdlFlag() {

        return mdlFlag;
    }


    public void setMdlFlag(String mdlFlag) {

        this.mdlFlag = mdlFlag;
    }


    public String getSaleMdl() {

        return saleMdl;
    }


    public void setSaleMdl(String saleMdl) {

        this.saleMdl = saleMdl;
    }


    public String getDateFlag() {

        return dateFlag;
    }


    public void setDateFlag(String dateFlag) {

        this.dateFlag = dateFlag;
    }


    public String getFromDate() {

        return fromDate;
    }


    public void setFromDate(String fromDate) {

        this.fromDate = fromDate;
    }


    public String getToDate() {

        return toDate;
    }


    public void setToDate(String toDate) {

        this.toDate = toDate;
    }


    public String getOptnFlag() {

        return optnFlag;
    }


    public void setOptnFlag(String optnFlag) {

        this.optnFlag = optnFlag;
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


    public String getRmrk() {

        return rmrk;
    }


    public void setRmrk(String rmrk) {

        this.rmrk = rmrk;
    }


    public String getDocuDate() {

        return docuDate;
    }


    public void setDocuDate(String docuDate) {

        this.docuDate = docuDate;
    }


    public String getCbGubn() {

        return cbGubn;
    }


    public void setCbGubn(String cbGubn) {

        this.cbGubn = cbGubn;
    }


    public String getCausMaker() {

        return causMaker;
    }


    public void setCausMaker(String causMaker) {

        this.causMaker = causMaker;
    }


    public String getCausPartNo() {

        return causPartNo;
    }


    public void setCausPartNo(String causPartNo) {

        this.causPartNo = causPartNo;
    }


    public String getCausVndrType() {

        return causVndrType;
    }


    public void setCausVndrType(String causVndrType) {

        this.causVndrType = causVndrType;
    }


    public String getCausVndr() {

        return causVndr;
    }


    public void setCausVndr(String causVndr) {

        this.causVndr = causVndr;
    }


    public String getChngPartNo() {

        return chngPartNo;
    }


    public void setChngPartNo(String chngPartNo) {

        this.chngPartNo = chngPartNo;
    }


    public String getCarDfct() {

        return carDfct;
    }


    public void setCarDfct(String carDfct) {

        this.carDfct = carDfct;
    }


    public String getPartDfct() {

        return partDfct;
    }


    public void setPartDfct(String partDfct) {

        this.partDfct = partDfct;
    }


    public String getCampGubnt() {

        return campGubnt;
    }


    public void setCampGubnt(String campGubnt) {

        this.campGubnt = campGubnt;
    }


    public String getCampCheck() {

        return campCheck;
    }


    public void setCampCheck(String campCheck) {

        this.campCheck = campCheck;
    }


    public String getDfctResn() {

        return dfctResn;
    }


    public void setDfctResn(String dfctResn) {

        this.dfctResn = dfctResn;
    }


    public String getChrgRetnCase() {

        return chrgRetnCase;
    }


    public void setChrgRetnCase(String chrgRetnCase) {

        this.chrgRetnCase = chrgRetnCase;
    }


    public String getAutoRecallFlag() {

        return autoRecallFlag;
    }


    public void setAutoRecallFlag(String autoRecallFlag) {

        this.autoRecallFlag = autoRecallFlag;
    }


    public String getTechRptNo() {

        return techRptNo;
    }


    public void setTechRptNo(String techRptNo) {

        this.techRptNo = techRptNo;
    }


    public String getExtraRmrk() {

        return extraRmrk;
    }


    public void setExtraRmrk(String extraRmrk) {

        this.extraRmrk = extraRmrk;
    }


    public String getMileage() {

        return mileage;
    }


    public void setMileage(String mileage) {

        this.mileage = mileage;
    }


    public String getRegVinFromDate() {

        return regVinFromDate;
    }


    public void setRegVinFromDate(String regVinFromDate) {

        this.regVinFromDate = regVinFromDate;
    }


    public String getRegVinToDate() {

        return regVinToDate;
    }


    public void setRegVinToDate(String regVinToDate) {

        this.regVinToDate = regVinToDate;
    }


    public String getFaType() {

        return faType;
    }


    public void setFaType(String faType) {

        this.faType = faType;
    }


    public String getEngDesc() {

        return engDesc;
    }


    public void setEngDesc(String engDesc) {

        this.engDesc = engDesc;
    }


    public String getFaNo() {

        return faNo;
    }


    public void setFaNo(String faNo) {

        this.faNo = faNo;
    }


    public String getCompCatCd() {

        return compCatCd;
    }


    public void setCompCatCd(String compCatCd) {

        this.compCatCd = compCatCd;
    }


    public String getCompCd() {

        return compCd;
    }


    public void setCompCd(String compCd) {

        this.compCd = compCd;
    }


    public String getCausCd() {

        return causCd;
    }


    public void setCausCd(String causCd) {

        this.causCd = causCd;
    }


    public String getReadKmFr() {

        return readKmFr;
    }


    public void setReadKmFr(String readKmFr) {

        this.readKmFr = readKmFr;
    }


    public String getReadKmTo() {

        return readKmTo;
    }


    public void setReadKmTo(String readKmTo) {

        this.readKmTo = readKmTo;
    }


    public String getSafeRiskDesc() {

        return safeRiskDesc;
    }


    public void setSafeRiskDesc(String safeRiskDesc) {

        this.safeRiskDesc = safeRiskDesc;
    }


    public String getRemedyDesc() {

        return remedyDesc;
    }


    public void setRemedyDesc(String remedyDesc) {

        this.remedyDesc = remedyDesc;
    }


    public String getCustomerAction() {

        return customerAction;
    }


    public void setCustomerAction(String customerAction) {

        this.customerAction = customerAction;
    }


    public String getPartAvailability() {

        return partAvailability;
    }


    public void setPartAvailability(String partAvailability) {

        this.partAvailability = partAvailability;
    }


    public String getNotes() {

        return notes;
    }


    public void setNotes(String notes) {

        this.notes = notes;
    }


    public String getSendMailYn() {

        return sendMailYn;
    }


    public void setSendMailYn(String sendMailYn) {

        this.sendMailYn = sendMailYn;
    }


    public String getGfaStatus() {

        return gfaStatus;
    }


    public void setGfaStatus(String gfaStatus) {

        this.gfaStatus = gfaStatus;
    }


    public String getVersion() {

        return version;
    }


    public void setVersion(String version) {

        this.version = version;
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