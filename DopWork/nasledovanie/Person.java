package DopWork.nasledovanie;

public class Person {
    private String firstName;
    private String lastName;
    private String age;

    public Person(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("first name: %s, last name: %s, age: %s", firstName, lastName, age);
    }
}
