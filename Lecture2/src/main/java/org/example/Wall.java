package org.example;

public class Wall extends Obstacle {

    public Wall(int height, int width, String name) {
        super(validateHeightValue(height), validateWidthValue(width), name);
    }

    public int getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    @Override
    protected boolean tryObstacle(Object obj) {
        if(obj instanceof Jumpable) {
           return ((Jumpable) obj).jump(this.height);
        }
        else {
            throw new IllegalArgumentException("Object must implement Jumpable");
        }
    }

    private static int validateHeightValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Высота стены не может быть отрицательной");
        }
        return value;
    }

    private static int validateWidthValue(int value) {
        if (value != 0) {
            throw new IllegalArgumentException("В этой задаче стена не имеет ширину, этот параметр должен быть равен 0");
        }
        return value;
    }


}
