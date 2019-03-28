package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class BhfLcHistProcessor implements ItemProcessor<BhfLc, BhfLc> {

    public BhfLcHistProcessor() {
    }


    @Override
    public BhfLc process(BhfLc item) throws Exception {

        return item;
    }

}
