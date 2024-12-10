package org.example;

public class Cat extends Animal {

    private static int catCount;

    public Cat(String name, String color, int age,int maxRunDistanse, int maxSwimDistanse) {
        super(name,color,age,maxRunDistanse,maxSwimDistanse);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }
}
