package HomeworckOOP.Person;

import java.util.Calendar;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;
    public static final int MIN_AGE = 15;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < MIN_AGE) {
            System.out.println("Невозможно изменить возраст. Указанный возраст менее минимального (15 лет)");
        } else {
            this.age = age;
        }
    }

    public String toString() {
        return "{" + familyName + " " + name + " " + middleName + "}";
    }

    public int getYearOfBirth(int age) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        return currentYear - age;
    }
}
