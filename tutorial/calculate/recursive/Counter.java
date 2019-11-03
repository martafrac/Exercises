package tutorial.calculate.recursive;

public class Counter {
    private String name;
    private int counter = 0;

    public Counter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }

}
