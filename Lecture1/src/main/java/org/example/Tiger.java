package org.example;

public class Tiger extends Animal {
    private static int tigerCount;

    public Tiger(String name, String color, int age, int maxRunDistanse, int maxSwimDistanse) {
        super(name,color,age, maxRunDistanse, maxSwimDistanse);
        tigerCount++;
    }

    public static int getTigerCount() {
        return tigerCount;
    }
}
