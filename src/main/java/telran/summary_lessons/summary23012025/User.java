package telran.summary_lessons.summary23012025;

import java.util.Objects;

public class User implements Cloneable{

    private String name;

    private String surname;

    private int age;

    private Adress adress;

    public User(String name, String surname, int age, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(adress, user.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, adress);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Adress city = new Adress("NY city");
        User user = new User("Max", "Smith", 24, city);

        //User cody = user
        //User copy = new User(user.getName(), user.getSurname(), user.getAge());
        User copy = (User) user.clone();

        System.out.println(user);
        System.out.println(copy);

        System.out.println(user == copy);
        System.out.println(user.equals(copy));

        System.out.println(city == copy.getAdress());
        System.out.println(city.equals(copy.getAdress()));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User cloned =(User) super.clone();
        Adress clonedAdress = (Adress) adress.clone();
        cloned.setAdress(clonedAdress);
        return super.clone();
    }
}
