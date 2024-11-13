package telran.lesson1.lesson1_practice;

public class House {
    public static void main(String[] args) {
        Cat catOne = new Cat("Tom");
        System.out.println(catOne);

        Cat catTwo = new Cat("Barsik", "White", 8, true);
        System.out.println(catTwo);

        Robot robotOne = new Robot("Robot", "This is a super robot");
        Robot robotTwo = new Robot("Robot1", "This is a super robot");
        Robot robotThree = new Robot("Robot3", "This is a super robot");
        Robot robotFour = new Robot("Robot4", "This is a super robot");
        Robot robotFive = new Robot("Robot5", "This is a super robot");

        robotOne.printCurrentRobotInfo();
        Robot.printTotalRobotCount();

        Cat catFive = new Cat("Tom");
        Cat catSix = new Cat("Barsik");
        Cat catThree = new Cat("Murka");

        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println(catThree);

        Cat[] cats = {catOne, catTwo, catThree};

        Human humanOne = new Human("Roman");
        humanOne.feedCat(catOne);
        humanOne.feedCat(cats);

        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println(catThree);

        Dog dog = new Dog("Andrew", "red", 5, true);
        dog.sayHello();
        catOne.sayHello();

        humanOne.walk(catOne);
        System.out.println(catOne);
    }
}

