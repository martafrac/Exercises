package tutorial.objectsandpackages;

public class Main {
    public static void main(String[] args) {
        Ex1Human human1 = new Ex1Human(23, 56.4, 185, "Alan", false);
        Rectangle r= new Rectangle(3,4);
        System.out.println("age: " + human1.getAge() + " height: " + human1.getHeight() + " name: " + human1.getName() + " is male? " + human1.isMale);

        System.out.println("Circumference is " +r.countCircumference());
        System.out.println("Diagonal is " + r.countDiagonal());
        System.out.println("Field is " + r.countField());

    }
}
