package tutorial.calculate.recursive;

public class Rekursiv_ex1 {
    public static void main(String[] args) {
        Rekursiv_ex1 adder = new Rekursiv_ex1();

        int[] tab = {3, 4,5};
        int number = adder.sum(tab,tab.length);
        System.out.println(number);
    }

    public int sum(int[] tab, int index) {
        int sum = 0;
        if (index > 0) {
            sum = sum(tab,--index)+tab[index];
        }
        return sum;
    }


}