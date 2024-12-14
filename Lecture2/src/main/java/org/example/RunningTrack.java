package org.example;

import java.awt.*;

public class RunningTrack extends Obstacle {


    public RunningTrack(int height, int width, String name) {
        super(validateHeightValue(height), validateWidthValue(width), name);
    }

    public int getWidth() {
        return this.width;
    }

    public String getName() {
        return this.name;
    }

    @Override
    protected boolean tryObstacle(Object obj) {
        if(obj instanceof Runnable) {
           return ((Runnable) obj).run(this.width);
        }
        else {
            throw new IllegalArgumentException("Object must implement Runnable");
        }
    }

    private static int validateHeightValue(int value) {
        if (value != 0) {
            throw new IllegalArgumentException("В этой задаче дорожка не имеет высоту, этот параметр должен быть равен 0");
        }
        return value;
    }

    private static int validateWidthValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Длина дорожки не может быть отрицательной");
        }
        return value;
    }
}
