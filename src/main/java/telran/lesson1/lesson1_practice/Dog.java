package telran.lesson1.lesson1_practice;

public class Dog extends Animal{

    public Dog(String name, String color, int age, boolean isHungry) {
        super(name, color, age, isHungry);
    }

    public void bark() {
        System.out.println("Bark");
    }

    @Override
    public void sayHello() {
        super.sayHello();
        bark();
    }
}
