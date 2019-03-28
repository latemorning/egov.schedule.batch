package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class BycntcAgreProcessor implements ItemProcessor<BycntcAgre, BycntcAgre> {

    public BycntcAgreProcessor() {
    }


    @Override
    public BycntcAgre process(BycntcAgre item) throws Exception {

        item.toString();

        return item;
    }

}