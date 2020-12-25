package com.natali.spring;

import com.natali.spring.model.Music;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    private List<Music> musicList;


    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong() + ", with volume " + this.volume;
    }

}
