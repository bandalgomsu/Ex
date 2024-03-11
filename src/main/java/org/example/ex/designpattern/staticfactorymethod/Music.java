package org.example.ex.designpattern.staticfactorymethod;

import java.util.Arrays;

public enum Music {
    그대만있다면(0),
    너를위해(1),
    너를만나(2),
    DEFAULT(999);

    private int num;

    Music(int num) {
        this.num = num;
    }

    public static Music auto(int number) {
        return Arrays.stream(Music.values()).filter(music -> music.num == number).findFirst().orElse(DEFAULT);
    }

    public static Music select(String music) {
        return Music.valueOf(music);
    }

    public int getNum() {
        return num;
    }
}
