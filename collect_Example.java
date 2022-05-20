package Pratice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Students {
    public enum Gender {Male, Female};
    private String name;
    private int score;
    private Gender gender;

    public Students(String name, int score, Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }
}

public class collect_Example {
    public static void main(String[] args) throws Exception {
        List<Students> totalList = Arrays.asList(
                new Students("김코딩", 10, Students.Gender.Male),
                new Students("김인기", 8, Students.Gender.Male),
                new Students("이자바", 9, Students.Gender.Female),
                new Students("최민선", 10, Students.Gender.Female)
        );

        List<Students> maleList = totalList.stream()
                .filter(s -> s.getGender() == Students.Gender.Male)
                .collect(Collectors.toList());

        maleList.stream().forEach(n->System.out.println(n.getName()));

        Set<Students> femaleSet = totalList.stream()
                .filter(s -> s.getGender() == Students.Gender.Female)
                .collect(Collectors.toCollection(HashSet:: new));

        femaleSet.stream().forEach(n->System.out.println(n.getName()));
    }
}
