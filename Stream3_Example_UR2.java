package Pratice2;

import java.util.List;

public class Stream3_Example_UR2 {
    public static void main(String[] args) {
        //명령형 프로그래밍
        List<Integer> number = List.of(1,3,6,7,8,11);
        int sum =0;

        for(Integer num : number){
            if(num > 4 && (num % 2 == 0)){
                sum += num;
            }
        }
        System.out.println("# 명령형 프로그래밍 " + sum);

        System.out.println("=".repeat(25));

        //선언형 프로그래밍
        List<Integer> numbers1 = List.of(1,3,6,7,8,11);

        int sum1 =
                numbers1.stream()
                        .filter(numbers -> numbers > 4 && (numbers % 2 ==0))
                        .mapToInt(numbers -> numbers) // numbers를 받아서 (int)numbers로 바꿔주는것
                        .sum();

        System.out.println("# 선언형 프로그래밍 " + sum1 );

    }
}
