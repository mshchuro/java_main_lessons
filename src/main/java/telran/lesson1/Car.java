package telran.lesson1;

// Класс - это чертеж для создания объектов
// Объект - это то, что создаем на основании класса
//UpperCamelCase - for class name, lowerCamelCase - for method, variables

public class Car {
    //Характеристики объекта, поля класса, свойства объекта, состояние объекта
    //Переменные класса
    String model;

    String color;

    //Методы описывают поведение объекта
    void startEngine() {
        System.out.println("Start engine for model " + model);
    }
}

