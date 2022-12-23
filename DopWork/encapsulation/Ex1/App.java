package DopWork.encapsulation.Ex1;

public class App {
    public static void main(String[] args) {
        Model result = new Model(2, 4);
        result.setWidth(1);
        int multi = result.calcArea();
        int perimeter = result.calcPerimeter();
        System.out.println(multi);
        System.out.println(perimeter);
    }
}
