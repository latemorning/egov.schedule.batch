package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_SALE_CAR")
public class SaleCar {

    private String vin = "";
    private String dealerCd = "";
    private String businessId = "";
    private String modelCd = "";
    private String specCd = "";
    private String outColorCd = "";
    private String inColorCd = "";
    private String compltDt = "";
    private String specSerial = "";
    private String statusCd = "";
    private String orderDealer = "";
    private String orderNo = "";
    private String carTypeNo = "";
    private String carGu = "";
    private String poNo = "";
    private String madeGu = "";
    private String prodStatus = "";
    private String trsSiteCd = "";
    private String trsReqDt = "";
    private String trsReqGu = "";
    private String trsRetDt = "";
    private String trsTm = "";
    private String siteCd = "";
    private String location = "";
    private String outGu = "";
    private String dcRate = "";
    private String statusChangeDt = "";
    private String statusChangeHt = "";
    private String a3BrchCd = "";
    private String a3ContNo = "";
    private String a3ConsignCd = "";
    private String a3Gub = "";
    private String a3Control = "";
    private String enginNo = "";
    private String siteInDt = "";
    private String trsReqrealDt = "";
    private String signoffDt = "";
    private String a3DisplayDt = "";
    private String assignGu = "";
    private String regDate = "";
    private String updtDate = "";
    private String updtUserCd = "";
    private String optionCd = "";
    private String event = "";
    private String eventStatus = "";
    private String eventUpdtDttm = "";
    private String eventUpdtDealer = "";
    private String eventUpdtUser = "";
    private String prodOrdrNo = "";
    private String ordrDt = "";
    private String prodAskDt = "";
    private String cmplRqstDt = "";
    private String cmplSchdDt = "";
    private String purcDt = "";
    private String orderType = "";
    private String hotSw = "";
    private String carType = "";
    private String bodyTypeCd = "";
    private String prefixCd = "";
    private String hndPlcCd = "";
    private String carKeyNo = "";
    private String dgreCd = "";
    private String ltrmCd = "";
    private String showCarCd = "";
    private String delvDt = "";
    private String salesCnclDiv = "";
    private String salesCnclDt = "";
    private String salesCnclCnt = "";
    private String gmDrResult = "";
    private String gmDrOrdrNo = "";
    private String gmDrApprDt = "";
    private String tradeDt = "";
    private String locationPrev = "";
    private String locationUpdtDttm = "";
    private String trsStartDt = "";
    private String consStartDt = "";
    private String gmDrWorkType = "";
    private String takeDt = "";
    private String defect = "";
    private String stockOpenYn = "";
    private String stockBaseDt = "";
    private String stockType = "";
    private String stockForce = "";
    private String drDealer = "";
    private String defectType = "";
    private String orgSignoffDt = "";
    private String salesModlCd = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public SaleCar() {
    }


