package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class BuzplcHistProcessor implements ItemProcessor<Buzplc, Buzplc> {

    public BuzplcHistProcessor() {
    }


    @Override
    public Buzplc process(Buzplc item) throws Exception {

        return item;
    }

}
