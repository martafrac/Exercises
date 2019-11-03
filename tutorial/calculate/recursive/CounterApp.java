package tutorial.calculate.recursive;

import tutorial.calculate.recursive.Counter;

public class CounterApp {
    public static void main(String[] args) {
        Counter c1 = new Counter("Iterative");
        Counter c2 = new Counter("Recursive");
        iterative(c1);
        recursive(c2);
        print(c1);
        print(c2);

    }

    private static void iterative(Counter c) {
        while (c.getCounter() < 10) {
            c.increment();
        }
    }

    private static void recursive(Counter c) {
        if(c.getCounter()<5){
            c.increment();
            recursive(c);
        }
    }


    private static void print(Counter c) {
        System.out.println(c.getName() + c.getCounter());
    }
}
