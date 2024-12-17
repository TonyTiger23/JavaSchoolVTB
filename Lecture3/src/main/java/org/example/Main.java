package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] Arr1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}

        };


        try{
            System.out.println("Сумма элементов массива: "+processArray(Arr1));
        }
        catch(MyArrayDataException | MyArraySizeException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    public static int processArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4");
        }
        for (String[] row : arr) {
            if (row.length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4х4");
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать в число", i, j);
                }

            }
        }

        return sum;
    }
}
