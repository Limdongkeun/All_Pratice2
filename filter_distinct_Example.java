package Pratice2;

import java.util.Arrays;
import java.util.List;

public class filter_distinct_Example {
    public static void main(String[] args) throws Exception {
        List<String> names = Arrays.asList("김코딩", "이자바", "김인기", "김코딩");

        names.stream()
                .distinct() //중복제거
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("김")) //필터링
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .distinct() //중복제거
                .filter(n -> n.startsWith("김")) //필터링
                .forEach(n -> System.out.println(n));
    }
}
