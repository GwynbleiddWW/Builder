package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setName("God")
                .setSurname("Zeus")
                .setAddress("Texas")
                //.setAge(0)
                .build();
        System.out.println(person);
        person.happyBirthday();
        person.setAddress("Florida");
        System.out.println("\nChanged city and age by 1 year: " + person);
        System.out.println("hasAge: " + person.hasAge());
        System.out.println("hasAddress: " + person.hasAddress());

        Person child1 = person.newChildBuilder(8)
                .setName("Alisa")
                .build();
        System.out.println(child1);

        Person personTwo = new Person("Andre", "Guarani");
        personTwo.setAddress("Italy");
        System.out.println(personTwo);
        System.out.println("hasAge: " + personTwo.hasAge());
        System.out.println("hasAddress: " + personTwo.hasAddress());

    }
}
