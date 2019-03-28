package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class MarktPrcuseAgreHistProcessor implements ItemProcessor<MarktPrcuseAgre, MarktPrcuseAgre> {

    public MarktPrcuseAgreHistProcessor() {
    }


    @Override
    public MarktPrcuseAgre process(MarktPrcuseAgre item) throws Exception {

        item.toString();

        return item;
    }

}