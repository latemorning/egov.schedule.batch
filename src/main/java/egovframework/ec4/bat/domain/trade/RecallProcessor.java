package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class RecallProcessor implements ItemProcessor<Recall, Recall> {

    public RecallProcessor() {
    }


    @Override
    public Recall process(Recall item) throws Exception {

        item.toString();

        return item;
    }

}