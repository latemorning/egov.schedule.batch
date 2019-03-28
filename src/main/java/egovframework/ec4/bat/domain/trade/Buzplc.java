package egovframework.ec4.bat.domain.trade;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IH_BUZPLC")
public class Buzplc {

    private String dealerCd = "";
    private String brchCd = "";
    private String brchNm = "";
    private String brchTel = "";
    private String brchFax = "";
    private String brchPost = "";
    private String brchAddr = "";
    private String brchBank = "";
    private String brchBankNm = "";
    private String brchCenter = "";
    private String brchBankNo = "";
    private String brchCapacity = "";
    private String brchOpenDt = "";
    private String brchCloseDt = "";
    private String brchChairNo = "";
    private String brchRentCode = "";
    private String brchJuminNo = "";
    private String brchSaNo = "";
    private String brchAsControl = "";
    private String brchOutControl = "";
    private String brchAsgnControl = "";
    private String brchTranDt = "";
    private String brchDepositor = "";
    private String brchBankI = "";
    private String brchBankNmI = "";
    private String brchBankNoI = "";
    private String brchDepositorI = "";
    private String brchDriveControl = "";
    private String brchAcctList = "";
    private String brchOutStop = "";
    private String brchCardControl = "";
    private String brchType = "";
    private String updtUserCd = "";
    private String regDate = "";
    private String updtDate = "";
    private String brchEmpNm = "";
    private String brchEmpTel = "";
    private String brchEmpHp = "";
    private String brchBusinessType = "";
    private String brchIndustryType = "";
    private String brchSortId = "";
    private String brchBusinessNm = "";
    private String etaxEmail = "";
    private String sizeFlag = "";
    private String siGunFlag = "";
    private String showroomStrtDt = "";
    private String showroomEndDt = "";
    private String brchPostRegNo = "";
    private String brchParkingCmt = "";
    private String zoneCd = "";
    private String districtCd = "";
    private String histRegistDe = "";
    private String actionCode = "";


    public Buzplc() {
    }


    public Buzplc(String dealerCd, String brchCd, String brchNm, String brchTel, String brchFax, String brchPost, String brchAddr, String brchBank,
            String brchBankNm, String brchCenter, String brchBankNo, String brchCapacity, String brchOpenDt, String brchCloseDt, String brchChairNo,
            String brchRentCode, String brchJuminNo, String brchSaNo, String brchAsControl, String brchOutControl, String brchAsgnControl, String brchTranDt,
            String brchDepositor, String brchBankI, String brchBankNmI, String brchBankNoI, String brchDepositorI, String brchDriveControl, String brchAcctList,
            String brchOutStop, String brchCardControl, String brchType, String updtUserCd, String regDate, String updtDate, String brchEmpNm,
            String brchEmpTel, String brchEmpHp, String brchBusinessType, String brchIndustryType, String brchSortId, String brchBusinessNm, String etaxEmail,
            String sizeFlag, String siGunFlag, String showroomStrtDt, String showroomEndDt, String brchPostRegNo, String brchParkingCmt, String zoneCd,
            String districtCd, String histRegistDe, String actionCode) {
        super();
        this.dealerCd = dealerCd;
        this.brchCd = brchCd;
        this.brchNm = brchNm;
        this.brchTel = brchTel;
        this.brchFax = brchFax;
        this.brchPost = brchPost;
        this.brchAddr = brchAddr;
        this.brchBank = brchBank;
        this.brchBankNm = brchBankNm;
        this.brchCenter = brchCenter;
        this.brchBankNo = brchBankNo;
        this.brchCapacity = brchCapacity;
        this.brchOpenDt = brchOpenDt;
        this.brchCloseDt = brchCloseDt;
        this.brchChairNo = brchChairNo;
        this.brchRentCode = brchRentCode;
        this.brchJuminNo = brchJuminNo;
        this.brchSaNo = brchSaNo;
        this.brchAsControl = brchAsControl;
        this.brchOutControl = brchOutControl;
        this.brchAsgnControl = brchAsgnControl;
        this.brchTranDt = brchTranDt;
        this.brchDepositor = brchDepositor;
        this.brchBankI = brchBankI;
        this.brchBankNmI = brchBankNmI;
        this.brchBankNoI = brchBankNoI;
        this.brchDepositorI = brchDepositorI;
        this.brchDriveControl = brchDriveControl;
        this.brchAcctList = brchAcctList;
        this.brchOutStop = brchOutStop;
        this.brchCardControl = brchCardControl;
        this.brchType = brchType;
        this.updtUserCd = updtUserCd;
        this.regDate = regDate;
        this.updtDate = updtDate;
        this.brchEmpNm = brchEmpNm;
        this.brchEmpTel = brchEmpTel;
        this.brchEmpHp = brchEmpHp;
        this.brchBusinessType = brchBusinessType;
        this.brchIndustryType = brchIndustryType;
        this.brchSortId = brchSortId;
        this.brchBusinessNm = brchBusinessNm;
        this.etaxEmail = etaxEmail;
        this.sizeFlag = sizeFlag;
        this.siGunFlag = siGunFlag;
        this.showroomStrtDt = showroomStrtDt;
        this.showroomEndDt = showroomEndDt;
        this.brchPostRegNo = brchPostRegNo;
        this.brchParkingCmt = brchParkingCmt;
        this.zoneCd = zoneCd;
        this.districtCd = districtCd;
        this.histRegistDe = histRegistDe;
        this.actionCode = actionCode;
    }


