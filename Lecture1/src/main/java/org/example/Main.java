package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Animal[] animals = new Animal[10];
        animals[0] = new Cat("Barsik", "Black", 3, 200, 0);
        animals[1] = new Cat("Murzik", "White", 4, 200, 0);
        animals[2] = new Cat("Rizik", "Yellow", 5, 200, 0);
        animals[3] = new Dog("Reks", "Gold", 6, 500, 10);
        animals[4] = new Dog("Spot", "Grey", 7, 500, 10);
        animals[5] = new Dog("Sharik", "Black", 8, 500, 10);
        animals[6] = new Dog("Korzik", "Yellow", 9, 500, 10);
        animals[7] = new Dog("Tuzik", "Black", 10, 500, 10);
        animals[8] = new Tiger("MrRoar", "White", 5, 700, 20);
        animals[9] = new Tiger("MrKus", "Orange", 6, 700, 20);

        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Тигров: " + Tiger.getTigerCount());


        for (Animal animal : animals) {
            int runDistance =random.nextInt(800);
            int swimDistance= random.nextInt(30);
            System.out.println("______________________________");
            System.out.println("Run Distance: " + runDistance + ", Swim Distance: " + swimDistance);
            animal.run(runDistance);
            animal.swim(swimDistance);
        }




    }


}
