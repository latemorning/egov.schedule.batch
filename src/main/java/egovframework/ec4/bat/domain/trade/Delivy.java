package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_DELIVY")
public class Delivy {

    private String dealerCd = "";
    private String contractNo = "";
    private String businessId = "";
    private String brchCd = "";
    private String centerCd = "";
    private String brchNm = "";
    private String saleManCd = "";
    private String saleManNm = "";
    private String customerCd = "";
    private String outPlaceCd = "";
    private String businessType = "";
    private String industryType = "";
    private String assignReqDt = "";
    private String assignDt = "";
    private String cancelDt = "";
    private String statusCd = "";
    private String modelCd = "";
    private String specCd = "";
    private String carCd = "";
    private String outBasicCnt = "";
    private String saleAmt = "";
    private String colorCd = "";
    private String paymentDt = "";
    private String totalSaleAmt = "";
    private String saleCd = "";
    private String instPerd = "";
    private String outDt = "";
    private String contAmt = "";
    private String indoAmt = "";
    private String initRate = "";
    private String allotmentAmt = "";
    private String ijaRate = "";
    private String lossCollectionAmt = "";
    private String nonmoveEstateAmt = "";
    private String contDt = "";
    private String businessNo = "";
    private String residentNo = "";
    private String residentNm = "";
    private String businessNm = "";
    private String residentAddr = "";
    private String businessAddr = "";
    private String residentTelNo = "";
    private String businessTelNo = "";
    private String residentPostCd = "";
    private String businessPostCd = "";
    private String dlvyPrmsDt1 = "";
    private String dlvyPrmsAmt1 = "";
    private String dlvyPrmsDt2 = "";
    private String dlvyPrmsAmt2 = "";
    private String dlvyPrmsDt3 = "";
    private String dlvyPrmsAmt3 = "";
    private String dlvyPrmsDt4 = "";
    private String dlvyPrmsAmt4 = "";
    private String dlvyPrmsDt5 = "";
    private String dlvyPrmsAmt5 = "";
    private String stampAmt = "";
    private String fixedDcAmt = "";
    private String fixedDcRate = "";
    private String unfixedDcAmt = "";
    private String dlvyPrmsYn1 = "";
    private String dlvyPrmsYn2 = "";
    private String dlvyPrmsYn3 = "";
    private String dlvyPrmsYn4 = "";
    private String dlvyPrmsYn5 = "";
    private String spSaleAmt = "";
    private String establePayGu = "";
    private String consignAmt = "";
    private String finaAmt = "";
    private String consignCd = "";
    private String establePayRate = "";
    private String guaranteeAmt = "";
    private String estableAmt = "";
    private String saleTypeCd = "";
    private String optionCd = "";
    private String optionAmt = "";
    private String allotmentEnd = "";
    private String guaranteeRate = "";
    private String newIjaRate = "";
    private String salesPromotionCd = "";
    private String graceAmt1 = "";
    private String graceIjaRate1 = "";
    private String graceCompRate1 = "";
    private String carNo = "";
    private String contCnt = "";
    private String cancelCnt = "";
    private String selfIjaAmt = "";
    private String bankIjaAmt = "";
    private String carSaleAmt = "";
    private String colorAmt = "";
    private String buyTypeCd = "";
    private String useTypeCd = "";
    private String handPersonCd = "";
    private String remark = "";
    private String tukTp = "";
    private String vatTp = "";
    private String tukAmt = "";
    private String edkAmt = "";
    private String vatAmt = "";
    private String assignBasisDate = "";
    private String regDate = "";
    private String updtDate = "";
    private String updtUserCd = "";
    private String juminPostCd = "";
    private String juminPostAddr = "";
    private String chassisNo = "";
    private String expectDt = "";
    private String fleetCustMk = "";
    private String outPlaceType = "";
    private String outToArea = "";
    private String transAmt = "";
    private String outPlaceAmt = "";
    private String trustCd = "";
    private String specialDcAmt = "";
    private String onceDcAmt = "";
    private String empDcAmt = "";
    private String flawDcAmt = "";
    private String longDcAmt = "";
    private String displayDcAmt = "";
    private String fleetDcAmt = "";
    private String campaignDcAmt = "";
    private String proDcAmt = "";
    private String addDcAmt = "";
    private String cardDcAmt = "";
    private String autoDcAmt = "";
    private String etcDcAmt = "";
    private String payCd = "";
    private String capitalCd = "";
    private String beginAcceptDt = "";
    private String payKeepTerm = "";
    private String payKeepRate = "";
    private String delayTerm = "";
    private String delayRate = "";
    private String delayUseRate = "";
    private String payType = "";
    private String payUseGrade = "";
    private String offtaxStat = "";
    private String offtaxApprDttm = "";
    private String offtaxUserCd = "";
    private String reductCd = "";
    private String reductTukAmt = "";
    private String reductTukRate = "";
    private String apprDt = "";
    private String apprSeq = "";
    private String contractStatus = "";
    private String regUserCd = "";
    private String receiptNo = "";
    private String receiptStat = "";
    private String receiptApprDttm = "";
    private String receiptApprNo = "";
    private String handPhoneNo = "";
    private String payStatus = "";
    private String payApprDttm = "";
    private String payApprNo = "";
    private String befSignoffDt = "";
    private String befChassisNo = "";
    private String remark2 = "";
    private String payCrdtRate = "";
    private String stockAmt = "";
    private String contractNoO = "";
    private String email = "";
    private String oldCarPlan = "";
    private String oldCarMaker = "";
    private String oldCarModel = "";
    private String oldCarMy = "";
    private String residentPostRegNo = "";
    private String businessPostRegNo = "";
    private String juminPostRegNo = "";
    private String salesModlCd = "";
    private String indoDt = "";
    private String ewItemCd = "";
    private String ewItemAmt = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public Delivy() {
    }


