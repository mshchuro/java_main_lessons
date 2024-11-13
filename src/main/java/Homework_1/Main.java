package Homework_1;

public class Main {
    public static void main(String[] args) {

        Person personOne = new Person();
        Person personTwo = new Person("Max", "Shchurovskiy", 24);

        personOne.setName("Alex");
        personOne.setFullName("Orlov");
        personOne.setAge(30);

        personOne.move();
        personOne.talk();

        System.out.println();

        personTwo.move();
        personTwo.talk();

        System.out.println();

        Phone phoneOne = new Phone(1234, "iPhone", 100);
        Phone phoneTwo = new Phone(4321, "Samsung", 99);
        Phone phoneThree = new Phone(3310, "Nokia", 500);

        System.out.println("First phone is " + phoneOne.getNumber()+ " " + phoneOne.getModel()+ " " + phoneOne.getWeight());
        System.out.println("Second phone is " + phoneTwo.getNumber()+ " " + phoneTwo.getModel()+ " " + phoneTwo.getWeight());
        System.out.println("Third phone is " + phoneThree.getNumber()+ " " + phoneThree.getModel()+ " " + phoneThree.getWeight());

        System.out.println();

        phoneOne.receiveCall(personOne.getName());
        phoneTwo.receiveCall(personTwo.getName());

        System.out.println();

        System.out.println(phoneOne.getNumber());
        System.out.println(phoneTwo.getNumber());
        System.out.println(phoneThree.getNumber());

    }
}
