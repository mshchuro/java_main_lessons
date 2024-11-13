package telran.lesson1.lesson1_practice;

public class Cat extends Animal{

    public Cat(String name, String color, int age, boolean isHungry) {
        super(name, color, age, isHungry);
    }

    public void meow() {
        System.out.println("Meow");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        super.sayHello();
        meow();
    }
}
