package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class KorOwnersFlagProcessor implements ItemProcessor<KorOwnersFlag, KorOwnersFlag> {

    public KorOwnersFlagProcessor() {
    }


    @Override
    public KorOwnersFlag process(KorOwnersFlag item) throws Exception {

        item.toString();

        return item;
    }

}