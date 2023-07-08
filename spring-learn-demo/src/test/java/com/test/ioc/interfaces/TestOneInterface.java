package com.test.ioc.interfaces;

import com.test.base.UnitTestBase;
import com.test.bean.TestAwareBean;
import com.test.ioc.interfaceImpls.OneInterfaceImpl;
import com.test.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * 主要用于对Spring文件的加载和销毁
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

    public TestOneInterface(){
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testSqy(){
        //通过id获取对象实例
        OneInterface one = super.getBean("oneInterface");
        one.say("this is one test");
        //通过类获取对象实例
        OneInterface two = super.getBean(OneInterfaceImpl.class);
        two.say("this is two test");

        //验证IOC容器中对象作用域
        OneInterfaceImpl test1 = super.getBean("oneInterface");
        OneInterfaceImpl test2= super.getBean("oneInterface");
        test1.say(String.valueOf(test1.hashCode()));
        test2.say(String.valueOf(test2.hashCode()));
    }


    @Test
    public void testSetter(){
        System.out.println("------------------");
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("hahahaha");
    }

    @Test
    public void testCons(){
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("hahahaha");
    }

    @Test
    public void testAware(){
        TestAwareBean test = super.getBean("testAwareBean");
        test.say("---------"+test.hashCode());
    }
}

