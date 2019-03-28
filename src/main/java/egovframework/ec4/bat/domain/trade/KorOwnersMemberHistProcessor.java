package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class KorOwnersMemberHistProcessor implements ItemProcessor<KorOwnersMember, KorOwnersMember> {

    public KorOwnersMemberHistProcessor() {
    }


    @Override
    public KorOwnersMember process(KorOwnersMember item) throws Exception {

        item.toString();

        return item;
    }

}