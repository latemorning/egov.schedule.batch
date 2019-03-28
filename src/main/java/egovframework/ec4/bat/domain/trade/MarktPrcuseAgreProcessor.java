package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class MarktPrcuseAgreProcessor implements ItemProcessor<MarktPrcuseAgre, MarktPrcuseAgre> {

    public MarktPrcuseAgreProcessor() {
    }


    @Override
    public MarktPrcuseAgre process(MarktPrcuseAgre item) throws Exception {

        item.toString();

        return item;
    }

}