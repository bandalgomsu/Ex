package org.example.ex.designpattern;

import org.example.ex.designpattern.singletone.Singleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingleTonTest {

    @Test
    @DisplayName("싱글톤 테스트")
    void singleToneTest() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("1 = " + singleton1.getClass());
        System.out.println("2 = " + singleton1.getClass());
    }
}
