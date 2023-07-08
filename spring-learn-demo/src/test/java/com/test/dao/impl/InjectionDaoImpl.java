package com.test.dao.impl;

import com.test.dao.InjectionDao;

public class InjectionDaoImpl implements InjectionDao {

    @Override
    public void save(String data) {
        System.out.println("save data : " + data);
    }
}
