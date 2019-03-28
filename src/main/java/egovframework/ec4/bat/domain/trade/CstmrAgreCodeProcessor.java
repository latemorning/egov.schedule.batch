package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class CstmrAgreCodeProcessor implements ItemProcessor<CstmrAgreCode, CstmrAgreCode> {

    public CstmrAgreCodeProcessor() {
    }


    @Override
    public CstmrAgreCode process(CstmrAgreCode item) throws Exception {

        item.toString();

        return item;
    }

}