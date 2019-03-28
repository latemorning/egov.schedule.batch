package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class DelivyProcessor implements ItemProcessor<Delivy, Delivy> {

    public DelivyProcessor() {
    }


    @Override
    public Delivy process(Delivy item) throws Exception {

        return item;
    }

}
