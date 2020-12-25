package com.natali.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Computer computer = context.getBean("computer", Computer.class);
        //computer.playClassical();
        //computer.playRock();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        //ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        //ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        //System.out.println(classicalMusic1==classicalMusic2);

        context.close();

    }

}
