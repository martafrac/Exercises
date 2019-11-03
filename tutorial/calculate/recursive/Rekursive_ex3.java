package tutorial.calculate.recursive;

public class Rekursive_ex3 {
    public static void main(String[] args) {
        Rekursive_ex3 adder = new Rekursive_ex3();

        int number = adder.sum(10);
        System.out.println(number);
    }

    public int sum(int n) {
        if (n > 1) {
            return n + sum(n - 1);
        } else {
            return n;
        }
    }
}

