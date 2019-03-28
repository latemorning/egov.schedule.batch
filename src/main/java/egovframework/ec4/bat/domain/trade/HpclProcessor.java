package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class HpclProcessor implements ItemProcessor<Hpcl, Hpcl> {

    public HpclProcessor() {
    }


    @Override
    public Hpcl process(Hpcl item) throws Exception {

        item.toString();

        return item;
    }

}
