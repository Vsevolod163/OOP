package DopWork.encapsulation.Ex3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Model user = new Model("12", "1", "Вася", "21241");
        user.getPassword();
        user.setPassword("132523");
        System.out.println(user.toString());
        ArrayList<String> table = user.createTable();
        System.out.println(table);
        table.add("5");
        System.out.println(table);
    }
}
