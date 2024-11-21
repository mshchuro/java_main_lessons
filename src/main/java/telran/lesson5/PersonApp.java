package telran.lesson5;

public class PersonApp {

    public static void main(String[] args) {
        Person max = new Person("Max", 20);
        System.out.println(max);
        System.out.println(max.name());
        System.out.println(max.age());
    }
}
