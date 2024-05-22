package org.example.ex.designpattern.builder;

public class BuilderPattern {

    public void builder() {

    }


    public static class Iphone {
        private String phoneNumber;
        private String name;

        public Iphone(String phoneNumber, String name) {
            this.phoneNumber = phoneNumber;
            this.name = name;
        }
    }

    public static class IphoneBuilder {
        private String phoneNumber;
        private String name;

        public IphoneBuilder() {
        }

        public IphoneBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public IphoneBuilder name(String name) {
            if (name.equals("galaxy")) {
                throw new RuntimeException();
            }
            this.name = name;
            return this;
        }

        public Iphone build() {
            return new Iphone(phoneNumber, name);
        }
    }
}
