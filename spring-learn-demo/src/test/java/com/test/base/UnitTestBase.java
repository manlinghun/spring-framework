package com.test.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author HTT
 */
public class UnitTestBase {

    /**
     * context 主要用于存储javebean
     */
    private ClassPathXmlApplicationContext context;
    /**
     * spring 配置文件的路径
     */
    private String springXmlPath;

    public UnitTestBase() {}

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    /**
     * 会在test方法执行该方法
     */
    @Before
    public void before() {
         System.out.println("--------------- start  loading config ----------");
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }
        try {
            springXmlPath.split("[,\\s]+");
             context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
//            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        context.close();

        System.out.println("--------------- destroy context info ----------");
    }

    @SuppressWarnings("unchecked")
    protected <T> T getBean(String beanId) {
        try {
            return (T)context.getBean(beanId);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected <T> T getBean(Class<T> clazz) {
        try {
            return context.getBean(clazz);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }

}
