package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class MntncCarHistProcessor implements ItemProcessor<MntncCar, MntncCar> {

    public MntncCarHistProcessor() {
    }


    @Override
    public MntncCar process(MntncCar item) throws Exception {

        return item;
    }

}
