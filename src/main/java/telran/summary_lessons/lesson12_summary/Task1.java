package telran.summary_lessons.lesson12_summary;

import java.util.*;

//1. Имеется класс Dog c полями:
//
//public class Dog {
//    private String name;
//    private int age;
//    private String colour;
//    private boolean isHungry;
//}
//
//На основе тестового списка экземпляров данного класса List<Dog> dogs
//a. Получить Map<String, Boolean> имя / информация, голодна ли собака
//b. Получить Map<String, Long> цвет / количество собак данного цвета
//c. Получить Map<String, Set<String>> цвет / список имен собак данного цвета
public class Task1 {

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog("Max", 12, "Black", false),
                                 new Dog("Bob", 13, "White", true),
                                 new Dog("Laika", 19, "White", false),
                                 new Dog("Alex", 18, "Yellow", true));
        //a
        Map<String, Boolean> mapOne = new HashMap<>();
        dogs.forEach(dogOne -> mapOne.put(dogOne.getName(), dogOne.isHungry));
        System.out.println(mapOne);

        //b
        Map<String, Long> mapTwo = new HashMap<>();

        for (int i = 0; i < dogs.size(); i++) {
            String colour = dogs.get(i).getColour();
            Long count = mapTwo.getOrDefault(colour, 0L);
            mapTwo.put(colour, ++count);
        }
        System.out.println(mapTwo);

        //c Получить Map<String, Set<String>> цвет / список имен собак данного цвета
        Map<String, Set<String>> mapThree = new HashMap<>();

        for (int i = 0; i < dogs.size(); i++) {
            String colour = dogs.get(i).getColour();
            Set<String> names =  mapThree.getOrDefault(colour, new HashSet<>());

            names.add(dogs.get(i).getName());
            mapThree.put(colour, names);
        }
        System.out.println(mapThree);
    }

    public static class Dog {
        private String name;

        private int age;

        private String colour;

        private boolean isHungry;

        public Dog(String name, int age, String colour, boolean isHungry) {
            this.name = name;
            this.age = age;
            this.colour = colour;
            this.isHungry = isHungry;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getColour() {
            return colour;
        }

        public boolean isHungry() {
            return isHungry;
        }
    }
}
