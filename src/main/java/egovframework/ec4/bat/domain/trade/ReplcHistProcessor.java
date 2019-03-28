package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class ReplcHistProcessor implements ItemProcessor<Replc, Replc> {

    public ReplcHistProcessor() {
    }


    @Override
    public Replc process(Replc item) throws Exception {

        return item;
    }
}
