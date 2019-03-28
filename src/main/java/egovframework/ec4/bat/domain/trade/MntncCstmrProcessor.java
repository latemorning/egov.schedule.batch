package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class MntncCstmrProcessor implements ItemProcessor<MntncCstmr, MntncCstmr> {

    public MntncCstmrProcessor() {
    }


    @Override
    public MntncCstmr process(MntncCstmr item) throws Exception {

        return item;
    }

}
