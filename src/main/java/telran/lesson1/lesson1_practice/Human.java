package telran.lesson1.lesson1_practice;

public class Human extends Creature{

    public Human(String name) {
        super(name);
    }

    public void feedCat(Cat cat) {
        cat.feed();
    }

    public void feedCat(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].feed();
        }
    }

    public void walk(Animal animal) {
        animal.setHungry(true);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
