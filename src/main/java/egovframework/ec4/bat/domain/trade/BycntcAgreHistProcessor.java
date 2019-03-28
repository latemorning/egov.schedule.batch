package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class BycntcAgreHistProcessor implements ItemProcessor<BycntcAgre, BycntcAgre> {

    public BycntcAgreHistProcessor() {
    }


    @Override
    public BycntcAgre process(BycntcAgre item) throws Exception {

        item.toString();

        return item;
    }

}