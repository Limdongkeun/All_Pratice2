package Pratice2;

interface Name {
    String name = "Kim Coding";
    void getName();
}

//class TestClass implements Name {
//    //TestClass 클래스는 Name 인터페이스를 구현받아 작성합니다.
//    public void getName() {
//        System.out.print("내 이름은 "+ name);
//    }
//}

public class noNameInClass_Example {
    public static void main(String[] args) {
//        TestClass obj = new TestClass();
//        obj.getName();

        Name obj = new Name() {
            public void getName() {
                System.out.println("내 이름은" + name);
            }
        };
        obj.getName();
    }
}
