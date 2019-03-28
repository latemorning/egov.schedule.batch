package egovframework.ec4.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class SaleCarProcessor implements ItemProcessor<SaleCar, SaleCar> {

    public SaleCarProcessor() {
    }


    @Override
    public SaleCar process(SaleCar item) throws Exception {

        return item;
    }

}
