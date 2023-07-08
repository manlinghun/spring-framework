package com.springlearn.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: tthu
 * @Date: 2018/8/13 22:41
 * @Version 1.0
 */
@Scope("singleton")
@Component("testService")
public class TestService {

    public void say(String str){
        System.out.println(str);
    }
}
