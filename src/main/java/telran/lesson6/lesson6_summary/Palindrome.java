package telran.lesson6.lesson6_summary;

//1. Напишите метод, чтобы проверить, является ли данная строка палиндромом. ~ ABCDCBA, madam, racecar



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        String string = "ABCDCBA";
        String string1 = "madam";
        String string2 = "racecar";

        System.out.println(isPalindrome(string));
        System.out.println(isPalindrome(string1));
        System.out.println(isPalindrome(string2));

    }

    private static boolean isPalindrome (String string) {

        char[] charArray = string.toCharArray();
        int arrayLength = charArray.length - 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray[arrayLength - i]) {
                return false;
            }
        }
        return true;
    }
}