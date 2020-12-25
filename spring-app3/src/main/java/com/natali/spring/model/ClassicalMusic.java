package com.natali.spring.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

}
