package tutorial.objectsandpackages;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    int countField() {
        return width* length;

    }
    int countCircumference(){
        return 2*width+ 2*length;
    }
    double countDiagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(length,2));
    }
}
