package lesson31_lambda_intro.streamAPI_intro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonStreamTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Max", 30));
        personList.add(new Person("Anna", 25));
        personList.add(new Person("Tom", 20));
        personList.add(new Person("Kat", 20));
        personList.add(new Person("Dan", 25));
        personList.add(new Person("Nick", 21));
        personList.add(new Person("Dima", 33));

        // print persons age = 20
        personList.stream()
                .filter(p -> p.getAge()== 20)
                .forEach(p -> System.out.println(p));
        System.out.println();
        // print persons name, age = 20
        personList.stream()
                .filter(p -> p.getAge()== 20)
                .map(Person::getName)
                .forEach(System.out::println);
        System.out.println();
        // average age
        double average;
        average = personList.stream()
                .map(p -> p.getAge())
                .reduce((i1, i2) -> i1 + i2)
                .get() / personList.size();
        System.out.println("Average = " + average);
        System.out.println();
        // find oldest person
        Person oldest;
        oldest = personList.stream()
                .max(Comparator.comparingInt((p) -> p.getAge())) // Comparator.comparingInt(Person::getAge)
                .get();
        System.out.println("Oldest = " + oldest);
        System.out.println();
        // drinkers
        List<Person> drinkers;
        drinkers = personList.stream()
                .filter(p -> p.getAge() >= 21)
                .collect(Collectors.toList());
        System.out.println("Drinkers = " + drinkers);
        System.out.println();
        // all persons group by age
        System.out.println("Grouping by age: ");
        Map<Integer, String> ageStat =
        personList.stream()
                .collect(Collectors.toMap(
                        Person::getAge, // how  to get key
                        Person::getName, // how to get value
                        (s1, s2) -> s1 + " and " + s2 // join values
                ));
        System.out.println(ageStat);
        System.out.println();
        //
        System.out.println("Grouping by age: ");
        Map<Integer, List<Person>> statMap;
        statMap = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        statMap.entrySet().forEach(System.out::print
        );
    }
}