    @Override
    public String toString() {

        return "Buzplc [dealerCd=" + dealerCd + ", brchCd=" + brchCd + ", brchNm=" + brchNm + ", brchTel=" + brchTel + ", brchFax=" + brchFax + ", brchPost="
                + brchPost + ", brchAddr=" + brchAddr + ", brchBank=" + brchBank + ", brchBankNm=" + brchBankNm + ", brchCenter=" + brchCenter + ", brchBankNo="
                + brchBankNo + ", brchCapacity=" + brchCapacity + ", brchOpenDt=" + brchOpenDt + ", brchCloseDt=" + brchCloseDt + ", brchChairNo=" + brchChairNo
                + ", brchRentCode=" + brchRentCode + ", brchJuminNo=" + brchJuminNo + ", brchSaNo=" + brchSaNo + ", brchAsControl=" + brchAsControl
                + ", brchOutControl=" + brchOutControl + ", brchAsgnControl=" + brchAsgnControl + ", brchTranDt=" + brchTranDt + ", brchDepositor="
                + brchDepositor + ", brchBankI=" + brchBankI + ", brchBankNmI=" + brchBankNmI + ", brchBankNoI=" + brchBankNoI + ", brchDepositorI="
                + brchDepositorI + ", brchDriveControl=" + brchDriveControl + ", brchAcctList=" + brchAcctList + ", brchOutStop=" + brchOutStop
                + ", brchCardControl=" + brchCardControl + ", brchType=" + brchType + ", updtUserCd=" + updtUserCd + ", regDate=" + regDate + ", updtDate="
                + updtDate + ", brchEmpNm=" + brchEmpNm + ", brchEmpTel=" + brchEmpTel + ", brchEmpHp=" + brchEmpHp + ", brchBusinessType=" + brchBusinessType
                + ", brchIndustryType=" + brchIndustryType + ", brchSortId=" + brchSortId + ", brchBusinessNm=" + brchBusinessNm + ", etaxEmail=" + etaxEmail
                + ", sizeFlag=" + sizeFlag + ", siGunFlag=" + siGunFlag + ", showroomStrtDt=" + showroomStrtDt + ", showroomEndDt=" + showroomEndDt
                + ", brchPostRegNo=" + brchPostRegNo + ", brchParkingCmt=" + brchParkingCmt + ", zoneCd=" + zoneCd + ", districtCd=" + districtCd
                + ", histRegistDe=" + histRegistDe + ", actionCode=" + actionCode + "]";
    }


    public String getDealerCd() {

        return dealerCd;
    }


    public void setDealerCd(String dealerCd) {

        this.dealerCd = dealerCd;
    }


    public String getBrchCd() {

        return brchCd;
    }


    public void setBrchCd(String brchCd) {

        this.brchCd = brchCd;
    }


