package org.example.ex.designpattern;


import org.example.ex.designpattern.staticfactorymethod.Music;
import org.example.ex.designpattern.staticfactorymethod.MusicPlayer;
import org.example.ex.designpattern.staticfactorymethod.Singleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StaticFactoryMethodTest {

    @Test
    @DisplayName("음악 재생")
    void musicPlayer() {
        Music music1 = MusicPlayer.selectPlay("그대만있다면");
        Music music2 = MusicPlayer.autoPlay();

        System.out.println(music1);
        System.out.println(music2);
    }

    @Test
    @DisplayName("싱글톤")
    void singleTone() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("SingleTone 1 : " + singleton1);
        System.out.println("SingleTone 2 : " + singleton2);
    }
}