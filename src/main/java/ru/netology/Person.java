package ru.netology;

import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public void happyBirthday() {
        if (age != null)
        this.age++;
    }

    @Override
    public String toString() {
        return "\nPerson: " +
                "\nname: " + name + "\nsurname: " + surname + "\nage: " + age + "\naddress: " + address;
    }

    @Override
    public int hashCode() {
        return Objects.
                hash(getName(), getSurname(), getAge(), getAddress());
    }

    public PersonBuilder newChildBuilder(int age) {
        return new PersonBuilder().setSurname(name).setAge(age).setAddress(address);
    }

    public static class PersonBuilder {
        protected String name;
        protected String surname;
        protected Integer age;
        protected String address;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            if (name == null | surname == null) {
                throw new IllegalArgumentException("Name and surname cannot be empty");
            }
            if (age!=null) {
                if (age < 0 | age >= 100) {
                    throw new IllegalArgumentException("Age is incorrect");
                }
            } else {
                    System.out.println("Age not specified");
                }
            return new Person(this);
        }

    }
}
