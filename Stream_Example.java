package Pratice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Example {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream(); // list를 Stream으로 변환
        intStream.forEach(System.out::println);

        //stream은 1회용. stream에 대해 최종연산을 수행하면 닫히기 때문에 새로 만들어서 사용
        intStream = list.stream(); // list로부터 stream 생성
        intStream.forEach(System.out::print);
        System.out.println(" ");

        Stream<String> strstream = Stream.of("a","b","c");
        strstream.forEach(System.out::println);
        // 위에거를 길게 쓴거
        String[] strArr = new String[]{"a","b","c","d"};
        Stream<String> strstream2 = Stream.of(strArr);
//        strstream.forEach(System.out::println);

//        String[] strArr = {"a","b","c","d"};
//        Stream<String> strstream = Stream.of(strArr);
//        strstream.forEach(System.out::println);

        //숫자는 이걸 쓰자
        int[] intArr = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr);
        System.out.println("sum = "+intStream1.sum());
//        System.out.println("count = "+intStream1.count());
//        System.out.println("average = "+intStream1.average());

        //객체  스트림이라서 count밖에 없다
//        Integer[] intArr = {1,2,3,4,5};
//        Stream<Integer> intStream1 = Arrays.stream(intArr);
//        intStream1.forEach(System.out::println);®
//        System.out.println("conunt = " +intStream1.count());

    }
}
