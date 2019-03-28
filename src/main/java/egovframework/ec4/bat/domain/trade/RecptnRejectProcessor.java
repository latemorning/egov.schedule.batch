package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class RecptnRejectProcessor implements ItemProcessor<RecptnReject, RecptnReject> {

    public RecptnRejectProcessor() {
    }


    @Override
    public RecptnReject process(RecptnReject item) throws Exception {

        item.toString();

        return item;
    }

}