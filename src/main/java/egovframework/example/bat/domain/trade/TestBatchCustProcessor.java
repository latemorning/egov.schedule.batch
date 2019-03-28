package egovframework.example.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class TestBatchCustProcessor implements ItemProcessor<TestBatchCust, TestBatchCust> {

    public TestBatchCustProcessor() {

    }


    @Override
    public TestBatchCust process(TestBatchCust item) throws Exception {

        return item;
    }

}
