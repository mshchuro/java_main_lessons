package telran.lesson18.lesson18_summary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(100);
        int b = rnd.nextInt(100);
        System.out.println(a + " + " + b + "= ?");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String input = reader.readLine();
            int answer = Integer.parseInt(input);
            if (answer == sum(a, b)){
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int sum (int a, int b) {
        return a + b;
    }
}
