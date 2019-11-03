package tutorial.loops;

public class Ex7 {
    public static void main(String[] args) {
        int[] tab= {1,2,3,4,5,6,7};
        printTable(tab);
    }
    private static void printTable(int[] tab){
        System.out.print("[");
        for(int num: tab){

            System.out.print(num+"," );
        }
        System.out.println("]");

    }
}
