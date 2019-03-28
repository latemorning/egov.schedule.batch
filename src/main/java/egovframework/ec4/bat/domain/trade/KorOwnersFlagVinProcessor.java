package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class KorOwnersFlagVinProcessor implements ItemProcessor<KorOwnersFlagVin, KorOwnersFlagVin> {

    public KorOwnersFlagVinProcessor() {
    }


    @Override
    public KorOwnersFlagVin process(KorOwnersFlagVin item) throws Exception {

        item.toString();

        return item;
    }

}