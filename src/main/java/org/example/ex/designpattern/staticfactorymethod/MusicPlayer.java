package org.example.ex.designpattern.staticfactorymethod;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public static Music autoPlay() {
        return Music.auto(NumberGenerator.generateNum());
    }

    public static Music selectPlay(String music) {
        return Music.select(music);
    }
}
