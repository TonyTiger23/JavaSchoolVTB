package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Object[] participants = new Object[6];
        participants[0] = new Cat("Barsik", 10, 5);
        participants[1] = new Cat("Murzik", 5, 10);
        participants[2] = new Human("Vasya", 2, 20);
        participants[3] = new Human("Petya", 1, 15);
        participants[4] = new Robot("Robot1", 3, 30);
        participants[5] = new Robot("Robot2", 8, 50);

        Obstacle[] obstacles = new Obstacle[6];
        obstacles[0] = new RunningTrack(0, 5, "track_1");
        obstacles[1] = new RunningTrack(0, 10, "track_2");
        obstacles[2] = new RunningTrack(0, 15, "track_3");
        obstacles[3] = new Wall(2, 0, "wall_1");
        obstacles[4] = new Wall(4, 0, "wall_2");
        obstacles[5] = new Wall(8, 0, "wall_3");

        for (Object player : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.tryObstacle(player)) {
                    System.out.println("Участник не прошел испытание " + obstacle.name + " и исключается из гонки");
                    System.out.println("___________________________________");
                    break;
                }
            }
        }
    }
}