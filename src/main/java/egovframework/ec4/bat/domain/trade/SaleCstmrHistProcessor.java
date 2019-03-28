package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class SaleCstmrHistProcessor implements ItemProcessor<SaleCstmr, SaleCstmr> {

    public SaleCstmrHistProcessor() {
    }


    @Override
    public SaleCstmr process(SaleCstmr item) throws Exception {

        return item;
    }

}