    public Delivy(String dealerCd, String contractNo, String businessId, String brchCd, String centerCd, String brchNm, String saleManCd, String saleManNm,
            String customerCd, String outPlaceCd, String businessType, String industryType, String assignReqDt, String assignDt, String cancelDt,
            String statusCd, String modelCd, String specCd, String carCd, String outBasicCnt, String saleAmt, String colorCd, String paymentDt,
            String totalSaleAmt, String saleCd, String instPerd, String outDt, String contAmt, String indoAmt, String initRate, String allotmentAmt,
            String ijaRate, String lossCollectionAmt, String nonmoveEstateAmt, String contDt, String businessNo, String residentNo, String residentNm,
            String businessNm, String residentAddr, String businessAddr, String residentTelNo, String businessTelNo, String residentPostCd,
            String businessPostCd, String dlvyPrmsDt1, String dlvyPrmsAmt1, String dlvyPrmsDt2, String dlvyPrmsAmt2, String dlvyPrmsDt3, String dlvyPrmsAmt3,
            String dlvyPrmsDt4, String dlvyPrmsAmt4, String dlvyPrmsDt5, String dlvyPrmsAmt5, String stampAmt, String fixedDcAmt, String fixedDcRate,
            String unfixedDcAmt, String dlvyPrmsYn1, String dlvyPrmsYn2, String dlvyPrmsYn3, String dlvyPrmsYn4, String dlvyPrmsYn5, String spSaleAmt,
            String establePayGu, String consignAmt, String finaAmt, String consignCd, String establePayRate, String guaranteeAmt, String estableAmt,
            String saleTypeCd, String optionCd, String optionAmt, String allotmentEnd, String guaranteeRate, String newIjaRate, String salesPromotionCd,
            String graceAmt1, String graceIjaRate1, String graceCompRate1, String carNo, String contCnt, String cancelCnt, String selfIjaAmt, String bankIjaAmt,
            String carSaleAmt, String colorAmt, String buyTypeCd, String useTypeCd, String handPersonCd, String remark, String tukTp, String vatTp,
            String tukAmt, String edkAmt, String vatAmt, String assignBasisDate, String regDate, String updtDate, String updtUserCd, String juminPostCd,
            String juminPostAddr, String chassisNo, String expectDt, String fleetCustMk, String outPlaceType, String outToArea, String transAmt,
            String outPlaceAmt, String trustCd, String specialDcAmt, String onceDcAmt, String empDcAmt, String flawDcAmt, String longDcAmt, String displayDcAmt,
            String fleetDcAmt, String campaignDcAmt, String proDcAmt, String addDcAmt, String cardDcAmt, String autoDcAmt, String etcDcAmt, String payCd,
            String capitalCd, String beginAcceptDt, String payKeepTerm, String payKeepRate, String delayTerm, String delayRate, String delayUseRate,
            String payType, String payUseGrade, String offtaxStat, String offtaxApprDttm, String offtaxUserCd, String reductCd, String reductTukAmt,
            String reductTukRate, String apprDt, String apprSeq, String contractStatus, String regUserCd, String receiptNo, String receiptStat,
            String receiptApprDttm, String receiptApprNo, String handPhoneNo, String payStatus, String payApprDttm, String payApprNo, String befSignoffDt,
            String befChassisNo, String remark2, String payCrdtRate, String stockAmt, String contractNoO, String email, String oldCarPlan, String oldCarMaker,
            String oldCarModel, String oldCarMy, String residentPostRegNo, String businessPostRegNo, String juminPostRegNo, String salesModlCd, String indoDt,
            String ewItemCd, String ewItemAmt, String histRegistDe, String actionCode) {
        super();
        this.dealerCd = dealerCd;
        this.contractNo = contractNo;
        this.businessId = businessId;
        this.brchCd = brchCd;
        this.centerCd = centerCd;
        this.brchNm = brchNm;
        this.saleManCd = saleManCd;
        this.saleManNm = saleManNm;
        this.customerCd = customerCd;
        this.outPlaceCd = outPlaceCd;
        this.businessType = businessType;
        this.industryType = industryType;
        this.assignReqDt = assignReqDt;
        this.assignDt = assignDt;
        this.cancelDt = cancelDt;
        this.statusCd = statusCd;
        this.modelCd = modelCd;
        this.specCd = specCd;
        this.carCd = carCd;
        this.outBasicCnt = outBasicCnt;
        this.saleAmt = saleAmt;
        this.colorCd = colorCd;
        this.paymentDt = paymentDt;
        this.totalSaleAmt = totalSaleAmt;
        this.saleCd = saleCd;
        this.instPerd = instPerd;
        this.outDt = outDt;
        this.contAmt = contAmt;
        this.indoAmt = indoAmt;
        this.initRate = initRate;
        this.allotmentAmt = allotmentAmt;
        this.ijaRate = ijaRate;
        this.lossCollectionAmt = lossCollectionAmt;
        this.nonmoveEstateAmt = nonmoveEstateAmt;
        this.contDt = contDt;
        this.businessNo = businessNo;
        this.residentNo = residentNo;
        this.residentNm = residentNm;
        this.businessNm = businessNm;
        this.residentAddr = residentAddr;
        this.businessAddr = businessAddr;
        this.residentTelNo = residentTelNo;
        this.businessTelNo = businessTelNo;
        this.residentPostCd = residentPostCd;
        this.businessPostCd = businessPostCd;
        this.dlvyPrmsDt1 = dlvyPrmsDt1;
        this.dlvyPrmsAmt1 = dlvyPrmsAmt1;
        this.dlvyPrmsDt2 = dlvyPrmsDt2;
        this.dlvyPrmsAmt2 = dlvyPrmsAmt2;
        this.dlvyPrmsDt3 = dlvyPrmsDt3;
        this.dlvyPrmsAmt3 = dlvyPrmsAmt3;
        this.dlvyPrmsDt4 = dlvyPrmsDt4;
        this.dlvyPrmsAmt4 = dlvyPrmsAmt4;
        this.dlvyPrmsDt5 = dlvyPrmsDt5;
        this.dlvyPrmsAmt5 = dlvyPrmsAmt5;
        this.stampAmt = stampAmt;
        this.fixedDcAmt = fixedDcAmt;
        this.fixedDcRate = fixedDcRate;
        this.unfixedDcAmt = unfixedDcAmt;
        this.dlvyPrmsYn1 = dlvyPrmsYn1;
        this.dlvyPrmsYn2 = dlvyPrmsYn2;
        this.dlvyPrmsYn3 = dlvyPrmsYn3;
        this.dlvyPrmsYn4 = dlvyPrmsYn4;
        this.dlvyPrmsYn5 = dlvyPrmsYn5;
        this.spSaleAmt = spSaleAmt;
        this.establePayGu = establePayGu;
        this.consignAmt = consignAmt;
        this.finaAmt = finaAmt;
        this.consignCd = consignCd;
        this.establePayRate = establePayRate;
        this.guaranteeAmt = guaranteeAmt;
        this.estableAmt = estableAmt;
        this.saleTypeCd = saleTypeCd;
        this.optionCd = optionCd;
        this.optionAmt = optionAmt;
        this.allotmentEnd = allotmentEnd;
        this.guaranteeRate = guaranteeRate;
        this.newIjaRate = newIjaRate;
        this.salesPromotionCd = salesPromotionCd;
        this.graceAmt1 = graceAmt1;
        this.graceIjaRate1 = graceIjaRate1;
        this.graceCompRate1 = graceCompRate1;
        this.carNo = carNo;
        this.contCnt = contCnt;
        this.cancelCnt = cancelCnt;
        this.selfIjaAmt = selfIjaAmt;
        this.bankIjaAmt = bankIjaAmt;
        this.carSaleAmt = carSaleAmt;
        this.colorAmt = colorAmt;
        this.buyTypeCd = buyTypeCd;
        this.useTypeCd = useTypeCd;
        this.handPersonCd = handPersonCd;
        this.remark = remark;
        this.tukTp = tukTp;
        this.vatTp = vatTp;
        this.tukAmt = tukAmt;
        this.edkAmt = edkAmt;
        this.vatAmt = vatAmt;
        this.assignBasisDate = assignBasisDate;
        this.regDate = regDate;
        this.updtDate = updtDate;
        this.updtUserCd = updtUserCd;
        this.juminPostCd = juminPostCd;
        this.juminPostAddr = juminPostAddr;
        this.chassisNo = chassisNo;
        this.expectDt = expectDt;
        this.fleetCustMk = fleetCustMk;
        this.outPlaceType = outPlaceType;
        this.outToArea = outToArea;
        this.transAmt = transAmt;
        this.outPlaceAmt = outPlaceAmt;
        this.trustCd = trustCd;
        this.specialDcAmt = specialDcAmt;
        this.onceDcAmt = onceDcAmt;
        this.empDcAmt = empDcAmt;
        this.flawDcAmt = flawDcAmt;
        this.longDcAmt = longDcAmt;
        this.displayDcAmt = displayDcAmt;
        this.fleetDcAmt = fleetDcAmt;
        this.campaignDcAmt = campaignDcAmt;
        this.proDcAmt = proDcAmt;
        this.addDcAmt = addDcAmt;
        this.cardDcAmt = cardDcAmt;
        this.autoDcAmt = autoDcAmt;
        this.etcDcAmt = etcDcAmt;
        this.payCd = payCd;
        this.capitalCd = capitalCd;
        this.beginAcceptDt = beginAcceptDt;
        this.payKeepTerm = payKeepTerm;
        this.payKeepRate = payKeepRate;
        this.delayTerm = delayTerm;
        this.delayRate = delayRate;
        this.delayUseRate = delayUseRate;
        this.payType = payType;
        this.payUseGrade = payUseGrade;
        this.offtaxStat = offtaxStat;
        this.offtaxApprDttm = offtaxApprDttm;
        this.offtaxUserCd = offtaxUserCd;
        this.reductCd = reductCd;
        this.reductTukAmt = reductTukAmt;
        this.reductTukRate = reductTukRate;
        this.apprDt = apprDt;
        this.apprSeq = apprSeq;
        this.contractStatus = contractStatus;
        this.regUserCd = regUserCd;
        this.receiptNo = receiptNo;
        this.receiptStat = receiptStat;
        this.receiptApprDttm = receiptApprDttm;
        this.receiptApprNo = receiptApprNo;
        this.handPhoneNo = handPhoneNo;
        this.payStatus = payStatus;
        this.payApprDttm = payApprDttm;
        this.payApprNo = payApprNo;
        this.befSignoffDt = befSignoffDt;
        this.befChassisNo = befChassisNo;
        this.remark2 = remark2;
        this.payCrdtRate = payCrdtRate;
        this.stockAmt = stockAmt;
        this.contractNoO = contractNoO;
        this.email = email;
        this.oldCarPlan = oldCarPlan;
        this.oldCarMaker = oldCarMaker;
        this.oldCarModel = oldCarModel;
        this.oldCarMy = oldCarMy;
        this.residentPostRegNo = residentPostRegNo;
        this.businessPostRegNo = businessPostRegNo;
        this.juminPostRegNo = juminPostRegNo;
        this.salesModlCd = salesModlCd;
        this.indoDt = indoDt;
        this.ewItemCd = ewItemCd;
        this.ewItemAmt = ewItemAmt;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "Delivy [dealerCd=" + dealerCd + ", contractNo=" + contractNo + ", businessId=" + businessId + ", brchCd=" + brchCd + ", centerCd=" + centerCd
                + ", brchNm=" + brchNm + ", saleManCd=" + saleManCd + ", saleManNm=" + saleManNm + ", customerCd=" + customerCd + ", outPlaceCd=" + outPlaceCd
                + ", businessType=" + businessType + ", industryType=" + industryType + ", assignReqDt=" + assignReqDt + ", assignDt=" + assignDt
                + ", cancelDt=" + cancelDt + ", statusCd=" + statusCd + ", modelCd=" + modelCd + ", specCd=" + specCd + ", carCd=" + carCd + ", outBasicCnt="
                + outBasicCnt + ", saleAmt=" + saleAmt + ", colorCd=" + colorCd + ", paymentDt=" + paymentDt + ", totalSaleAmt=" + totalSaleAmt + ", saleCd="
                + saleCd + ", instPerd=" + instPerd + ", outDt=" + outDt + ", contAmt=" + contAmt + ", indoAmt=" + indoAmt + ", initRate=" + initRate
                + ", allotmentAmt=" + allotmentAmt + ", ijaRate=" + ijaRate + ", lossCollectionAmt=" + lossCollectionAmt + ", nonmoveEstateAmt="
                + nonmoveEstateAmt + ", contDt=" + contDt + ", businessNo=" + businessNo + ", residentNo=" + residentNo + ", residentNm=" + residentNm
                + ", businessNm=" + businessNm + ", residentAddr=" + residentAddr + ", businessAddr=" + businessAddr + ", residentTelNo=" + residentTelNo
                + ", businessTelNo=" + businessTelNo + ", residentPostCd=" + residentPostCd + ", businessPostCd=" + businessPostCd + ", dlvyPrmsDt1="
                + dlvyPrmsDt1 + ", dlvyPrmsAmt1=" + dlvyPrmsAmt1 + ", dlvyPrmsDt2=" + dlvyPrmsDt2 + ", dlvyPrmsAmt2=" + dlvyPrmsAmt2 + ", dlvyPrmsDt3="
                + dlvyPrmsDt3 + ", dlvyPrmsAmt3=" + dlvyPrmsAmt3 + ", dlvyPrmsDt4=" + dlvyPrmsDt4 + ", dlvyPrmsAmt4=" + dlvyPrmsAmt4 + ", dlvyPrmsDt5="
                + dlvyPrmsDt5 + ", dlvyPrmsAmt5=" + dlvyPrmsAmt5 + ", stampAmt=" + stampAmt + ", fixedDcAmt=" + fixedDcAmt + ", fixedDcRate=" + fixedDcRate
                + ", unfixedDcAmt=" + unfixedDcAmt + ", dlvyPrmsYn1=" + dlvyPrmsYn1 + ", dlvyPrmsYn2=" + dlvyPrmsYn2 + ", dlvyPrmsYn3=" + dlvyPrmsYn3
                + ", dlvyPrmsYn4=" + dlvyPrmsYn4 + ", dlvyPrmsYn5=" + dlvyPrmsYn5 + ", spSaleAmt=" + spSaleAmt + ", establePayGu=" + establePayGu
                + ", consignAmt=" + consignAmt + ", finaAmt=" + finaAmt + ", consignCd=" + consignCd + ", establePayRate=" + establePayRate + ", guaranteeAmt="
                + guaranteeAmt + ", estableAmt=" + estableAmt + ", saleTypeCd=" + saleTypeCd + ", optionCd=" + optionCd + ", optionAmt=" + optionAmt
                + ", allotmentEnd=" + allotmentEnd + ", guaranteeRate=" + guaranteeRate + ", newIjaRate=" + newIjaRate + ", salesPromotionCd="
                + salesPromotionCd + ", graceAmt1=" + graceAmt1 + ", graceIjaRate1=" + graceIjaRate1 + ", graceCompRate1=" + graceCompRate1 + ", carNo=" + carNo
                + ", contCnt=" + contCnt + ", cancelCnt=" + cancelCnt + ", selfIjaAmt=" + selfIjaAmt + ", bankIjaAmt=" + bankIjaAmt + ", carSaleAmt="
                + carSaleAmt + ", colorAmt=" + colorAmt + ", buyTypeCd=" + buyTypeCd + ", useTypeCd=" + useTypeCd + ", handPersonCd=" + handPersonCd
                + ", remark=" + remark + ", tukTp=" + tukTp + ", vatTp=" + vatTp + ", tukAmt=" + tukAmt + ", edkAmt=" + edkAmt + ", vatAmt=" + vatAmt
                + ", assignBasisDate=" + assignBasisDate + ", regDate=" + regDate + ", updtDate=" + updtDate + ", updtUserCd=" + updtUserCd + ", juminPostCd="
                + juminPostCd + ", juminPostAddr=" + juminPostAddr + ", chassisNo=" + chassisNo + ", expectDt=" + expectDt + ", fleetCustMk=" + fleetCustMk
                + ", outPlaceType=" + outPlaceType + ", outToArea=" + outToArea + ", transAmt=" + transAmt + ", outPlaceAmt=" + outPlaceAmt + ", trustCd="
                + trustCd + ", specialDcAmt=" + specialDcAmt + ", onceDcAmt=" + onceDcAmt + ", empDcAmt=" + empDcAmt + ", flawDcAmt=" + flawDcAmt
                + ", longDcAmt=" + longDcAmt + ", displayDcAmt=" + displayDcAmt + ", fleetDcAmt=" + fleetDcAmt + ", campaignDcAmt=" + campaignDcAmt
                + ", proDcAmt=" + proDcAmt + ", addDcAmt=" + addDcAmt + ", cardDcAmt=" + cardDcAmt + ", autoDcAmt=" + autoDcAmt + ", etcDcAmt=" + etcDcAmt
                + ", payCd=" + payCd + ", capitalCd=" + capitalCd + ", beginAcceptDt=" + beginAcceptDt + ", payKeepTerm=" + payKeepTerm + ", payKeepRate="
                + payKeepRate + ", delayTerm=" + delayTerm + ", delayRate=" + delayRate + ", delayUseRate=" + delayUseRate + ", payType=" + payType
                + ", payUseGrade=" + payUseGrade + ", offtaxStat=" + offtaxStat + ", offtaxApprDttm=" + offtaxApprDttm + ", offtaxUserCd=" + offtaxUserCd
                + ", reductCd=" + reductCd + ", reductTukAmt=" + reductTukAmt + ", reductTukRate=" + reductTukRate + ", apprDt=" + apprDt + ", apprSeq="
                + apprSeq + ", contractStatus=" + contractStatus + ", regUserCd=" + regUserCd + ", receiptNo=" + receiptNo + ", receiptStat=" + receiptStat
                + ", receiptApprDttm=" + receiptApprDttm + ", receiptApprNo=" + receiptApprNo + ", handPhoneNo=" + handPhoneNo + ", payStatus=" + payStatus
                + ", payApprDttm=" + payApprDttm + ", payApprNo=" + payApprNo + ", befSignoffDt=" + befSignoffDt + ", befChassisNo=" + befChassisNo
                + ", remark2=" + remark2 + ", payCrdtRate=" + payCrdtRate + ", stockAmt=" + stockAmt + ", contractNoO=" + contractNoO + ", email=" + email
                + ", oldCarPlan=" + oldCarPlan + ", oldCarMaker=" + oldCarMaker + ", oldCarModel=" + oldCarModel + ", oldCarMy=" + oldCarMy
                + ", residentPostRegNo=" + residentPostRegNo + ", businessPostRegNo=" + businessPostRegNo + ", juminPostRegNo=" + juminPostRegNo
                + ", salesModlCd=" + salesModlCd + ", indoDt=" + indoDt + ", ewItemCd=" + ewItemCd + ", ewItemAmt=" + ewItemAmt + ", histRegistDe="
                + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getDealerCd() {

        return dealerCd;
    }


    public void setDealerCd(String dealerCd) {

        this.dealerCd = dealerCd;
    }


    public String getContractNo() {

        return contractNo;
    }


    public void setContractNo(String contractNo) {

        this.contractNo = contractNo;
    }


    public String getBusinessId() {

        return businessId;
    }


    public void setBusinessId(String businessId) {

        this.businessId = businessId;
    }


    public String getBrchCd() {

        return brchCd;
    }


    public void setBrchCd(String brchCd) {

        this.brchCd = brchCd;
    }


    public String getCenterCd() {

        return centerCd;
    }


    public void setCenterCd(String centerCd) {

        this.centerCd = centerCd;
    }


    public String getBrchNm() {

        return brchNm;
    }


    public void setBrchNm(String brchNm) {

        this.brchNm = brchNm;
    }


    public String getSaleManCd() {

        return saleManCd;
    }


    public void setSaleManCd(String saleManCd) {

        this.saleManCd = saleManCd;
    }


    public String getSaleManNm() {

        return saleManNm;
    }


    public void setSaleManNm(String saleManNm) {

        this.saleManNm = saleManNm;
    }


    public String getCustomerCd() {

        return customerCd;
    }


    public void setCustomerCd(String customerCd) {

        this.customerCd = customerCd;
    }


    public String getOutPlaceCd() {

        return outPlaceCd;
    }


    public void setOutPlaceCd(String outPlaceCd) {

        this.outPlaceCd = outPlaceCd;
    }


    public String getBusinessType() {

        return businessType;
    }


    public void setBusinessType(String businessType) {

        this.businessType = businessType;
    }


    public String getIndustryType() {

        return industryType;
    }


    public void setIndustryType(String industryType) {

        this.industryType = industryType;
    }


    public String getAssignReqDt() {

        return assignReqDt;
    }


    public void setAssignReqDt(String assignReqDt) {

        this.assignReqDt = assignReqDt;
    }


    public String getAssignDt() {

        return assignDt;
    }


    public void setAssignDt(String assignDt) {

        this.assignDt = assignDt;
    }


    public String getCancelDt() {

        return cancelDt;
    }


    public void setCancelDt(String cancelDt) {

        this.cancelDt = cancelDt;
    }


    public String getStatusCd() {

        return statusCd;
    }


    public void setStatusCd(String statusCd) {

        this.statusCd = statusCd;
    }


    public String getModelCd() {

        return modelCd;
    }


    public void setModelCd(String modelCd) {

        this.modelCd = modelCd;
    }


    public String getSpecCd() {

        return specCd;
    }


    public void setSpecCd(String specCd) {

        this.specCd = specCd;
    }


    public String getCarCd() {

        return carCd;
    }


    public void setCarCd(String carCd) {

        this.carCd = carCd;
    }


    public String getOutBasicCnt() {

        return outBasicCnt;
    }


    public void setOutBasicCnt(String outBasicCnt) {

        this.outBasicCnt = outBasicCnt;
    }


    public String getSaleAmt() {

        return saleAmt;
    }


    public void setSaleAmt(String saleAmt) {

        this.saleAmt = saleAmt;
    }


    public String getColorCd() {

        return colorCd;
    }


    public void setColorCd(String colorCd) {

        this.colorCd = colorCd;
    }


    public String getPaymentDt() {

        return paymentDt;
    }


    public void setPaymentDt(String paymentDt) {

        this.paymentDt = paymentDt;
    }


    public String getTotalSaleAmt() {

        return totalSaleAmt;
    }


    public void setTotalSaleAmt(String totalSaleAmt) {

        this.totalSaleAmt = totalSaleAmt;
    }


    public String getSaleCd() {

        return saleCd;
    }


    public void setSaleCd(String saleCd) {

        this.saleCd = saleCd;
    }


    public String getInstPerd() {

        return instPerd;
    }


    public void setInstPerd(String instPerd) {

        this.instPerd = instPerd;
    }


    public String getOutDt() {

        return outDt;
    }


    public void setOutDt(String outDt) {

        this.outDt = outDt;
    }


    public String getContAmt() {

        return contAmt;
    }


    public void setContAmt(String contAmt) {

        this.contAmt = contAmt;
    }


    public String getIndoAmt() {

        return indoAmt;
    }


    public void setIndoAmt(String indoAmt) {

        this.indoAmt = indoAmt;
    }


    public String getInitRate() {

        return initRate;
    }


    public void setInitRate(String initRate) {

        this.initRate = initRate;
    }


    public String getAllotmentAmt() {

        return allotmentAmt;
    }


    public void setAllotmentAmt(String allotmentAmt) {

        this.allotmentAmt = allotmentAmt;
    }


    public String getIjaRate() {

        return ijaRate;
    }


    public void setIjaRate(String ijaRate) {

        this.ijaRate = ijaRate;
    }


    public String getLossCollectionAmt() {

        return lossCollectionAmt;
    }


    public void setLossCollectionAmt(String lossCollectionAmt) {

        this.lossCollectionAmt = lossCollectionAmt;
    }


    public String getNonmoveEstateAmt() {

        return nonmoveEstateAmt;
    }


    public void setNonmoveEstateAmt(String nonmoveEstateAmt) {

        this.nonmoveEstateAmt = nonmoveEstateAmt;
    }


    public String getContDt() {

        return contDt;
    }


    public void setContDt(String contDt) {

        this.contDt = contDt;
    }


    public String getBusinessNo() {

        return businessNo;
    }


    public void setBusinessNo(String businessNo) {

        this.businessNo = businessNo;
    }


    public String getResidentNo() {

        return residentNo;
    }


    public void setResidentNo(String residentNo) {

        this.residentNo = residentNo;
    }


    public String getResidentNm() {

        return residentNm;
    }


    public void setResidentNm(String residentNm) {

        this.residentNm = residentNm;
    }


    public String getBusinessNm() {

        return businessNm;
    }


    public void setBusinessNm(String businessNm) {

        this.businessNm = businessNm;
    }


    public String getResidentAddr() {

        return residentAddr;
    }


    public void setResidentAddr(String residentAddr) {

        this.residentAddr = residentAddr;
    }


    public String getBusinessAddr() {

        return businessAddr;
    }


    public void setBusinessAddr(String businessAddr) {

        this.businessAddr = businessAddr;
    }


    public String getResidentTelNo() {

        return residentTelNo;
    }


    public void setResidentTelNo(String residentTelNo) {

        this.residentTelNo = residentTelNo;
    }


    public String getBusinessTelNo() {

        return businessTelNo;
    }


    public void setBusinessTelNo(String businessTelNo) {

        this.businessTelNo = businessTelNo;
    }


    public String getResidentPostCd() {

        return residentPostCd;
    }


    public void setResidentPostCd(String residentPostCd) {

        this.residentPostCd = residentPostCd;
    }


    public String getBusinessPostCd() {

        return businessPostCd;
    }


    public void setBusinessPostCd(String businessPostCd) {

        this.businessPostCd = businessPostCd;
    }


    public String getDlvyPrmsDt1() {

        return dlvyPrmsDt1;
    }


    public void setDlvyPrmsDt1(String dlvyPrmsDt1) {

        this.dlvyPrmsDt1 = dlvyPrmsDt1;
    }


    public String getDlvyPrmsAmt1() {

        return dlvyPrmsAmt1;
    }


    public void setDlvyPrmsAmt1(String dlvyPrmsAmt1) {

        this.dlvyPrmsAmt1 = dlvyPrmsAmt1;
    }


    public String getDlvyPrmsDt2() {

        return dlvyPrmsDt2;
    }


    public void setDlvyPrmsDt2(String dlvyPrmsDt2) {

        this.dlvyPrmsDt2 = dlvyPrmsDt2;
    }


    public String getDlvyPrmsAmt2() {

        return dlvyPrmsAmt2;
    }


    public void setDlvyPrmsAmt2(String dlvyPrmsAmt2) {

        this.dlvyPrmsAmt2 = dlvyPrmsAmt2;
    }


    public String getDlvyPrmsDt3() {

        return dlvyPrmsDt3;
    }


    public void setDlvyPrmsDt3(String dlvyPrmsDt3) {

        this.dlvyPrmsDt3 = dlvyPrmsDt3;
    }


    public String getDlvyPrmsAmt3() {

        return dlvyPrmsAmt3;
    }


    public void setDlvyPrmsAmt3(String dlvyPrmsAmt3) {

        this.dlvyPrmsAmt3 = dlvyPrmsAmt3;
    }


    public String getDlvyPrmsDt4() {

        return dlvyPrmsDt4;
    }


    public void setDlvyPrmsDt4(String dlvyPrmsDt4) {

        this.dlvyPrmsDt4 = dlvyPrmsDt4;
    }


    public String getDlvyPrmsAmt4() {

        return dlvyPrmsAmt4;
    }


    public void setDlvyPrmsAmt4(String dlvyPrmsAmt4) {

        this.dlvyPrmsAmt4 = dlvyPrmsAmt4;
    }


    public String getDlvyPrmsDt5() {

        return dlvyPrmsDt5;
    }


    public void setDlvyPrmsDt5(String dlvyPrmsDt5) {

        this.dlvyPrmsDt5 = dlvyPrmsDt5;
    }


    public String getDlvyPrmsAmt5() {

        return dlvyPrmsAmt5;
    }


    public void setDlvyPrmsAmt5(String dlvyPrmsAmt5) {

        this.dlvyPrmsAmt5 = dlvyPrmsAmt5;
    }


    public String getStampAmt() {

        return stampAmt;
    }


    public void setStampAmt(String stampAmt) {

        this.stampAmt = stampAmt;
    }


    public String getFixedDcAmt() {

        return fixedDcAmt;
    }


    public void setFixedDcAmt(String fixedDcAmt) {

        this.fixedDcAmt = fixedDcAmt;
    }


    public String getFixedDcRate() {

        return fixedDcRate;
    }


    public void setFixedDcRate(String fixedDcRate) {

        this.fixedDcRate = fixedDcRate;
    }


    public String getUnfixedDcAmt() {

        return unfixedDcAmt;
    }


    public void setUnfixedDcAmt(String unfixedDcAmt) {

        this.unfixedDcAmt = unfixedDcAmt;
    }


    public String getDlvyPrmsYn1() {

        return dlvyPrmsYn1;
    }


    public void setDlvyPrmsYn1(String dlvyPrmsYn1) {

        this.dlvyPrmsYn1 = dlvyPrmsYn1;
    }


    public String getDlvyPrmsYn2() {

        return dlvyPrmsYn2;
    }


    public void setDlvyPrmsYn2(String dlvyPrmsYn2) {

        this.dlvyPrmsYn2 = dlvyPrmsYn2;
    }


    public String getDlvyPrmsYn3() {

        return dlvyPrmsYn3;
    }


    public void setDlvyPrmsYn3(String dlvyPrmsYn3) {

        this.dlvyPrmsYn3 = dlvyPrmsYn3;
    }


    public String getDlvyPrmsYn4() {

        return dlvyPrmsYn4;
    }


    public void setDlvyPrmsYn4(String dlvyPrmsYn4) {

        this.dlvyPrmsYn4 = dlvyPrmsYn4;
    }


    public String getDlvyPrmsYn5() {

        return dlvyPrmsYn5;
    }


    public void setDlvyPrmsYn5(String dlvyPrmsYn5) {

        this.dlvyPrmsYn5 = dlvyPrmsYn5;
    }


    public String getSpSaleAmt() {

        return spSaleAmt;
    }


    public void setSpSaleAmt(String spSaleAmt) {

        this.spSaleAmt = spSaleAmt;
    }


    public String getEstablePayGu() {

        return establePayGu;
    }


    public void setEstablePayGu(String establePayGu) {

        this.establePayGu = establePayGu;
    }


    public String getConsignAmt() {

        return consignAmt;
    }


    public void setConsignAmt(String consignAmt) {

        this.consignAmt = consignAmt;
    }


    public String getFinaAmt() {

        return finaAmt;
    }


    public void setFinaAmt(String finaAmt) {

        this.finaAmt = finaAmt;
    }


    public String getConsignCd() {

        return consignCd;
    }


    public void setConsignCd(String consignCd) {

        this.consignCd = consignCd;
    }


    public String getEstablePayRate() {

        return establePayRate;
    }


    public void setEstablePayRate(String establePayRate) {

        this.establePayRate = establePayRate;
    }


    public String getGuaranteeAmt() {

        return guaranteeAmt;
    }


    public void setGuaranteeAmt(String guaranteeAmt) {

        this.guaranteeAmt = guaranteeAmt;
    }


    public String getEstableAmt() {

        return estableAmt;
    }


    public void setEstableAmt(String estableAmt) {

        this.estableAmt = estableAmt;
    }


    public String getSaleTypeCd() {

        return saleTypeCd;
    }


    public void setSaleTypeCd(String saleTypeCd) {

        this.saleTypeCd = saleTypeCd;
    }


    public String getOptionCd() {

        return optionCd;
    }


    public void setOptionCd(String optionCd) {

        this.optionCd = optionCd;
    }


    public String getOptionAmt() {

        return optionAmt;
    }


    public void setOptionAmt(String optionAmt) {

        this.optionAmt = optionAmt;
    }


    public String getAllotmentEnd() {

        return allotmentEnd;
    }


    public void setAllotmentEnd(String allotmentEnd) {

        this.allotmentEnd = allotmentEnd;
    }


    public String getGuaranteeRate() {

        return guaranteeRate;
    }


    public void setGuaranteeRate(String guaranteeRate) {

        this.guaranteeRate = guaranteeRate;
    }


    public String getNewIjaRate() {

        return newIjaRate;
    }


    public void setNewIjaRate(String newIjaRate) {

        this.newIjaRate = newIjaRate;
    }


    public String getSalesPromotionCd() {

        return salesPromotionCd;
    }


    public void setSalesPromotionCd(String salesPromotionCd) {

        this.salesPromotionCd = salesPromotionCd;
    }


    public String getGraceAmt1() {

        return graceAmt1;
    }


    public void setGraceAmt1(String graceAmt1) {

        this.graceAmt1 = graceAmt1;
    }


    public String getGraceIjaRate1() {

        return graceIjaRate1;
    }


    public void setGraceIjaRate1(String graceIjaRate1) {

        this.graceIjaRate1 = graceIjaRate1;
    }


    public String getGraceCompRate1() {

        return graceCompRate1;
    }


    public void setGraceCompRate1(String graceCompRate1) {

        this.graceCompRate1 = graceCompRate1;
    }


    public String getCarNo() {

        return carNo;
    }


    public void setCarNo(String carNo) {

        this.carNo = carNo;
    }


    public String getContCnt() {

        return contCnt;
    }


    public void setContCnt(String contCnt) {

        this.contCnt = contCnt;
    }


    public String getCancelCnt() {

        return cancelCnt;
    }


    public void setCancelCnt(String cancelCnt) {

        this.cancelCnt = cancelCnt;
    }


    public String getSelfIjaAmt() {

        return selfIjaAmt;
    }


    public void setSelfIjaAmt(String selfIjaAmt) {

        this.selfIjaAmt = selfIjaAmt;
    }


    public String getBankIjaAmt() {

        return bankIjaAmt;
    }


    public void setBankIjaAmt(String bankIjaAmt) {

        this.bankIjaAmt = bankIjaAmt;
    }


    public String getCarSaleAmt() {

        return carSaleAmt;
    }


    public void setCarSaleAmt(String carSaleAmt) {

        this.carSaleAmt = carSaleAmt;
    }


    public String getColorAmt() {

        return colorAmt;
    }


    public void setColorAmt(String colorAmt) {

        this.colorAmt = colorAmt;
    }


    public String getBuyTypeCd() {

        return buyTypeCd;
    }


    public void setBuyTypeCd(String buyTypeCd) {

        this.buyTypeCd = buyTypeCd;
    }


    public String getUseTypeCd() {

        return useTypeCd;
    }


    public void setUseTypeCd(String useTypeCd) {

        this.useTypeCd = useTypeCd;
    }


    public String getHandPersonCd() {

        return handPersonCd;
    }


    public void setHandPersonCd(String handPersonCd) {

        this.handPersonCd = handPersonCd;
    }


    public String getRemark() {

        return remark;
    }


    public void setRemark(String remark) {

        this.remark = remark;
    }


    public String getTukTp() {

        return tukTp;
    }


    public void setTukTp(String tukTp) {

        this.tukTp = tukTp;
    }


    public String getVatTp() {

        return vatTp;
    }


    public void setVatTp(String vatTp) {

        this.vatTp = vatTp;
    }


    public String getTukAmt() {

        return tukAmt;
    }


    public void setTukAmt(String tukAmt) {

        this.tukAmt = tukAmt;
    }


    public String getEdkAmt() {

        return edkAmt;
    }


    public void setEdkAmt(String edkAmt) {

        this.edkAmt = edkAmt;
    }


    public String getVatAmt() {

        return vatAmt;
    }


    public void setVatAmt(String vatAmt) {

        this.vatAmt = vatAmt;
    }


    public String getAssignBasisDate() {

        return assignBasisDate;
    }


    public void setAssignBasisDate(String assignBasisDate) {

        this.assignBasisDate = assignBasisDate;
    }


    public String getRegDate() {

        return regDate;
    }


    public void setRegDate(String regDate) {

        this.regDate = regDate;
    }


    public String getUpdtDate() {

        return updtDate;
    }


    public void setUpdtDate(String updtDate) {

        this.updtDate = updtDate;
    }


    public String getUpdtUserCd() {

        return updtUserCd;
    }


    public void setUpdtUserCd(String updtUserCd) {

        this.updtUserCd = updtUserCd;
    }


    public String getJuminPostCd() {

        return juminPostCd;
    }


    public void setJuminPostCd(String juminPostCd) {

        this.juminPostCd = juminPostCd;
    }


    public String getJuminPostAddr() {

        return juminPostAddr;
    }


    public void setJuminPostAddr(String juminPostAddr) {

        this.juminPostAddr = juminPostAddr;
    }


    public String getChassisNo() {

        return chassisNo;
    }


    public void setChassisNo(String chassisNo) {

        this.chassisNo = chassisNo;
    }


    public String getExpectDt() {

        return expectDt;
    }


    public void setExpectDt(String expectDt) {

        this.expectDt = expectDt;
    }


    public String getFleetCustMk() {

        return fleetCustMk;
    }


    public void setFleetCustMk(String fleetCustMk) {

        this.fleetCustMk = fleetCustMk;
    }


    public String getOutPlaceType() {

        return outPlaceType;
    }


    public void setOutPlaceType(String outPlaceType) {

        this.outPlaceType = outPlaceType;
    }


    public String getOutToArea() {

        return outToArea;
    }


    public void setOutToArea(String outToArea) {

        this.outToArea = outToArea;
    }


    public String getTransAmt() {

        return transAmt;
    }


    public void setTransAmt(String transAmt) {

        this.transAmt = transAmt;
    }


    public String getOutPlaceAmt() {

        return outPlaceAmt;
    }


    public void setOutPlaceAmt(String outPlaceAmt) {

        this.outPlaceAmt = outPlaceAmt;
    }


    public String getTrustCd() {

        return trustCd;
    }


    public void setTrustCd(String trustCd) {

        this.trustCd = trustCd;
    }


    public String getSpecialDcAmt() {

        return specialDcAmt;
    }


    public void setSpecialDcAmt(String specialDcAmt) {

        this.specialDcAmt = specialDcAmt;
    }


    public String getOnceDcAmt() {

        return onceDcAmt;
    }


    public void setOnceDcAmt(String onceDcAmt) {

        this.onceDcAmt = onceDcAmt;
    }


    public String getEmpDcAmt() {

        return empDcAmt;
    }


    public void setEmpDcAmt(String empDcAmt) {

        this.empDcAmt = empDcAmt;
    }


    public String getFlawDcAmt() {

        return flawDcAmt;
    }


    public void setFlawDcAmt(String flawDcAmt) {

        this.flawDcAmt = flawDcAmt;
    }


    public String getLongDcAmt() {

        return longDcAmt;
    }


    public void setLongDcAmt(String longDcAmt) {

        this.longDcAmt = longDcAmt;
    }


    public String getDisplayDcAmt() {

        return displayDcAmt;
    }


    public void setDisplayDcAmt(String displayDcAmt) {

        this.displayDcAmt = displayDcAmt;
    }


    public String getFleetDcAmt() {

        return fleetDcAmt;
    }


    public void setFleetDcAmt(String fleetDcAmt) {

        this.fleetDcAmt = fleetDcAmt;
    }


    public String getCampaignDcAmt() {

        return campaignDcAmt;
    }


    public void setCampaignDcAmt(String campaignDcAmt) {

        this.campaignDcAmt = campaignDcAmt;
    }


    public String getProDcAmt() {

        return proDcAmt;
    }


    public void setProDcAmt(String proDcAmt) {

        this.proDcAmt = proDcAmt;
    }


    public String getAddDcAmt() {

        return addDcAmt;
    }


    public void setAddDcAmt(String addDcAmt) {

        this.addDcAmt = addDcAmt;
    }


    public String getCardDcAmt() {

        return cardDcAmt;
    }


    public void setCardDcAmt(String cardDcAmt) {

        this.cardDcAmt = cardDcAmt;
    }


    public String getAutoDcAmt() {

        return autoDcAmt;
    }


    public void setAutoDcAmt(String autoDcAmt) {

        this.autoDcAmt = autoDcAmt;
    }


    public String getEtcDcAmt() {

        return etcDcAmt;
    }


    public void setEtcDcAmt(String etcDcAmt) {

        this.etcDcAmt = etcDcAmt;
    }


    public String getPayCd() {

        return payCd;
    }


    public void setPayCd(String payCd) {

        this.payCd = payCd;
    }


    public String getCapitalCd() {

        return capitalCd;
    }


    public void setCapitalCd(String capitalCd) {

        this.capitalCd = capitalCd;
    }


    public String getBeginAcceptDt() {

        return beginAcceptDt;
    }


    public void setBeginAcceptDt(String beginAcceptDt) {

        this.beginAcceptDt = beginAcceptDt;
    }


    public String getPayKeepTerm() {

        return payKeepTerm;
    }


    public void setPayKeepTerm(String payKeepTerm) {

        this.payKeepTerm = payKeepTerm;
    }


    public String getPayKeepRate() {

        return payKeepRate;
    }


    public void setPayKeepRate(String payKeepRate) {

        this.payKeepRate = payKeepRate;
    }


    public String getDelayTerm() {

        return delayTerm;
    }


    public void setDelayTerm(String delayTerm) {

        this.delayTerm = delayTerm;
    }


    public String getDelayRate() {

        return delayRate;
    }


    public void setDelayRate(String delayRate) {

        this.delayRate = delayRate;
    }


    public String getDelayUseRate() {

        return delayUseRate;
    }


    public void setDelayUseRate(String delayUseRate) {

        this.delayUseRate = delayUseRate;
    }


    public String getPayType() {

        return payType;
    }


    public void setPayType(String payType) {

        this.payType = payType;
    }


    public String getPayUseGrade() {

        return payUseGrade;
    }


    public void setPayUseGrade(String payUseGrade) {

        this.payUseGrade = payUseGrade;
    }


    public String getOfftaxStat() {

        return offtaxStat;
    }


    public void setOfftaxStat(String offtaxStat) {

        this.offtaxStat = offtaxStat;
    }


    public String getOfftaxApprDttm() {

        return offtaxApprDttm;
    }


    public void setOfftaxApprDttm(String offtaxApprDttm) {

        this.offtaxApprDttm = offtaxApprDttm;
    }


    public String getOfftaxUserCd() {

        return offtaxUserCd;
    }


    public void setOfftaxUserCd(String offtaxUserCd) {

        this.offtaxUserCd = offtaxUserCd;
    }


    public String getReductCd() {

        return reductCd;
    }


    public void setReductCd(String reductCd) {

        this.reductCd = reductCd;
    }


    public String getReductTukAmt() {

        return reductTukAmt;
    }


    public void setReductTukAmt(String reductTukAmt) {

        this.reductTukAmt = reductTukAmt;
    }


    public String getReductTukRate() {

        return reductTukRate;
    }


    public void setReductTukRate(String reductTukRate) {

        this.reductTukRate = reductTukRate;
    }


    public String getApprDt() {

        return apprDt;
    }


    public void setApprDt(String apprDt) {

        this.apprDt = apprDt;
    }


    public String getApprSeq() {

        return apprSeq;
    }


    public void setApprSeq(String apprSeq) {

        this.apprSeq = apprSeq;
    }


    public String getContractStatus() {

        return contractStatus;
    }


    public void setContractStatus(String contractStatus) {

        this.contractStatus = contractStatus;
    }


    public String getRegUserCd() {

        return regUserCd;
    }


    public void setRegUserCd(String regUserCd) {

        this.regUserCd = regUserCd;
    }


    public String getReceiptNo() {

        return receiptNo;
    }


    public void setReceiptNo(String receiptNo) {

        this.receiptNo = receiptNo;
    }


    public String getReceiptStat() {

        return receiptStat;
    }


    public void setReceiptStat(String receiptStat) {

        this.receiptStat = receiptStat;
    }


    public String getReceiptApprDttm() {

        return receiptApprDttm;
    }


    public void setReceiptApprDttm(String receiptApprDttm) {

        this.receiptApprDttm = receiptApprDttm;
    }


    public String getReceiptApprNo() {

        return receiptApprNo;
    }


    public void setReceiptApprNo(String receiptApprNo) {

        this.receiptApprNo = receiptApprNo;
    }


    public String getHandPhoneNo() {

        return handPhoneNo;
    }


    public void setHandPhoneNo(String handPhoneNo) {

        this.handPhoneNo = handPhoneNo;
    }


    public String getPayStatus() {

        return payStatus;
    }


    public void setPayStatus(String payStatus) {

        this.payStatus = payStatus;
    }


    public String getPayApprDttm() {

        return payApprDttm;
    }


    public void setPayApprDttm(String payApprDttm) {

        this.payApprDttm = payApprDttm;
    }


    public String getPayApprNo() {

        return payApprNo;
    }


    public void setPayApprNo(String payApprNo) {

        this.payApprNo = payApprNo;
    }


    public String getBefSignoffDt() {

        return befSignoffDt;
    }


    public void setBefSignoffDt(String befSignoffDt) {

        this.befSignoffDt = befSignoffDt;
    }


    public String getBefChassisNo() {

        return befChassisNo;
    }


    public void setBefChassisNo(String befChassisNo) {

        this.befChassisNo = befChassisNo;
    }


    public String getRemark2() {

        return remark2;
    }


    public void setRemark2(String remark2) {

        this.remark2 = remark2;
    }


    public String getPayCrdtRate() {

        return payCrdtRate;
    }


    public void setPayCrdtRate(String payCrdtRate) {

        this.payCrdtRate = payCrdtRate;
    }


    public String getStockAmt() {

        return stockAmt;
    }


    public void setStockAmt(String stockAmt) {

        this.stockAmt = stockAmt;
    }


    public String getContractNoO() {

        return contractNoO;
    }


    public void setContractNoO(String contractNoO) {

        this.contractNoO = contractNoO;
    }


    public String getEmail() {

        return email;
    }


    public void setEmail(String email) {

        this.email = email;
    }


    public String getOldCarPlan() {

        return oldCarPlan;
    }


    public void setOldCarPlan(String oldCarPlan) {

        this.oldCarPlan = oldCarPlan;
    }


    public String getOldCarMaker() {

        return oldCarMaker;
    }


    public void setOldCarMaker(String oldCarMaker) {

        this.oldCarMaker = oldCarMaker;
    }


    public String getOldCarModel() {

        return oldCarModel;
    }


    public void setOldCarModel(String oldCarModel) {

        this.oldCarModel = oldCarModel;
    }


    public String getOldCarMy() {

        return oldCarMy;
    }


    public void setOldCarMy(String oldCarMy) {

        this.oldCarMy = oldCarMy;
    }


    public String getResidentPostRegNo() {

        return residentPostRegNo;
    }


    public void setResidentPostRegNo(String residentPostRegNo) {

        this.residentPostRegNo = residentPostRegNo;
    }


    public String getBusinessPostRegNo() {

        return businessPostRegNo;
    }


    public void setBusinessPostRegNo(String businessPostRegNo) {

        this.businessPostRegNo = businessPostRegNo;
    }


    public String getJuminPostRegNo() {

        return juminPostRegNo;
    }


    public void setJuminPostRegNo(String juminPostRegNo) {

        this.juminPostRegNo = juminPostRegNo;
    }


    public String getSalesModlCd() {

        return salesModlCd;
    }


    public void setSalesModlCd(String salesModlCd) {

        this.salesModlCd = salesModlCd;
    }


    public String getIndoDt() {

        return indoDt;
    }


    public void setIndoDt(String indoDt) {

        this.indoDt = indoDt;
    }


    public String getEwItemCd() {

        return ewItemCd;
    }


    public void setEwItemCd(String ewItemCd) {

        this.ewItemCd = ewItemCd;
    }


    public String getEwItemAmt() {

        return ewItemAmt;
    }


    public void setEwItemAmt(String ewItemAmt) {

        this.ewItemAmt = ewItemAmt;
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
