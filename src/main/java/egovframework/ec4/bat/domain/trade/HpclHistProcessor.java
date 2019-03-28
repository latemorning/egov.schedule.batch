package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class HpclHistProcessor implements ItemProcessor<Hpcl, Hpcl> {

    public HpclHistProcessor() {
    }


    @Override
    public Hpcl process(Hpcl item) throws Exception {

        item.toString();

        return item;
    }

}
