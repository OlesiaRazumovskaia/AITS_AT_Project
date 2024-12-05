package HomeworckOOP.Person;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите фамилию:");
        String familyName = scanner.nextLine();
        System.out.println("Укажите имя");
        String name = scanner.nextLine();
        System.out.println("Укажите отчество");
        String middleName = scanner.nextLine();
        System.out.println("Укажите возраст");
        int age = scanner.nextInt();

        if(age < Person.MIN_AGE) {
            System.out.println("Невозможно внести изменения. Указанный возраст менее минимального - " + Person.MIN_AGE + "лет.");
        } else {
            Person person = new Person(name, middleName, familyName, age);
            System.out.println("Изменения успешно сохранены: ");
            System.out.println(person.toString());
            System.out.println("Год рождения: "+ person.getYearOfBirth(person.getAge()));
        }
    }
}
