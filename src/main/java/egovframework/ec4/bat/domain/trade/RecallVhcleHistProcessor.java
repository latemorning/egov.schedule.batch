package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class RecallVhcleHistProcessor implements ItemProcessor<RecallVhcle, RecallVhcle> {

    public RecallVhcleHistProcessor() {
    }


    @Override
    public RecallVhcle process(RecallVhcle item) throws Exception {

        return item;
    }

}