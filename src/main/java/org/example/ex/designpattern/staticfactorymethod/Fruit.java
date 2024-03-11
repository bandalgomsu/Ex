package org.example.ex.designpattern.staticfactorymethod;

class Apple implements Fruit {
}

class Banana implements Fruit {
}

class Melon implements Fruit {
}

interface Fruit {
    public static Fruit getApple() {
        return new Apple();
    }

    public static Fruit getBanana() {
        return new Banana();
    }

    public static Fruit Melon() {
        return new Melon();
    }

    public static Fruit getFruitByPrice(int price) {
        if (price > 1000) {
            return new Apple();
        }

        if (price > 500) {
            return new Banana();
        }

        return new Melon();
    }
}



