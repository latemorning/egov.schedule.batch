package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class BhfLcProcessor implements ItemProcessor<BhfLc, BhfLc> {

    public BhfLcProcessor() {
    }


    @Override
    public BhfLc process(BhfLc item) throws Exception {

        return item;
    }

}
