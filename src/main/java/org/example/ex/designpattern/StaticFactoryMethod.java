package org.example.ex.designpattern;

public class StaticFactoryMethod {

}
class Watch {
    private String price;
    private String brand;

    public Watch (String price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public static Watch watchByPrice (String price) {
        return new Watch(price, "브랜드");
    }

    public static Watch watchByBrand (String brand) {
        return new Watch("가격", brand);
    }

}
