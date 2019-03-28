package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class KorOwnersMemberProcessor implements ItemProcessor<KorOwnersMember, KorOwnersMember> {

    public KorOwnersMemberProcessor() {
    }


    @Override
    public KorOwnersMember process(KorOwnersMember item) throws Exception {

        item.toString();

        return item;
    }

}