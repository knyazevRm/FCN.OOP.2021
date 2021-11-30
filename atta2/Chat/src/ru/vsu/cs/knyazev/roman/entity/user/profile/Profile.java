package ru.vsu.cs.knyazev.roman.entity.user.profile;

public class Profile {
    private String firstName;
    private String lastName;
    private int age;
    private char sex;
    private String hometown;

    public Profile(String firstName, String lastName, int age, char sex, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
