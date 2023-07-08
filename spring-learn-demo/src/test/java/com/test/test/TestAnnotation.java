package com.test.test;

import com.springlearn.beanannotation.TestService;
import com.test.base.UnitTestBase;
import org.junit.Test;

/**
 * @Author: tthu
 * @Date: 2018/8/13 22:43
 * @Version 1.0
 */

public class TestAnnotation extends UnitTestBase {

    public TestAnnotation() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSay(){
        TestService service = super.getBean("testService");
        service.say("hahahahah");
    }


}
