package telran.lesson10;

public class EqualsExample {

    public static void main(String[] args) {
        int one = 10;
        int two = 10;
        boolean isEquals = one == two;

        Integer three = Integer.valueOf(10);
        boolean isEqualsRef = one == three;

        Dog dogOne = new Dog();
        Dog dogTwo = new Dog();
        dogOne.setName("Tuzik");
        dogTwo.setName("Tuzik");
        //Для ссылочных типов данных, сравнение через == сравнивает
        //ссылки на объекты, и объекты будут равны, только если
        //в обоих переменных ссылка на один и тот же объект
        boolean b = dogOne == dogTwo;
        if (dogOne == dogTwo) {
            System.out.println("They are equals");
        }

        //Для правильного сравнение объектов используется equals
        if (dogOne.equals(dogTwo)) {
            System.out.println("They are equals");
        }
    }
}
