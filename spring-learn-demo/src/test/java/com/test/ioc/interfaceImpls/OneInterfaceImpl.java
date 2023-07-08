package com.test.ioc.interfaceImpls;

import com.test.ioc.interfaces.OneInterface;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class OneInterfaceImpl implements OneInterface, InitializingBean, DisposableBean {
    private String Name;

    @Override
    public void say(String arg) {
        System.out.println(arg);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private void init(){
        System.out.println("--- 配置init-method = \"init\" ---");
    }

    private void destroyMethod(){
        System.out.println("--- destroy-method=\"destroyMethod\" ---");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("--- 实现InitializingBean接口，重写afterPropertiesSet方法 ---");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("--- 实现DisposableBean接口，重写destroy方法 ---");
    }

    public void defInitMethod(){
        System.out.println(" --- defInitMethod --- ");
    }
}
