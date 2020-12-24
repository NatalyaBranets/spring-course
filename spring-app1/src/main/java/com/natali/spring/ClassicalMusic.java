package com.natali.spring;

//fabric method
public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    public void doMyInit() {
        System.out.println("Do my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Do my destruction");
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
