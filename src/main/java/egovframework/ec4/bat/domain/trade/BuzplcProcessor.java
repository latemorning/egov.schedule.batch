package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class BuzplcProcessor implements ItemProcessor<Buzplc, Buzplc> {

    public BuzplcProcessor() {
    }


    @Override
    public Buzplc process(Buzplc item) throws Exception {

        return item;
    }

}
