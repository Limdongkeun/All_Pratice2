package Pratice2;
class Car{
    String name;
    String gear;
    int door;

    public Car(String name, String gear, int door){
        this.name = name;
        this.gear = gear;
        this.door = door;
    }
    Car(){
        this("소나타","오토",4);
    }

        void printModel(){
            System.out.println("차는 " + this.name + "기어는 " + this.gear + "문은 " + door + "개");
        }
}


public class ThisTest_Example {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.printModel();

        Car c2 = new Car("제네시스", "오토", 4);
        c2.printModel();

    }
}
