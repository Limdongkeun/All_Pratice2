package Pratice2;
interface Myfunction{ // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 한다
    //public abstract int max(int a, int b);
    int max(int a, int b); // 위에랑 같은거
}
interface Lambda{
    void show(String str);
}


public class Lambda_Example {
    public static void main(String[] args) {
//        Myfunction f = new Myfunction() {
//            @Override
//            public int max(int a, int b) {  //오버라이딩 - 접근제어자는 좁게 못바꾼다
//                return a > b? a:b;
//            }
//        };
        //위에 쓴 코드를 람다식으로 바꾼다
        Myfunction f = (a,b) -> a>b ? a:b; // 람다식. 익명객체  함수형 인터페이스 매개변수의 수나 타입과 잃치해야한다
//        Myfunction f = (a,b) -> Math.max(a, b); // 위에 식을 한 번 변한거
//        Myfunction f = Math::max; // 람다식. 클래스이름 :: 메서드
        int value = f.max(3,5);  //함수형 인터페이스
        System.out.println("value " + value );


        Lambda a = str -> System.out.println(str);
//        Lambda a = System.out::println;
        a.show("hi lambda");




    }
}
