package Seminars.Seminar1.Ex1;

import java.util.Scanner;

public class InputArray {
    public int[] inputArray() {
        Scanner sk = new Scanner(System.in);
        int size;
        System.out.print("Введите размер массива: ");
        size = sk.nextInt();
        while (size < 3) {
            Scanner sk2 = new Scanner(System.in);
            System.out.print("Ошибка, недостаточное количество элементов массива, попробуйте еще раз: ");
            size = sk2.nextInt();
        }
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите" + " " + (i + 1) + " " + "элемент массива: ");
            array[i] = sk.nextInt();
        }
        return array;
    }
}
