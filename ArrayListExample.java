package Pratice2;

//import 해야 쓸수있음
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java"); // String 객체 저장/추가
        list.add("egg");
        list.add("tree");

        int size = list.size(); // 저장된 총 객체 수 얻기
        System.out.println(list.size()); //3
        String skill = list.get(0); // 0번 인덱스의 객체 얻기
        System.out.println(list.get(0));

        for(int i = 0; i < list.size(); i++){// 저장된 총 객체 수 만큼 조회
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }

        list.remove(0); // 0번 인덱스 객체 삭제
    }
}