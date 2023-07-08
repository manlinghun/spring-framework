package com.test.test;

import com.test.base.UnitTestBase;
import com.test.resources.OneResources;
import org.junit.Test;

/**
 * @Author: tthu
 * @Date: 2018/11/25 21:40
 * @Version 1.0
 */

public class TestResources extends UnitTestBase {

    public TestResources(){
        super(
                "classpath*:spring-resources.xml"
        );
    }


    @Test
    public void testClassPath(){
        OneResources one = getBean("oneResources");
        one.resource();
        System.out.println(one.getName());
    }



}
