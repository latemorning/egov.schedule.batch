package egovframework.example.bat.domain.trade;

public class TestBatchUser {

    private String userNm = "";
    private String userId = "";
    private String userPass = "";
    private String telnum = "";


    public TestBatchUser() {

    }


    public TestBatchUser(String userNm, String userId, String userPass, String telnum) {
        super();
        this.userNm = userNm;
        this.userId = userId;
        this.userPass = userPass;
        this.telnum = telnum;
    }


    public String getUserNm() {

        return userNm;
    }


    public void setUserNm(String userNm) {

        this.userNm = userNm;
    }


    public String getUserId() {

        return userId;
    }


    public void setUserId(String userId) {

        this.userId = userId;
    }


    public String getUserPass() {

        return userPass;
    }


    public void setUserPass(String userPass) {

        this.userPass = userPass;
    }


    public String getTelnum() {

        return telnum;
    }


    public void setTelnum(String telnum) {

        this.telnum = telnum;
    }


    @Override
    public String toString() {

        return "TestBatchUser [userNm=" + userNm + ", userId=" + userId + ", userPass=" + userPass + ", telnum=" + telnum + "]";
    }

}
