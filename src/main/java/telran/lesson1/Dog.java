package telran.lesson1;

public class Dog {
    //public - доступ везде (внутри класса и за его пределами, во всем приложении)
    //protected - доступ внутри класса, внутри пакета и в классах наследниках
    //default - доступ внутри класса и внутри пакета(отсутствие модификатора)
    //private - доступ только внутри класса

    private String name;

    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters and setter - get, set

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greetings(boolean isEnglish){
        if (isEnglish) {
            sayHello();
        } else {
            sayHallo();
        }
    }

    private void sayHello() {
        System.out.println("Hello");
    }

    private void sayHallo() {
        System.out.println("Hallo");
    }
}

