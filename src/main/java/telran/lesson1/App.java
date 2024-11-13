package telran.lesson1;

public class App {
    public static void main(String[] args) {
        // new - создание объекта на основании какого либо класса
        Car carOne = new Car(); //#FFHH03 Car(model, color)
        carOne.model = "Audi";
        carOne.color = "Red";

        Car carTwo = new Car(); //#FFEE02 Car(model, color)
        carTwo.model = "BMW";
        carTwo.color = "Black";

        Car carThree = new Car(); //carOne and carThree still different objects
        carThree.model = "Audi";
        carThree.color = "Red";

        String model = carOne.model;
        System.out.println("Car one model is " + carOne.model + " ,car one color is " + carOne.color);

        carOne.startEngine();
        carTwo.startEngine();
    }
}
