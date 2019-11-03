package tutorial.loops;

public class Ex3 {
    public static void main(String[] args) {
        int[] tab = {1, 56, 22, 61, 32, 63, 48, 4};
        sortBubble(tab);
        printTable(tab);
    }

    protected static void sortBubble(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

    private static void printTable(int[] tab) {
        for (int num : tab) {
            System.out.println(num);
        }
    }
}
