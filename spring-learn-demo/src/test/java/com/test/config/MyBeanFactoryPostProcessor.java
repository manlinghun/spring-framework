package com.test.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author: joddon
 * @Date: 2022-3-27 14:51
 * @Version: 1.0
 * @Description:
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition injectionService = beanFactory.getBeanDefinition("injectionService");

        MutablePropertyValues propertyValues = injectionService.getPropertyValues();

//        propertyValues.add("serviceName","joddon1");

        System.out.println("------invoke MyBeanFactoryPostProcessor------");
    }
}
