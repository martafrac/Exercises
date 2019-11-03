package tutorial.loops;

import java.util.Scanner;

public class Ex6 {
    Scanner sc = new Scanner(System.in);

    private int x;

    public Ex6() {
        this.x = sc.nextInt();
    }

    private int[] oneDimension() {
        return  new int[x];

    }

    private int[][] twoDimension() {
       return new int[x][x];
    }

}
