package org.example;

public class Dog extends Animal {

    private static int dogCount;

    public Dog(String name, String color, int age,int maxRunDistanse, int maxSwimDistanse) {
        super(name,color,age,maxRunDistanse,maxSwimDistanse);
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
}
