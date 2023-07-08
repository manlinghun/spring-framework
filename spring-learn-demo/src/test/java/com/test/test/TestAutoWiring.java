
package com.test.test;

import com.test.base.UnitTestBase;
import com.test.service.AutoWiringService;
import org.junit.Test;

public class TestAutoWiring extends UnitTestBase {

    public TestAutoWiring() {
        super("classpath*:spring-auto.xml");
    }

    @Test
    public void test(){
        AutoWiringService service = super.getBean("autoWiringService");
        service.save("hahahahah");
    }




}
