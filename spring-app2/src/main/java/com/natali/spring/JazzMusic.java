package com.natali.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music{

    private List<String> songs = new ArrayList<>();

    {
        songs.add("A Night in Tunisia");
        songs.add("Bouncing with Bud");
        songs.add("Winter Jazz");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
