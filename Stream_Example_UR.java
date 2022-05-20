package Pratice2;
//import java.util.Arrays.asList(); List객체를 생성할 때 요소를 제거 할 수 없는 고정된 목록으로 생성하기때문

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }
}

public class Stream_Example_UR {
    public static void main(String[] args) throws Exception {
        List<Student> list = Arrays.asList(
                new Student("김코딩", 95),
                new Student("이자바", 92)
        );


        Stream<Student> stream = list.stream();
        stream.forEach( s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name+ " - " +score);
        });
    }
}
