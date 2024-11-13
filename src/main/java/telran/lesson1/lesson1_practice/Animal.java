package telran.lesson1.lesson1_practice;

public class Animal extends Creature{

    private String color;

    private int age;

    private boolean isHungry;

    public void sayHello() {
        System.out.println(getName());
    }

    public void feed() {
        this.isHungry = false;
    }

    public Animal(String name, String color, int age, boolean isHungry) {
        super(name);
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Animal(String name) {
        super(name);
        this.color = "white";
        this.age = 1;
        this.isHungry = true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }
}
