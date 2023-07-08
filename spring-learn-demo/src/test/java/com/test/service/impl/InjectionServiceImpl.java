package com.test.service.impl;

import com.test.dao.InjectionDao;
import com.test.service.InjectionService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class  InjectionServiceImpl implements InjectionService, BeanFactoryAware {

    private InjectionDao injectionDao;

    private String serviceName;

    private BeanFactory beanFactory;

    public InjectionServiceImpl(){
        System.out.println("--------- 调用默认构造方法--------");
    }

    public InjectionServiceImpl(InjectionDao injectionDao,String serviceName){
        System.out.println("----------构造注入    通过构造方法为对象赋值 ----- ");
        this.injectionDao = injectionDao;
        this.serviceName = serviceName;
    }

    public InjectionDao getInjectionDao() {
        return injectionDao;
    }

    public void setInjectionDao(InjectionDao injectionDao) {
        System.out.println("----------设值注入    通过set方法为对象赋值  injectionDao----- ");
        this.injectionDao = injectionDao;
    }

    @Override
    public void save(String data) {
        System.out.println("Service get data : "+data  );
        injectionDao.save(data);
    }

    @Override
    public String getThisServiceName(String val) {
        return val+"_"+serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
