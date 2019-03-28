package egovframework.example.bat.domain.trade;

import org.springframework.batch.item.ItemProcessor;

public class TestBatchUserProcessor implements ItemProcessor<TestBatchUser, TestBatchUser> {

    public TestBatchUserProcessor() {

    }


    @Override
    public TestBatchUser process(TestBatchUser item) throws Exception {

        return item;
    }

}
