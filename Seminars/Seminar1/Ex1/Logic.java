package Seminars.Seminar1.Ex1;

public class Logic {
    public void sum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 2 < array.length) {
                int sum = array[i] + array[i + 1] + array[i + 2];
                System.out.println("Сумма" + " " + array[i] + " " + "+" + " " + array[i + 1] + " " + "+" + " "
                        + array[i + 2] + " " + "=" + " " + sum);
            }
        }
    }
}
