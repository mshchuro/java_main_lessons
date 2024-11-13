package telran.lesson1.lesson1_summary;

public class PersonApp {

    public static void main(String[] args) {

        Person personOne = new Person("Alex", "Alexey", 30, "alex@gmail.com");
        Person personTwo = new Person("Max", "Maximov", 25, "max@gmail.com");
//        personTwo.setAge(20);
//        personOne.setAge(61);
        Passport onePassport = new Passport("5555555", "2020-10-10", "2030-10-10");
        Passport twoPassport = new Passport("4444444", "2010-05-05", "2010-05-05");

        Passport olegPassport = new Passport("222222", "2011-07-05", "2011-07-75");
        Person personThree = new Person("Oleg", "Olegov", 20, "oleg@gmail.com", olegPassport);

        personOne.setPassport(onePassport);
        personTwo.setPassport(twoPassport);

        Person[] people = {personOne, personTwo};

        //for(TypeElementOfArray nameVariable : array)
        //   в каждой итерации цикла , в переменную nameVariable
        //   будет записываться очередной элемент массива
        for (Person person : people) { // person = people[0]; person = people[1] etc...
            String info = person.getInfo();
            System.out.println(info);
//            System.out.println("Person : " + person.getName() + " " + person.getSurname() +
//                    " with age " + person.getAge() + " , contact email " + person.getEmail());
        }
    }
}
