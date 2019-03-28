package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class MntncCarProcessor implements ItemProcessor<MntncCar, MntncCar> {

    public MntncCarProcessor() {
    }


    @Override
    public MntncCar process(MntncCar item) throws Exception {

        return item;
    }

}
