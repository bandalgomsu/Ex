package org.example.ex.designpattern.staticfactorymethod;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    // 정적 팩토리 메서드
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
