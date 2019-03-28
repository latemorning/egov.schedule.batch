package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_HPCL")
public class Hpcl {

    private String source = "";
    private String shopType = "";
    private String shopCode = "";
    private String rcptMaker = "";
    private String rcptDate = "";
    private String rcptSeq = "";
    private String workMaker = "";
    private String workGubn = "";
    private String workY = "";
    private String workSeq = "";
    private String workPage = "";
    private String gubnBMk = "";
    private String gubnJMk = "";
    private String campMk = "";
    private String finishMk = "";
    private String amtB = "";
    private String amtJ = "";
    private String vinDup = "";
    private String vinComp = "";
    private String vinType = "";
    private String vinCheck = "";
    private String vinMdlYear = "";
    private String vinPlan = "";
    private String vinBodyNo = "";
    private String vehiNo01 = "";
    private String vehiNo02 = "";
    private String remark = "";
    private String reprResn = "";
    private String reprDesc = "";
    private String bossName = "";
    private String calType = "";
    private String calExcept = "";
    private String jobWorkers = "";
    private String jobNames = "";
    private String statDttm = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public Hpcl() {
    }


    public Hpcl(String source, String shopType, String shopCode, String rcptMaker, String rcptDate, String rcptSeq, String workMaker, String workGubn,
            String workY, String workSeq, String workPage, String gubnBMk, String gubnJMk, String campMk, String finishMk, String amtB, String amtJ,
            String vinDup, String vinComp, String vinType, String vinCheck, String vinMdlYear, String vinPlan, String vinBodyNo, String vehiNo01,
            String vehiNo02, String remark, String reprResn, String reprDesc, String bossName, String calType, String calExcept, String jobWorkers,
            String jobNames, String statDttm, String histRegistDe, String actionCode) {
        super();
        this.source = source;
        this.shopType = shopType;
        this.shopCode = shopCode;
        this.rcptMaker = rcptMaker;
        this.rcptDate = rcptDate;
        this.rcptSeq = rcptSeq;
        this.workMaker = workMaker;
        this.workGubn = workGubn;
        this.workY = workY;
        this.workSeq = workSeq;
        this.workPage = workPage;
        this.gubnBMk = gubnBMk;
        this.gubnJMk = gubnJMk;
        this.campMk = campMk;
        this.finishMk = finishMk;
        this.amtB = amtB;
        this.amtJ = amtJ;
        this.vinDup = vinDup;
        this.vinComp = vinComp;
        this.vinType = vinType;
        this.vinCheck = vinCheck;
        this.vinMdlYear = vinMdlYear;
        this.vinPlan = vinPlan;
        this.vinBodyNo = vinBodyNo;
        this.vehiNo01 = vehiNo01;
        this.vehiNo02 = vehiNo02;
        this.remark = remark;
        this.reprResn = reprResn;
        this.reprDesc = reprDesc;
        this.bossName = bossName;
        this.calType = calType;
        this.calExcept = calExcept;
        this.jobWorkers = jobWorkers;
        this.jobNames = jobNames;
        this.statDttm = statDttm;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "Hpcl [source=" + source + ", shopType=" + shopType + ", shopCode=" + shopCode + ", rcptMaker=" + rcptMaker + ", rcptDate=" + rcptDate
                + ", rcptSeq=" + rcptSeq + ", workMaker=" + workMaker + ", workGubn=" + workGubn + ", workY=" + workY + ", workSeq=" + workSeq + ", workPage="
                + workPage + ", gubnBMk=" + gubnBMk + ", gubnJMk=" + gubnJMk + ", campMk=" + campMk + ", finishMk=" + finishMk + ", amtB=" + amtB + ", amtJ="
                + amtJ + ", vinDup=" + vinDup + ", vinComp=" + vinComp + ", vinType=" + vinType + ", vinCheck=" + vinCheck + ", vinMdlYear=" + vinMdlYear
                + ", vinPlan=" + vinPlan + ", vinBodyNo=" + vinBodyNo + ", vehiNo01=" + vehiNo01 + ", vehiNo02=" + vehiNo02 + ", remark=" + remark
                + ", reprResn=" + reprResn + ", reprDesc=" + reprDesc + ", bossName=" + bossName + ", calType=" + calType + ", calExcept=" + calExcept
                + ", jobWorkers=" + jobWorkers + ", jobNames=" + jobNames + ", statDttm=" + statDttm + ", histRegistDe=" + histRegistDe + ", actionCode="
                + actionCode + "]";
    }


    public String getSource() {

        return source;
    }


    public void setSource(String source) {

        this.source = source;
    }


    public String getShopType() {

        return shopType;
    }


