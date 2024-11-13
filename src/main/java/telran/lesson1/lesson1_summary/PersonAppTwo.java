package telran.lesson1.lesson1_summary;

public class PersonAppTwo {
    public static void main(String[] args) {
        Person personOne = new Person("Alex", "Alexey", 30, "alex@gmail.com");
        Passport onePassport = new Passport("5555555", "2020-10-10", "2030-10-10");
        personOne.setPassport(onePassport);

        System.out.println(onePassport);

        personOne.showPassport();

//        String info = onePassport.getInfo();
//        System.out.println(info);

//        String infoTwo = onePassport.toString();
//        System.out.println(infoTwo);

//        System.out.println("Person : " + personOne.getName() + " " + personOne.getSurname() +
//                    " with age " + personOne.getAge() + " , contact email " + personOne.getEmail() +
//                " passport : " + personOne.getPassport().getNumber() + " valid  : " +
//                personOne.getPassport().getNumber());
    }
}
