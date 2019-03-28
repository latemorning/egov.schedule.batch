package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class BycstmAgreHistProcessor implements ItemProcessor<BycstmAgre, BycstmAgre> {

    public BycstmAgreHistProcessor() {
    }


    @Override
    public BycstmAgre process(BycstmAgre item) throws Exception {

        item.toString();

        return item;
    }

}