    public String getBrchNm() {

        return brchNm;
    }


    public void setBrchNm(String brchNm) {

        this.brchNm = brchNm;
    }


    public String getBrchTel() {

        return brchTel;
    }


    public void setBrchTel(String brchTel) {

        this.brchTel = brchTel;
    }


    public String getBrchFax() {

        return brchFax;
    }


    public void setBrchFax(String brchFax) {

        this.brchFax = brchFax;
    }


    public String getBrchPost() {

        return brchPost;
    }


    public void setBrchPost(String brchPost) {

        this.brchPost = brchPost;
    }


    public String getBrchAddr() {

        return brchAddr;
    }


    public void setBrchAddr(String brchAddr) {

        this.brchAddr = brchAddr;
    }


    public String getBrchBank() {

        return brchBank;
    }


    public void setBrchBank(String brchBank) {

        this.brchBank = brchBank;
    }


    public String getBrchBankNm() {

        return brchBankNm;
    }


    public void setBrchBankNm(String brchBankNm) {

        this.brchBankNm = brchBankNm;
    }


    public String getBrchCenter() {

        return brchCenter;
    }


    public void setBrchCenter(String brchCenter) {

        this.brchCenter = brchCenter;
    }


    public String getBrchBankNo() {

        return brchBankNo;
    }


    public void setBrchBankNo(String brchBankNo) {

        this.brchBankNo = brchBankNo;
    }


    public String getBrchCapacity() {

        return brchCapacity;
    }


    public void setBrchCapacity(String brchCapacity) {

        this.brchCapacity = brchCapacity;
    }


    public String getBrchOpenDt() {

        return brchOpenDt;
    }


    public void setBrchOpenDt(String brchOpenDt) {

        this.brchOpenDt = brchOpenDt;
    }


    public String getBrchCloseDt() {

        return brchCloseDt;
    }


    public void setBrchCloseDt(String brchCloseDt) {

        this.brchCloseDt = brchCloseDt;
    }


    public String getBrchChairNo() {

        return brchChairNo;
    }


    public void setBrchChairNo(String brchChairNo) {

        this.brchChairNo = brchChairNo;
    }


    public String getBrchRentCode() {

        return brchRentCode;
    }


    public void setBrchRentCode(String brchRentCode) {

        this.brchRentCode = brchRentCode;
    }


    public String getBrchJuminNo() {

        return brchJuminNo;
    }


    public void setBrchJuminNo(String brchJuminNo) {

        this.brchJuminNo = brchJuminNo;
    }


    public String getBrchSaNo() {

        return brchSaNo;
    }


    public void setBrchSaNo(String brchSaNo) {

        this.brchSaNo = brchSaNo;
    }


    public String getBrchAsControl() {

        return brchAsControl;
    }


    public void setBrchAsControl(String brchAsControl) {

        this.brchAsControl = brchAsControl;
    }


    public String getBrchOutControl() {

        return brchOutControl;
    }


    public void setBrchOutControl(String brchOutControl) {

        this.brchOutControl = brchOutControl;
    }


    public String getBrchAsgnControl() {

        return brchAsgnControl;
    }


    public void setBrchAsgnControl(String brchAsgnControl) {

        this.brchAsgnControl = brchAsgnControl;
    }


    public String getBrchTranDt() {

        return brchTranDt;
    }


    public void setBrchTranDt(String brchTranDt) {

        this.brchTranDt = brchTranDt;
    }


    public String getBrchDepositor() {

        return brchDepositor;
    }


    public void setBrchDepositor(String brchDepositor) {

        this.brchDepositor = brchDepositor;
    }


    public String getBrchBankI() {

        return brchBankI;
    }


    public void setBrchBankI(String brchBankI) {

        this.brchBankI = brchBankI;
    }


    public String getBrchBankNmI() {

        return brchBankNmI;
    }


    public void setBrchBankNmI(String brchBankNmI) {

        this.brchBankNmI = brchBankNmI;
    }


    public String getBrchBankNoI() {

        return brchBankNoI;
    }


    public void setBrchBankNoI(String brchBankNoI) {

        this.brchBankNoI = brchBankNoI;
    }


