package patterns.streamHomework.first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>() {{
            add(new Person("Ivan", 10));
            add(new Person("Andrew", 28));
            add(new Person("Petr", 33));
            add(new Person("Bob", 1));
        }};

        Comparator<Person> byName = Comparator.comparing(Person::getName);
        persons.sort(byName);
        persons.forEach(System.out::println);

        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        persons.sort(byAge);
        persons.forEach(System.out::println);

    }
}
