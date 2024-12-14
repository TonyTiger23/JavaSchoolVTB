package org.example;

public abstract class Obstacle {
    protected int height;
    protected int width;
    protected String name;

    protected Obstacle(int height, int width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    protected abstract boolean tryObstacle(Object obj);

}
