package Pratice2;

class Basket<T>{
    private T t;


    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}


public class GenericTest {
    public static void main(String[] args) {
        Basket<String> basket1 = new Basket<String>();
        basket1.set("String");
        String str = basket1.get();

        System.out.println(basket1.get());

        Basket<Integer> basket2 = new Basket<Integer>();
        basket2.set(1);
        int value = basket2.get();
        System.out.println(basket2.get());


    }
}
