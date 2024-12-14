package org.example;

public class Human implements Runnable, Jumpable{
    String name;
    int max_height;
    int max_distance;

    Human(String name, int max_height, int max_distance) {
        this.name = name;
        this.max_height = validateHeightValue(max_height);
        this.max_distance = validateWidthValue(max_distance);
    }

    @Override
    public boolean run(int distance) {
        if (distance > max_distance) {
            System.out.println("Человек "+ name+  " устал и пробежал только " + max_distance + " метров");
            return false;
        }
        else
        {
            System.out.println("Человек "+ name+  " пробежал " + distance + " метров");
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height > max_height) {
            System.out.println("Человек "+ name+  " устал и прыгнул только на " + max_height + " метров");
            return false;
        }
        else
        {
            System.out.println("Человек "+ name+  " прыгнул на " + height + " метров");
            return true;
        }
    }

    private static int validateHeightValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Максимальная высота прыжка не может быть отрицательной");
        }
        return value;
    }

    private static int validateWidthValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Максимальная дистанция бега не может быть отрицательной");
        }
        return value;
    }
}
