package tutorial.interfaceEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Figure[] figures = new Figure[3];


        Scanner sc = new Scanner(System.in);
        getCircle(figures, sc);
        getTrangle(figures, sc);
        getRectangle(figures, sc);

        for (Figure figure:
             figures) {
            System.out.println("Area is" + figure.getArea()+" " +"perimeter"+figure.getPerimetr());
        }
    }

    private static void getRectangle(Figure[] figures, Scanner sc) {
        System.out.println("Write two sides of rectangle");
        int c = sc.nextInt();
        int d = sc.nextInt();
        figures[2] = new Rectangle(c, d);
    }

    private static void getTrangle(Figure[] figures, Scanner sc) {
        System.out.println("Write two sides of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        figures[1] = new Triangle(a, b);
    }

    private static void getCircle(Figure[] figures, Scanner sc) {
        System.out.println("Write radius of circle ");
        int r = sc.nextInt();
        figures[0] = new Circle(r);
    }
}
