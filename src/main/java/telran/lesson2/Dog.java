package telran.lesson2;

//final в сигнатуре класса запрещает его наследовать
public class Dog {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Woof!");
    }

    //final - запрещает переобпределение метода в наследниках
    public final void run() {
        System.out.println("Dog run!");
    }
}