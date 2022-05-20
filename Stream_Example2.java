package Pratice2;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Example2 {
    public static void main(String[] args) {
//        IntStream intStream3 = new Random().ints(); //무한 난수 스트림
//        intStream3.limit(5).forEach(System.out::println); //5개만 나오도록 자름
        //위아래 같음

        IntStream intStream3 = new Random().ints(5);
        intStream3.forEach(System.out::println); //5개만 나오도록 자름

        //iterate(T seed, UnaryOperator f) : 단항연산자
        Stream<Integer> intstream4 = Stream.iterate(0,n-> n +2);
        intstream4.limit(5).forEach(System.out::println);

        //generate(Supplier s) : 주기만 하는것 입력x 출력o
        Stream<Integer> oneStream = Stream.generate(()->1);
        oneStream.limit(10).forEach(System.out::print);
    }
}
