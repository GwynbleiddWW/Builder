package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setName("God")
                .setSurname("Zeus")
                .setAge(30)
                .setAddress("Texas")
                .build();
        System.out.println(person);
        person.happyBirthday();
        person.setAddress("Florida");
        System.out.println("\nChanged city and age by 1 year: " + person);
        System.out.println(person.hasAge());
        System.out.println(person.hasAddress());

        Person child = new Person.PersonBuilder()
                .setName("Alisha")
                .newChildBuild();
        System.out.println(child);
        child.setAddress(person.getAddress());
        System.out.println(child);
    }
}
