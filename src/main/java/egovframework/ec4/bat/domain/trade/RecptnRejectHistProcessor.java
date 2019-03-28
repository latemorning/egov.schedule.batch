package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class RecptnRejectHistProcessor implements ItemProcessor<RecptnReject, RecptnReject> {

    public RecptnRejectHistProcessor() {
    }


    @Override
    public RecptnReject process(RecptnReject item) throws Exception {

        item.toString();

        return item;
    }

}