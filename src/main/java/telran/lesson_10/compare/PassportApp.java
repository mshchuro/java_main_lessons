package telran.lesson_10.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PassportApp {

    public static void main(String[] args) {
        List<Passport> passports = Arrays.asList(
                new Passport(333345),
                new Passport(123123),
                new Passport(876438),
                new Passport(110010));

        System.out.println("Before sort : ");
        printPassport(passports);

        Collections.sort(passports);

        System.out.println("After sort : ");
        printPassport(passports);
    }

    private static void printPassport(List<Passport> passports) {
        passports.forEach(System.out::println);
    }
}
