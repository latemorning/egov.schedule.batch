package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class MntncCstmrHistProcessor implements ItemProcessor<MntncCstmr, MntncCstmr> {

    public MntncCstmrHistProcessor() {
    }


    @Override
    public MntncCstmr process(MntncCstmr item) throws Exception {

        return item;
    }

}
