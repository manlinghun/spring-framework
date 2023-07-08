package com.test.resources;

import com.springlearn.utils.PrintUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

/**
 * @Author: tthu
 * @Date: 2018/11/25 21:45
 * @Version 1.0
 */

public class OneResources implements ApplicationContextAware {

    private String name;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void resource(){
        Resource resource = null;
        File file = null;
        try {
            String resourcePath = "classpath:config.txt";
            resourcePath = "file:E:\\project\\springdemo\\src\\config.txt";
            resourcePath = "url:https://manlinghun.github.io/2018/05/27/hello-world";
            resourcePath = "config.txt";
            resource = applicationContext.getResource(resourcePath);
            PrintUtils.printlnString(resource.getFilename());
            PrintUtils.printLnObject(resource.contentLength());
//            file = resource.getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
