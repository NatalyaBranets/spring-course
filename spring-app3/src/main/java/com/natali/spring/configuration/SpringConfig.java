package com.natali.spring.configuration;

import com.natali.spring.*;
import com.natali.spring.model.ClassicalMusic;
import com.natali.spring.model.JazzMusic;
import com.natali.spring.model.Music;
import com.natali.spring.model.RockMusic;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("com.natali.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
