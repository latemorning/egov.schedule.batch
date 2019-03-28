package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class DelivyHistProcessor implements ItemProcessor<Delivy, Delivy> {

    public DelivyHistProcessor() {
    }


    @Override
    public Delivy process(Delivy item) throws Exception {

        return item;
    }

}
