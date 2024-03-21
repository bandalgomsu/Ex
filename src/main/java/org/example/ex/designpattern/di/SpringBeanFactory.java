package org.example.ex.designpattern.di;

public class SpringBeanFactory {

    public void shop() {
        Factory factory = new FruitFactory();

        Shop shop = new Shop(factory);
    }
}
