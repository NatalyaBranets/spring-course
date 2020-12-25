package com.natali.spring;

import com.natali.spring.configuration.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        System.out.println("MusicPlayer name: " + musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());
        context.close();

    }

}
