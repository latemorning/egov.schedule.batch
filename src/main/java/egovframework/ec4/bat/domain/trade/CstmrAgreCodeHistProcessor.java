package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class CstmrAgreCodeHistProcessor implements ItemProcessor<CstmrAgreCode, CstmrAgreCode> {

    public CstmrAgreCodeHistProcessor() {
    }


    @Override
    public CstmrAgreCode process(CstmrAgreCode item) throws Exception {

        item.toString();

        return item;
    }

}