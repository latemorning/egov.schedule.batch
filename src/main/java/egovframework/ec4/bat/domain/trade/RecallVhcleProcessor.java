package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class RecallVhcleProcessor implements ItemProcessor<RecallVhcle, RecallVhcle> {

    public RecallVhcleProcessor() {
    }


    @Override
    public RecallVhcle process(RecallVhcle item) throws Exception {

        item.toString();

        return item;
    }

}