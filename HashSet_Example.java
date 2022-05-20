package Pratice2;
import java.util.*;


public class HashSet_Example {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<String>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Ruby");
        languages.add("Java");

        Iterator it = languages.iterator();
//        System.out.println(it.hasNext()); // true
//        System.out.println(it.next());   // Java

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}