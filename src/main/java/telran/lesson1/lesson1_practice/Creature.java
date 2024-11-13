package telran.lesson1.lesson1_practice;

public abstract class Creature {
    private String name;

    public abstract void sayHello();

    public Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
