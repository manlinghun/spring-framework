package com.test.test;

import com.test.base.UnitTestBase;
import com.test.service.InjectionService;
import org.junit.Test;

/**
 * @Author: joddon
 * @Date: 2022-3-27 14:37
 * @Version: 1.0
 * @Description:
 */
public class TestIoc extends UnitTestBase {

    public TestIoc() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testGetName(){
        InjectionService injectionService = getBean("injectionService");

        System.out.println(injectionService.getThisServiceName("aaaa"));
    }

}
