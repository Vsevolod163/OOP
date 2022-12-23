package Homeworks.homework2;

public class Main {
    public static void main(String[] args) {
        Human.addHuman("Иванов", 25, Gender.Man);
        Human.addHuman("Иванова", 20, Gender.Woman);
        Human.addHuman("Петров", 36, Gender.Man);
        Human.addHuman("Петрова", 29, Gender.Woman);
        Human.addHuman("Сидоров", 47, Gender.Man);
        Human.addHuman("Сидорова", 38, Gender.Woman);
        Human.addHuman("Фёдоров", 58, Gender.Man);
        Human.addHuman("Фёдорова", 47, Gender.Woman);

        Human.printHumanList();
        System.out.println(Communications.getHumans());

        // проверяем на поиск элемента в Human
        Communications.addTypeRelationship("Иванов", TypeRelationship.Husband, "Иванова");
    }
}