    public void setShopType(String shopType) {

        this.shopType = shopType;
    }


    public String getShopCode() {

        return shopCode;
    }


    public void setShopCode(String shopCode) {

        this.shopCode = shopCode;
    }


    public String getRcptMaker() {

        return rcptMaker;
    }


    public void setRcptMaker(String rcptMaker) {

        this.rcptMaker = rcptMaker;
    }


    public String getRcptDate() {

        return rcptDate;
    }


    public void setRcptDate(String rcptDate) {

        this.rcptDate = rcptDate;
    }


    public String getRcptSeq() {

        return rcptSeq;
    }


    public void setRcptSeq(String rcptSeq) {

        this.rcptSeq = rcptSeq;
    }


    public String getWorkMaker() {

        return workMaker;
    }


    public void setWorkMaker(String workMaker) {

        this.workMaker = workMaker;
    }


    public String getWorkGubn() {

        return workGubn;
    }


    public void setWorkGubn(String workGubn) {

        this.workGubn = workGubn;
    }


    public String getWorkY() {

        return workY;
    }


    public void setWorkY(String workY) {

        this.workY = workY;
    }


    public String getWorkSeq() {

        return workSeq;
    }


    public void setWorkSeq(String workSeq) {

        this.workSeq = workSeq;
    }


    public String getWorkPage() {

        return workPage;
    }


    public void setWorkPage(String workPage) {

        this.workPage = workPage;
    }


    public String getGubnBMk() {

        return gubnBMk;
    }


    public void setGubnBMk(String gubnBMk) {

        this.gubnBMk = gubnBMk;
    }


    public String getGubnJMk() {

        return gubnJMk;
    }


    public void setGubnJMk(String gubnJMk) {

        this.gubnJMk = gubnJMk;
    }


    public String getCampMk() {

        return campMk;
    }


    public void setCampMk(String campMk) {

        this.campMk = campMk;
    }


    public String getFinishMk() {

        return finishMk;
    }


    public void setFinishMk(String finishMk) {

        this.finishMk = finishMk;
    }


    public String getAmtB() {

        return amtB;
    }


    public void setAmtB(String amtB) {

        this.amtB = amtB;
    }


    public String getAmtJ() {

        return amtJ;
    }


    public void setAmtJ(String amtJ) {

        this.amtJ = amtJ;
    }


    public String getVinDup() {

        return vinDup;
    }


    public void setVinDup(String vinDup) {

        this.vinDup = vinDup;
    }


    public String getVinComp() {

        return vinComp;
    }


    public void setVinComp(String vinComp) {

        this.vinComp = vinComp;
    }


    public String getVinType() {

        return vinType;
    }


    public void setVinType(String vinType) {

        this.vinType = vinType;
    }


    public String getVinCheck() {

        return vinCheck;
    }


    public void setVinCheck(String vinCheck) {

        this.vinCheck = vinCheck;
    }


    public String getVinMdlYear() {

        return vinMdlYear;
    }


    public void setVinMdlYear(String vinMdlYear) {

        this.vinMdlYear = vinMdlYear;
    }


    public String getVinPlan() {

        return vinPlan;
    }


    public void setVinPlan(String vinPlan) {

        this.vinPlan = vinPlan;
    }


    public String getVinBodyNo() {

        return vinBodyNo;
    }


    public void setVinBodyNo(String vinBodyNo) {

        this.vinBodyNo = vinBodyNo;
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


    public String getRemark() {

        return remark;
    }


    public void setRemark(String remark) {

        this.remark = remark;
    }


    public String getReprResn() {

        return reprResn;
    }


    public void setReprResn(String reprResn) {

        this.reprResn = reprResn;
    }


    public String getReprDesc() {

        return reprDesc;
    }


    public void setReprDesc(String reprDesc) {

        this.reprDesc = reprDesc;
    }


    public String getBossName() {

        return bossName;
    }


    public void setBossName(String bossName) {

        this.bossName = bossName;
    }


    public String getCalType() {

        return calType;
    }


    public void setCalType(String calType) {

        this.calType = calType;
    }


    public String getCalExcept() {

        return calExcept;
    }


    public void setCalExcept(String calExcept) {

        this.calExcept = calExcept;
    }


    public String getJobWorkers() {

        return jobWorkers;
    }


    public void setJobWorkers(String jobWorkers) {

        this.jobWorkers = jobWorkers;
    }


    public String getJobNames() {

        return jobNames;
    }


    public void setJobNames(String jobNames) {

        this.jobNames = jobNames;
    }


    public String getStatDttm() {

        return statDttm;
    }


    public void setStatDttm(String statDttm) {

        this.statDttm = statDttm;
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
