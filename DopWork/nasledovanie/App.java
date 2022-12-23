package DopWork.nasledovanie;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Саша", "Васильев", "5", "2");
        Person person = new Person("Вася", "Ильин", "25");
        System.out.println(person);
        System.out.println(employee);
    }
}
