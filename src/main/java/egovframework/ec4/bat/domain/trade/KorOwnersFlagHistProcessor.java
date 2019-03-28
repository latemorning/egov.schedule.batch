package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class KorOwnersFlagHistProcessor implements ItemProcessor<KorOwnersFlag, KorOwnersFlag> {

    public KorOwnersFlagHistProcessor() {
    }


    @Override
    public KorOwnersFlag process(KorOwnersFlag item) throws Exception {

        item.toString();

        return item;
    }

}