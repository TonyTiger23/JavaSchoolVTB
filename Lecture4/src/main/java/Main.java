import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        printArray(arr);
        arrSwap(arr, 0, 1);
        printArray(arr);

        ArrayList<String> arrList1 = arrayToArrayList(arr);
        printCollection(arrList1);


        Box<Orange> box1 = new Box<>("Апельсины вкусные");
        Box<Orange> box2 = new Box<>("Апельсины невкусные");

        box1.addFruit(new Orange("Апельсин", "Оранжевый", 0.5f));
        box1.addFruit(new Orange("Апельсин", "Оранжевый", 1.5f));
        box1.addFruit(new Orange("Апельсин", "Оранжевый", 2.5f));
        box1.addFruit(new Orange("Апельсин", "Оранжевый", 3f));

        System.out.println("В коробке: <" + box1.getName() + "> " + (int) box1.getFruitsCounter() + " фрукта");
        System.out.println("Коробка весит: " + box1.getWeight());
        System.out.println("В коробке: <" + box2.getName() + "> " + (int) box2.getFruitsCounter() + " фрукта");
        System.out.println("Коробка весит: " + box2.getWeight());
        System.out.println("Коробки равны? " + box1.Compare(box2));

        box1.fruitspPouring(box2);

        System.out.println("__________________________________________________");
        System.out.println("В коробке: <" + box1.getName() + "> " + (int) box1.getFruitsCounter() + " фрукта");
        System.out.println("Коробка весит: " + box1.getWeight());
        System.out.println("В коробке: <" + box2.getName() + "> " + (int) box2.getFruitsCounter() + " фрукта");
        System.out.println("Коробка весит: " + box2.getWeight());
        System.out.println("Коробки равны? " + box1.Compare(box2));
        System.out.println("__________________________________________________");

        Box<Apple> box3 = new Box<>("Яблоки садовые");
        box3.addFruit(new Apple("Яблоко", "Зеленое", 0.5f));
        box3.addFruit(new Apple("Яблоко", "Красное", 1.5f));
        box3.addFruit(new Apple("Яблоко", "Желтое", 2.5f));
        box3.addFruit(new Apple("Яблоко", "Зеленое", 3f));

        System.out.println("Коробки равны? " + box2.Compare(box3));

    }

    public static <T> ArrayList<T> arrayToArrayList(T[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        } else {
            for (T element : arr) {
                if (element == null) {
                    throw new IllegalArgumentException("Массив содержит null элемент");
                }
            }
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        ArrayList<T> tempList = new ArrayList<>(arr.length);

        // Collections.addAll(tempList, arr);
        for (T value : arr) {
            tempList.add(value);
        }

        return tempList;
    }


    public static <T> void arrSwap(T[] arr, int index1, int index2) {

        if (arr == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        } else {
            for (T element : arr) {
                if (element == null) {
                    throw new IllegalArgumentException("Массив содержит null элемент");
                }
            }
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        if (index1 < 0 || index1 > arr.length - 1 || index2 < 0 || index2 > arr.length - 1) {
            throw new IllegalArgumentException("Индексы выходят за пределы массива");
        }

        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    public static <T> void printArray(T[] arr) {
        for (T value : arr) {
            System.out.print(value);
        }
        System.out.println();
    }

    public static <T> void printCollection(Collection<T> collection) {
        for (T value : collection) {
            System.out.print(value);
        }
        System.out.println();
    }
}