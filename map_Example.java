package Pratice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class map_Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kimcoding", "javalee", "ingikim", "kimcoding");
        names.stream()
                .map(s -> s.toUpperCase())
                .forEach(n->System.out.println(n));

        List<String> list = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

            list.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("=".repeat(25));

            list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));


    }
}
//        Stream<String[]> stringArraysStream = Stream.of(
//                newString[]{"hello", "world", "java"},
//                newString[]{"code", "states"});

//        stringArraysStream.flatMap(Arrays::stream).forEach(System.out::println);

