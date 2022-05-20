package Pratice2;
import java.util.Scanner;
enum Level{
    LOW, MEDIUM,HIGH
}

public class Enum_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Level level = Level.HIGH;

        switch (level){
            case LOW:
                System.out.println("LOW");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High");
                break;
        }
    }
}
