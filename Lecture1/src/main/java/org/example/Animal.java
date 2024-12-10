package org.example;

public abstract class Animal implements Runnable, Swimmable{
    protected  String name;
    protected  String color;
    protected  int age;

    protected  int maxRunDistanse;
    protected  int maxSwimDistanse;

    private static int animalCount;

    public Animal(String name, String color, int age, int maxRunDistanse, int maxSwimDistanse)
    {
        this.name =name;
        this.color=color;
        this.age=age;
        this.maxRunDistanse=maxRunDistanse;
        this.maxSwimDistanse=maxSwimDistanse;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    @Override
    public void run(int distance){
        if(distance > this.maxRunDistanse){
            System.out.println(this.getClass().getSimpleName() +" " + this.name + " устал и пробежал только " +  this.maxRunDistanse + " метров");
        }
        else
        {
            System.out.println(this.getClass().getSimpleName() +" " + this.name + " пробежал " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance){
        if(this.maxSwimDistanse != 0) {
            if (distance > this.maxSwimDistanse) {
                System.out.println(this.getClass().getSimpleName() +" " + this.name + " устал и проплыл только " + this.maxRunDistanse + " метров");
            } else {
                System.out.println(this.getClass().getSimpleName() +" " + this.name + " проплыл " + distance + " метров");
            }
        }
        else
        {
            System.out.println(this.getClass().getSimpleName() +" " + this.name + " не умеет плавать");
        }
    }
}
