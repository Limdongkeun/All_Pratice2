package Pratice2;
class Outer2 { //외부 클래스
    int num = 5;
    void test2() {
        int num2 = 6;
        class LocalInClass { //지역 내부 클래스
            void getPrint() {
                System.out.println(num);
                System.out.println(num2);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}

public class localInClass_Example {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test2();
    }

}
