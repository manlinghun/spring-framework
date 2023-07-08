package com.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author HTT
 */
public class TestAwareBean implements ApplicationContextAware, BeanNameAware {

    public void say(String str){
        System.out.println(str);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("testAwareBean   -----  "+applicationContext.getBean("testAwareBean").hashCode());
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println(" ----- beanName = "+ beanName);
    }
}
