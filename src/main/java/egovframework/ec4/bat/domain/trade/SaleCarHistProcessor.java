package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class SaleCarHistProcessor implements ItemProcessor<SaleCar, SaleCar> {

    public SaleCarHistProcessor() {
    }


    @Override
    public SaleCar process(SaleCar item) throws Exception {

        return item;
    }

}
