package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class BycstmAgreProcessor implements ItemProcessor<BycstmAgre, BycstmAgre> {

    public BycstmAgreProcessor() {
    }


    @Override
    public BycstmAgre process(BycstmAgre item) throws Exception {

        item.toString();

        return item;
    }

}