    public SaleCar(String vin, String dealerCd, String businessId, String modelCd, String specCd, String outColorCd, String inColorCd, String compltDt,
            String specSerial, String statusCd, String orderDealer, String orderNo, String carTypeNo, String carGu, String poNo, String madeGu,
            String prodStatus, String trsSiteCd, String trsReqDt, String trsReqGu, String trsRetDt, String trsTm, String siteCd, String location, String outGu,
            String dcRate, String statusChangeDt, String statusChangeHt, String a3BrchCd, String a3ContNo, String a3ConsignCd, String a3Gub, String a3Control,
            String enginNo, String siteInDt, String trsReqrealDt, String signoffDt, String a3DisplayDt, String assignGu, String regDate, String updtDate,
            String updtUserCd, String optionCd, String event, String eventStatus, String eventUpdtDttm, String eventUpdtDealer, String eventUpdtUser,
            String prodOrdrNo, String ordrDt, String prodAskDt, String cmplRqstDt, String cmplSchdDt, String purcDt, String orderType, String hotSw,
            String carType, String bodyTypeCd, String prefixCd, String hndPlcCd, String carKeyNo, String dgreCd, String ltrmCd, String showCarCd, String delvDt,
            String salesCnclDiv, String salesCnclDt, String salesCnclCnt, String gmDrResult, String gmDrOrdrNo, String gmDrApprDt, String tradeDt,
            String locationPrev, String locationUpdtDttm, String trsStartDt, String consStartDt, String gmDrWorkType, String takeDt, String defect,
            String stockOpenYn, String stockBaseDt, String stockType, String stockForce, String drDealer, String defectType, String orgSignoffDt,
            String salesModlCd, String histRegistDe, String actionCode) {
        super();
        this.vin = vin;
        this.dealerCd = dealerCd;
        this.businessId = businessId;
        this.modelCd = modelCd;
        this.specCd = specCd;
        this.outColorCd = outColorCd;
        this.inColorCd = inColorCd;
        this.compltDt = compltDt;
        this.specSerial = specSerial;
        this.statusCd = statusCd;
        this.orderDealer = orderDealer;
        this.orderNo = orderNo;
        this.carTypeNo = carTypeNo;
        this.carGu = carGu;
        this.poNo = poNo;
        this.madeGu = madeGu;
        this.prodStatus = prodStatus;
        this.trsSiteCd = trsSiteCd;
        this.trsReqDt = trsReqDt;
        this.trsReqGu = trsReqGu;
        this.trsRetDt = trsRetDt;
        this.trsTm = trsTm;
        this.siteCd = siteCd;
        this.location = location;
        this.outGu = outGu;
        this.dcRate = dcRate;
        this.statusChangeDt = statusChangeDt;
        this.statusChangeHt = statusChangeHt;
        this.a3BrchCd = a3BrchCd;
        this.a3ContNo = a3ContNo;
        this.a3ConsignCd = a3ConsignCd;
        this.a3Gub = a3Gub;
        this.a3Control = a3Control;
        this.enginNo = enginNo;
        this.siteInDt = siteInDt;
        this.trsReqrealDt = trsReqrealDt;
        this.signoffDt = signoffDt;
        this.a3DisplayDt = a3DisplayDt;
        this.assignGu = assignGu;
        this.regDate = regDate;
        this.updtDate = updtDate;
        this.updtUserCd = updtUserCd;
        this.optionCd = optionCd;
        this.event = event;
        this.eventStatus = eventStatus;
        this.eventUpdtDttm = eventUpdtDttm;
        this.eventUpdtDealer = eventUpdtDealer;
        this.eventUpdtUser = eventUpdtUser;
        this.prodOrdrNo = prodOrdrNo;
        this.ordrDt = ordrDt;
        this.prodAskDt = prodAskDt;
        this.cmplRqstDt = cmplRqstDt;
        this.cmplSchdDt = cmplSchdDt;
        this.purcDt = purcDt;
        this.orderType = orderType;
        this.hotSw = hotSw;
        this.carType = carType;
        this.bodyTypeCd = bodyTypeCd;
        this.prefixCd = prefixCd;
        this.hndPlcCd = hndPlcCd;
        this.carKeyNo = carKeyNo;
        this.dgreCd = dgreCd;
        this.ltrmCd = ltrmCd;
        this.showCarCd = showCarCd;
        this.delvDt = delvDt;
        this.salesCnclDiv = salesCnclDiv;
        this.salesCnclDt = salesCnclDt;
        this.salesCnclCnt = salesCnclCnt;
        this.gmDrResult = gmDrResult;
        this.gmDrOrdrNo = gmDrOrdrNo;
        this.gmDrApprDt = gmDrApprDt;
        this.tradeDt = tradeDt;
        this.locationPrev = locationPrev;
        this.locationUpdtDttm = locationUpdtDttm;
        this.trsStartDt = trsStartDt;
        this.consStartDt = consStartDt;
        this.gmDrWorkType = gmDrWorkType;
        this.takeDt = takeDt;
        this.defect = defect;
        this.stockOpenYn = stockOpenYn;
        this.stockBaseDt = stockBaseDt;
        this.stockType = stockType;
        this.stockForce = stockForce;
        this.drDealer = drDealer;
        this.defectType = defectType;
        this.orgSignoffDt = orgSignoffDt;
        this.salesModlCd = salesModlCd;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "SaleCar [vin=" + vin + ", dealerCd=" + dealerCd + ", businessId=" + businessId + ", modelCd=" + modelCd + ", specCd=" + specCd + ", outColorCd="
                + outColorCd + ", inColorCd=" + inColorCd + ", compltDt=" + compltDt + ", specSerial=" + specSerial + ", statusCd=" + statusCd
                + ", orderDealer=" + orderDealer + ", orderNo=" + orderNo + ", carTypeNo=" + carTypeNo + ", carGu=" + carGu + ", poNo=" + poNo + ", madeGu="
                + madeGu + ", prodStatus=" + prodStatus + ", trsSiteCd=" + trsSiteCd + ", trsReqDt=" + trsReqDt + ", trsReqGu=" + trsReqGu + ", trsRetDt="
                + trsRetDt + ", trsTm=" + trsTm + ", siteCd=" + siteCd + ", location=" + location + ", outGu=" + outGu + ", dcRate=" + dcRate
                + ", statusChangeDt=" + statusChangeDt + ", statusChangeHt=" + statusChangeHt + ", a3BrchCd=" + a3BrchCd + ", a3ContNo=" + a3ContNo
                + ", a3ConsignCd=" + a3ConsignCd + ", a3Gub=" + a3Gub + ", a3Control=" + a3Control + ", enginNo=" + enginNo + ", siteInDt=" + siteInDt
                + ", trsReqrealDt=" + trsReqrealDt + ", signoffDt=" + signoffDt + ", a3DisplayDt=" + a3DisplayDt + ", assignGu=" + assignGu + ", regDate="
                + regDate + ", updtDate=" + updtDate + ", updtUserCd=" + updtUserCd + ", optionCd=" + optionCd + ", event=" + event + ", eventStatus="
                + eventStatus + ", eventUpdtDttm=" + eventUpdtDttm + ", eventUpdtDealer=" + eventUpdtDealer + ", eventUpdtUser=" + eventUpdtUser
                + ", prodOrdrNo=" + prodOrdrNo + ", ordrDt=" + ordrDt + ", prodAskDt=" + prodAskDt + ", cmplRqstDt=" + cmplRqstDt + ", cmplSchdDt=" + cmplSchdDt
                + ", purcDt=" + purcDt + ", orderType=" + orderType + ", hotSw=" + hotSw + ", carType=" + carType + ", bodyTypeCd=" + bodyTypeCd + ", prefixCd="
                + prefixCd + ", hndPlcCd=" + hndPlcCd + ", carKeyNo=" + carKeyNo + ", dgreCd=" + dgreCd + ", ltrmCd=" + ltrmCd + ", showCarCd=" + showCarCd
                + ", delvDt=" + delvDt + ", salesCnclDiv=" + salesCnclDiv + ", salesCnclDt=" + salesCnclDt + ", salesCnclCnt=" + salesCnclCnt + ", gmDrResult="
                + gmDrResult + ", gmDrOrdrNo=" + gmDrOrdrNo + ", gmDrApprDt=" + gmDrApprDt + ", tradeDt=" + tradeDt + ", locationPrev=" + locationPrev
                + ", locationUpdtDttm=" + locationUpdtDttm + ", trsStartDt=" + trsStartDt + ", consStartDt=" + consStartDt + ", gmDrWorkType=" + gmDrWorkType
                + ", takeDt=" + takeDt + ", defect=" + defect + ", stockOpenYn=" + stockOpenYn + ", stockBaseDt=" + stockBaseDt + ", stockType=" + stockType
                + ", stockForce=" + stockForce + ", drDealer=" + drDealer + ", defectType=" + defectType + ", orgSignoffDt=" + orgSignoffDt + ", salesModlCd="
                + salesModlCd + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getVin() {

        return vin;
    }


    public void setVin(String vin) {

        this.vin = vin;
    }


    public String getDealerCd() {

        return dealerCd;
    }


    public void setDealerCd(String dealerCd) {

        this.dealerCd = dealerCd;
    }


    public String getBusinessId() {

        return businessId;
    }


    public void setBusinessId(String businessId) {

        this.businessId = businessId;
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


    public String getOutColorCd() {

        return outColorCd;
    }


    public void setOutColorCd(String outColorCd) {

        this.outColorCd = outColorCd;
    }


    public String getInColorCd() {

        return inColorCd;
    }


    public void setInColorCd(String inColorCd) {

        this.inColorCd = inColorCd;
    }


    public String getCompltDt() {

        return compltDt;
    }


    public void setCompltDt(String compltDt) {

        this.compltDt = compltDt;
    }


    public String getSpecSerial() {

        return specSerial;
    }


    public void setSpecSerial(String specSerial) {

        this.specSerial = specSerial;
    }


    public String getStatusCd() {

        return statusCd;
    }


    public void setStatusCd(String statusCd) {

        this.statusCd = statusCd;
    }


    public String getOrderDealer() {

        return orderDealer;
    }


    public void setOrderDealer(String orderDealer) {

        this.orderDealer = orderDealer;
    }


    public String getOrderNo() {

        return orderNo;
    }


    public void setOrderNo(String orderNo) {

        this.orderNo = orderNo;
    }


    public String getCarTypeNo() {

        return carTypeNo;
    }


    public void setCarTypeNo(String carTypeNo) {

        this.carTypeNo = carTypeNo;
    }


    public String getCarGu() {

        return carGu;
    }


    public void setCarGu(String carGu) {

        this.carGu = carGu;
    }


    public String getPoNo() {

        return poNo;
    }


    public void setPoNo(String poNo) {

        this.poNo = poNo;
    }


    public String getMadeGu() {

        return madeGu;
    }


    public void setMadeGu(String madeGu) {

        this.madeGu = madeGu;
    }


    public String getProdStatus() {

        return prodStatus;
    }


    public void setProdStatus(String prodStatus) {

        this.prodStatus = prodStatus;
    }


    public String getTrsSiteCd() {

        return trsSiteCd;
    }


    public void setTrsSiteCd(String trsSiteCd) {

        this.trsSiteCd = trsSiteCd;
    }


    public String getTrsReqDt() {

        return trsReqDt;
    }


    public void setTrsReqDt(String trsReqDt) {

        this.trsReqDt = trsReqDt;
    }


    public String getTrsReqGu() {

        return trsReqGu;
    }


    public void setTrsReqGu(String trsReqGu) {

        this.trsReqGu = trsReqGu;
    }


    public String getTrsRetDt() {

        return trsRetDt;
    }


    public void setTrsRetDt(String trsRetDt) {

        this.trsRetDt = trsRetDt;
    }


    public String getTrsTm() {

        return trsTm;
    }


    public void setTrsTm(String trsTm) {

        this.trsTm = trsTm;
    }


    public String getSiteCd() {

        return siteCd;
    }


    public void setSiteCd(String siteCd) {

        this.siteCd = siteCd;
    }


    public String getLocation() {

        return location;
    }


    public void setLocation(String location) {

        this.location = location;
    }


    public String getOutGu() {

        return outGu;
    }


    public void setOutGu(String outGu) {

        this.outGu = outGu;
    }


    public String getDcRate() {

        return dcRate;
    }


    public void setDcRate(String dcRate) {

        this.dcRate = dcRate;
    }


    public String getStatusChangeDt() {

        return statusChangeDt;
    }


    public void setStatusChangeDt(String statusChangeDt) {

        this.statusChangeDt = statusChangeDt;
    }


    public String getStatusChangeHt() {

        return statusChangeHt;
    }


    public void setStatusChangeHt(String statusChangeHt) {

        this.statusChangeHt = statusChangeHt;
    }


    public String getA3BrchCd() {

        return a3BrchCd;
    }


    public void setA3BrchCd(String a3BrchCd) {

        this.a3BrchCd = a3BrchCd;
    }


    public String getA3ContNo() {

        return a3ContNo;
    }


    public void setA3ContNo(String a3ContNo) {

        this.a3ContNo = a3ContNo;
    }


    public String getA3ConsignCd() {

        return a3ConsignCd;
    }


    public void setA3ConsignCd(String a3ConsignCd) {

        this.a3ConsignCd = a3ConsignCd;
    }


    public String getA3Gub() {

        return a3Gub;
    }


    public void setA3Gub(String a3Gub) {

        this.a3Gub = a3Gub;
    }


    public String getA3Control() {

        return a3Control;
    }


    public void setA3Control(String a3Control) {

        this.a3Control = a3Control;
    }


    public String getEnginNo() {

        return enginNo;
    }


    public void setEnginNo(String enginNo) {

        this.enginNo = enginNo;
    }


    public String getSiteInDt() {

        return siteInDt;
    }


    public void setSiteInDt(String siteInDt) {

        this.siteInDt = siteInDt;
    }


    public String getTrsReqrealDt() {

        return trsReqrealDt;
    }


    public void setTrsReqrealDt(String trsReqrealDt) {

        this.trsReqrealDt = trsReqrealDt;
    }


    public String getSignoffDt() {

        return signoffDt;
    }


    public void setSignoffDt(String signoffDt) {

        this.signoffDt = signoffDt;
    }


    public String getA3DisplayDt() {

        return a3DisplayDt;
    }


    public void setA3DisplayDt(String a3DisplayDt) {

        this.a3DisplayDt = a3DisplayDt;
    }


    public String getAssignGu() {

        return assignGu;
    }


    public void setAssignGu(String assignGu) {

        this.assignGu = assignGu;
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


    public String getOptionCd() {

        return optionCd;
    }


    public void setOptionCd(String optionCd) {

        this.optionCd = optionCd;
    }


    public String getEvent() {

        return event;
    }


    public void setEvent(String event) {

        this.event = event;
    }


    public String getEventStatus() {

        return eventStatus;
    }


    public void setEventStatus(String eventStatus) {

        this.eventStatus = eventStatus;
    }


    public String getEventUpdtDttm() {

        return eventUpdtDttm;
    }


    public void setEventUpdtDttm(String eventUpdtDttm) {

        this.eventUpdtDttm = eventUpdtDttm;
    }


    public String getEventUpdtDealer() {

        return eventUpdtDealer;
    }


    public void setEventUpdtDealer(String eventUpdtDealer) {

        this.eventUpdtDealer = eventUpdtDealer;
    }


    public String getEventUpdtUser() {

        return eventUpdtUser;
    }


    public void setEventUpdtUser(String eventUpdtUser) {

        this.eventUpdtUser = eventUpdtUser;
    }


    public String getProdOrdrNo() {

        return prodOrdrNo;
    }


    public void setProdOrdrNo(String prodOrdrNo) {

        this.prodOrdrNo = prodOrdrNo;
    }


    public String getOrdrDt() {

        return ordrDt;
    }


    public void setOrdrDt(String ordrDt) {

        this.ordrDt = ordrDt;
    }


    public String getProdAskDt() {

        return prodAskDt;
    }


    public void setProdAskDt(String prodAskDt) {

        this.prodAskDt = prodAskDt;
    }


    public String getCmplRqstDt() {

        return cmplRqstDt;
    }


    public void setCmplRqstDt(String cmplRqstDt) {

        this.cmplRqstDt = cmplRqstDt;
    }


    public String getCmplSchdDt() {

        return cmplSchdDt;
    }


    public void setCmplSchdDt(String cmplSchdDt) {

        this.cmplSchdDt = cmplSchdDt;
    }


    public String getPurcDt() {

        return purcDt;
    }


    public void setPurcDt(String purcDt) {

        this.purcDt = purcDt;
    }


    public String getOrderType() {

        return orderType;
    }


    public void setOrderType(String orderType) {

        this.orderType = orderType;
    }


    public String getHotSw() {

        return hotSw;
    }


    public void setHotSw(String hotSw) {

        this.hotSw = hotSw;
    }


    public String getCarType() {

        return carType;
    }


    public void setCarType(String carType) {

        this.carType = carType;
    }


    public String getBodyTypeCd() {

        return bodyTypeCd;
    }


    public void setBodyTypeCd(String bodyTypeCd) {

        this.bodyTypeCd = bodyTypeCd;
    }


    public String getPrefixCd() {

        return prefixCd;
    }


    public void setPrefixCd(String prefixCd) {

        this.prefixCd = prefixCd;
    }


    public String getHndPlcCd() {

        return hndPlcCd;
    }


    public void setHndPlcCd(String hndPlcCd) {

        this.hndPlcCd = hndPlcCd;
    }


    public String getCarKeyNo() {

        return carKeyNo;
    }


    public void setCarKeyNo(String carKeyNo) {

        this.carKeyNo = carKeyNo;
    }


    public String getDgreCd() {

        return dgreCd;
    }


    public void setDgreCd(String dgreCd) {

        this.dgreCd = dgreCd;
    }


    public String getLtrmCd() {

        return ltrmCd;
    }


    public void setLtrmCd(String ltrmCd) {

        this.ltrmCd = ltrmCd;
    }


    public String getShowCarCd() {

        return showCarCd;
    }


    public void setShowCarCd(String showCarCd) {

        this.showCarCd = showCarCd;
    }


    public String getDelvDt() {

        return delvDt;
    }


    public void setDelvDt(String delvDt) {

        this.delvDt = delvDt;
    }


    public String getSalesCnclDiv() {

        return salesCnclDiv;
    }


    public void setSalesCnclDiv(String salesCnclDiv) {

        this.salesCnclDiv = salesCnclDiv;
    }


    public String getSalesCnclDt() {

        return salesCnclDt;
    }


    public void setSalesCnclDt(String salesCnclDt) {

        this.salesCnclDt = salesCnclDt;
    }


    public String getSalesCnclCnt() {

        return salesCnclCnt;
    }


    public void setSalesCnclCnt(String salesCnclCnt) {

        this.salesCnclCnt = salesCnclCnt;
    }


    public String getGmDrResult() {

        return gmDrResult;
    }


    public void setGmDrResult(String gmDrResult) {

        this.gmDrResult = gmDrResult;
    }


    public String getGmDrOrdrNo() {

        return gmDrOrdrNo;
    }


    public void setGmDrOrdrNo(String gmDrOrdrNo) {

        this.gmDrOrdrNo = gmDrOrdrNo;
    }


    public String getGmDrApprDt() {

        return gmDrApprDt;
    }


    public void setGmDrApprDt(String gmDrApprDt) {

        this.gmDrApprDt = gmDrApprDt;
    }


    public String getTradeDt() {

        return tradeDt;
    }


    public void setTradeDt(String tradeDt) {

        this.tradeDt = tradeDt;
    }


    public String getLocationPrev() {

        return locationPrev;
    }


    public void setLocationPrev(String locationPrev) {

        this.locationPrev = locationPrev;
    }


    public String getLocationUpdtDttm() {

        return locationUpdtDttm;
    }


    public void setLocationUpdtDttm(String locationUpdtDttm) {

        this.locationUpdtDttm = locationUpdtDttm;
    }


    public String getTrsStartDt() {

        return trsStartDt;
    }


    public void setTrsStartDt(String trsStartDt) {

        this.trsStartDt = trsStartDt;
    }


    public String getConsStartDt() {

        return consStartDt;
    }


    public void setConsStartDt(String consStartDt) {

        this.consStartDt = consStartDt;
    }


    public String getGmDrWorkType() {

        return gmDrWorkType;
    }


    public void setGmDrWorkType(String gmDrWorkType) {

        this.gmDrWorkType = gmDrWorkType;
    }


    public String getTakeDt() {

        return takeDt;
    }


    public void setTakeDt(String takeDt) {

        this.takeDt = takeDt;
    }


    public String getDefect() {

        return defect;
    }


    public void setDefect(String defect) {

        this.defect = defect;
    }


    public String getStockOpenYn() {

        return stockOpenYn;
    }


    public void setStockOpenYn(String stockOpenYn) {

        this.stockOpenYn = stockOpenYn;
    }


    public String getStockBaseDt() {

        return stockBaseDt;
    }


    public void setStockBaseDt(String stockBaseDt) {

        this.stockBaseDt = stockBaseDt;
    }


    public String getStockType() {

        return stockType;
    }


    public void setStockType(String stockType) {

        this.stockType = stockType;
    }


    public String getStockForce() {

        return stockForce;
    }


    public void setStockForce(String stockForce) {

        this.stockForce = stockForce;
    }


    public String getDrDealer() {

        return drDealer;
    }


    public void setDrDealer(String drDealer) {

        this.drDealer = drDealer;
    }


    public String getDefectType() {

        return defectType;
    }


    public void setDefectType(String defectType) {

        this.defectType = defectType;
    }


    public String getOrgSignoffDt() {

        return orgSignoffDt;
    }


    public void setOrgSignoffDt(String orgSignoffDt) {

        this.orgSignoffDt = orgSignoffDt;
    }


    public String getSalesModlCd() {

        return salesModlCd;
    }


    public void setSalesModlCd(String salesModlCd) {

        this.salesModlCd = salesModlCd;
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
