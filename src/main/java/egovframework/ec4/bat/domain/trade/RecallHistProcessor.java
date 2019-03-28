package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class RecallHistProcessor implements ItemProcessor<Recall, Recall> {

    public RecallHistProcessor() {
    }


    @Override
    public Recall process(Recall item) throws Exception {

        item.toString();

        return item;
    }

}