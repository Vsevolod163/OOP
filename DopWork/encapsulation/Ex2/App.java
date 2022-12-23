package DopWork.encapsulation.Ex2;

public class App {
    public static void main(String[] args) {
        Model user = new Model("Вася", "21241");
        user.getPassword();
        user.setPassword("132523");
        System.out.println(user.toString());

    }
}
