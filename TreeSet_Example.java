package Pratice2;
import java.util.TreeSet;
public class TreeSet_Example {
    public static void main(String[] args) {
        TreeSet<String> workers = new TreeSet<>();
        TreeSet<Integer> nums = new TreeSet<>();


//        workers.add("Lee Java");
//        workers.add("Mee Java");
//        workers.add("Park Hacker");
//        workers.add("Kim Coding");


        nums.add(100);
        nums.add(75);
        nums.add(60);
        nums.add(55);
        nums.add(10);
        nums.add(40);
        nums.add(30);

//        System.out.println(workers);
//        System.out.println(workers.first()); // 가장 낮은 객체 (낮은 숫자)
//        System.out.println(workers.last());  // 가장 높은 객체 (높은 숫자)
//        System.out.println(workers.higher("Lee")); // 해당객체 바로 위 찾기
//        System.out.println(workers.lower("Lee")); // 해당객체 바로 아래 찾기
//        System.out.println(workers.subSet("Kim", "Park"));


        System.out.println(nums);
        System.out.println(nums.first()); // 가장 낮은 객체 (낮은 숫자)
        System.out.println(nums.last());  // 가장 높은 객체 (높은 숫자)
        System.out.println(nums.higher(70)); // 해당객체 바로 위 찾기
        System.out.println(nums.lower(40)); // 해당객체 바로 아래 찾기
        System.out.println(nums.subSet(30,75)); //앞에꺼부터 뒤에꺼 전까지 반환



    }
}
