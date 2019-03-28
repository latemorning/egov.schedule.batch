package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class SaleCstmrProcessor implements ItemProcessor<SaleCstmr, SaleCstmr> {

    public SaleCstmrProcessor() {
    }


    @Override
    public SaleCstmr process(SaleCstmr item) throws Exception {

        item.toString();

        return item;
    }

}
