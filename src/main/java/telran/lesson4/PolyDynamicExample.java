package telran.lesson4;

public class PolyDynamicExample {
    public static void main(String[] args) {
        Parent Alex = new Parent("Alex");
        Parent Egor = new Child("Egor");
        Parent Baby = new Baby("Baby");

        Parent[] people = {Alex, Egor, Baby};

        //Parent -> Child -> Baby

        //Полиморфизм - "множество форм при единой реализации", Работа с различными объектами
        //через их общие методы, без знания и понимания о внутренней структуре объекта

        for (Parent person : people) {
            //sayGreetings - вызывается у типа данных Parent
            //Во время выполнения программы, будет определено, какую реализацию метода
            //sayGreetings нужно вызать из класса родителя или из какого класса наследника
            //это будет определено на основе типа объекта их этой переменной
            //Это динамический полиморфизм!
            person.sayGreetings();
            person.sayHello();

            //Поиск подходящий меодов идет снизу от наследника, вверх к родителю
            //Baby (method from this class) + method from Child + Parent : sayGreetings
            //Child (method from this class) + method from Parent : sayGreetings from Child
            //Parent (method from this class) : sayGreetings

            //sayHello
            //Baby (method from this class) -> Child -> Parent : sayHello from Parent
        }
    }
}
