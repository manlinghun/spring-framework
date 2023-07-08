package com.test.service;

import com.test.dao.AutoWiringDao;

public class AutoWiringService {


    AutoWiringDao autoWiringDao;


    public AutoWiringService(AutoWiringDao autoWiringDao) {
        this.autoWiringDao = autoWiringDao;
    }

    public void save(String str ){
        System.out.println("----------Serveice get data ------");
        autoWiringDao.save(str);
    }

    public AutoWiringDao getAutoWiringDao() {
        return autoWiringDao;
    }

    public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
        this.autoWiringDao = autoWiringDao;
    }
}
