package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AverageAge {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Riya", 42),
                new Person("Charlie", 35)
        );

        double avgAge = persons.stream()
                        .mapToInt(Person::getAge)
                                .average()
                                        .orElse(0);

        System.out.println(avgAge);
    }
}

class Person{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
