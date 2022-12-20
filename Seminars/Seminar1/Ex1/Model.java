package Seminars.Seminar1.Ex1;

public class Model {
    public static void main(String[] args) {
        InputArray a = new InputArray();
        int[] array = a.inputArray();
        View b = new View();
        b.printArray2D(array);
        System.out.println();
        Logic result = new Logic();
        result.sum(array);
    }
}
