package telran.lesson2.examplethree;

public class FruitApp {
    public static void main(String[] args) {
       Apple apple = new Apple("apple", 150, "red");
       Banana banana = new Banana("banana", 200, "green");
       PineApple pineApple = new PineApple("pineapple", 450, "yellow");
       Apple appleTwo = new Apple("Apple", 300);
       Banana banana1 = new Banana("banana", 150, "yellow", "USA");
       Lemon lemon = new Lemon("lemon", 120, "yellow");

       Fruit[] fruits = {apple, appleTwo, banana, pineApple, lemon};
        for (Fruit fruit : fruits) {
            printFruit(fruit);
            if (fruit.isRipe()) {
                System.out.println("Fruit " + fruit.getTitle() + " is ripe");
            } else {
                System.out.println("Fruit " + fruit.getTitle() + " is not ripe");
            }
        }
    }

    private static void printFruit(Fruit fruit) {
        System.out.println(fruit);
    }
}