    public String getBrchDepositorI() {

        return brchDepositorI;
    }


    public void setBrchDepositorI(String brchDepositorI) {

        this.brchDepositorI = brchDepositorI;
    }


    public String getBrchDriveControl() {

        return brchDriveControl;
    }


    public void setBrchDriveControl(String brchDriveControl) {

        this.brchDriveControl = brchDriveControl;
    }


    public String getBrchAcctList() {

        return brchAcctList;
    }


    public void setBrchAcctList(String brchAcctList) {

        this.brchAcctList = brchAcctList;
    }


    public String getBrchOutStop() {

        return brchOutStop;
    }


    public void setBrchOutStop(String brchOutStop) {

        this.brchOutStop = brchOutStop;
    }


    public String getBrchCardControl() {

        return brchCardControl;
    }


    public void setBrchCardControl(String brchCardControl) {

        this.brchCardControl = brchCardControl;
    }


    public String getBrchType() {

        return brchType;
    }


    public void setBrchType(String brchType) {

        this.brchType = brchType;
    }


    public String getUpdtUserCd() {

        return updtUserCd;
    }


    public void setUpdtUserCd(String updtUserCd) {

        this.updtUserCd = updtUserCd;
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


    public String getBrchEmpNm() {

        return brchEmpNm;
    }


    public void setBrchEmpNm(String brchEmpNm) {

        this.brchEmpNm = brchEmpNm;
    }


    public String getBrchEmpTel() {

        return brchEmpTel;
    }


    public void setBrchEmpTel(String brchEmpTel) {

        this.brchEmpTel = brchEmpTel;
    }


    public String getBrchEmpHp() {

        return brchEmpHp;
    }


    public void setBrchEmpHp(String brchEmpHp) {

        this.brchEmpHp = brchEmpHp;
    }


    public String getBrchBusinessType() {

        return brchBusinessType;
    }


    public void setBrchBusinessType(String brchBusinessType) {

        this.brchBusinessType = brchBusinessType;
    }


    public String getBrchIndustryType() {

        return brchIndustryType;
    }


    public void setBrchIndustryType(String brchIndustryType) {

        this.brchIndustryType = brchIndustryType;
    }


    public String getBrchSortId() {

        return brchSortId;
    }


    public void setBrchSortId(String brchSortId) {

        this.brchSortId = brchSortId;
    }


    public String getBrchBusinessNm() {

        return brchBusinessNm;
    }


    public void setBrchBusinessNm(String brchBusinessNm) {

        this.brchBusinessNm = brchBusinessNm;
    }


    public String getEtaxEmail() {

        return etaxEmail;
    }


    public void setEtaxEmail(String etaxEmail) {

        this.etaxEmail = etaxEmail;
    }


    public String getSizeFlag() {

        return sizeFlag;
    }


    public void setSizeFlag(String sizeFlag) {

        this.sizeFlag = sizeFlag;
    }


    public String getSiGunFlag() {

        return siGunFlag;
    }


    public void setSiGunFlag(String siGunFlag) {

        this.siGunFlag = siGunFlag;
    }


    public String getShowroomStrtDt() {

        return showroomStrtDt;
    }


    public void setShowroomStrtDt(String showroomStrtDt) {

        this.showroomStrtDt = showroomStrtDt;
    }


    public String getShowroomEndDt() {

        return showroomEndDt;
    }


    public void setShowroomEndDt(String showroomEndDt) {

        this.showroomEndDt = showroomEndDt;
    }


    public String getBrchPostRegNo() {

        return brchPostRegNo;
    }


    public void setBrchPostRegNo(String brchPostRegNo) {

        this.brchPostRegNo = brchPostRegNo;
    }


    public String getBrchParkingCmt() {

        return brchParkingCmt;
    }


    public void setBrchParkingCmt(String brchParkingCmt) {

        this.brchParkingCmt = brchParkingCmt;
    }


    public String getZoneCd() {

        return zoneCd;
    }


    public void setZoneCd(String zoneCd) {

        this.zoneCd = zoneCd;
    }


    public String getDistrictCd() {

        return districtCd;
    }


    public void setDistrictCd(String districtCd) {

        this.districtCd = districtCd;
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
