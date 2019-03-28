package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class ReplcProcessor implements ItemProcessor<Replc, Replc> {

    public ReplcProcessor() {
    }


    @Override
    public Replc process(Replc item) throws Exception {

        return item;
    }

}
