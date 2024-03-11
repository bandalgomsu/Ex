package org.example.ex.designpattern.staticfactorymethod;

import java.util.Random;

public class NumberGenerator {
    public static int generateNum() {
        return new Random().nextInt(3);
    }
}
