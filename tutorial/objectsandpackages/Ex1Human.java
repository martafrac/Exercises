package tutorial.objectsandpackages;

public class Ex1Human {
    int age;
    double weight;
    int height;
    String name;
    boolean isMale;

    public Ex1Human(int age, double weight, int height, String name, boolean isMale) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }


    public int getHeight() {
        return height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString() {
        return "Ex1Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}

