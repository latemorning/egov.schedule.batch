package egovframework.example.bat.domain.trade;

public class TestBatchCust {

    private String custNm = "";
    private String custId = "";
    private String custPass = "";
    private String custTel = "";


    public TestBatchCust() {

    }


    public TestBatchCust(String custNm, String custId, String custPass, String custTel) {
        super();
        this.custNm = custNm;
        this.custId = custId;
        this.custPass = custPass;
        this.custTel = custTel;
    }


    public String getCustNm() {

        return custNm;
    }


    public void setCustNm(String custNm) {

        this.custNm = custNm;
    }


    public String getCustId() {

        return custId;
    }


    public void setCustId(String custId) {

        this.custId = custId;
    }


    public String getCustPass() {

        return custPass;
    }


    public void setCustPass(String custPass) {

        this.custPass = custPass;
    }


    public String getCustTel() {

        return custTel;
    }


    public void setCustTel(String custTel) {

        this.custTel = custTel;
    }


    @Override
    public String toString() {

        return "TestBatchCust [custNm=" + custNm + ", custId=" + custId + ", custPass=" + custPass + ", custTel=" + custTel + "]";
    }

}
