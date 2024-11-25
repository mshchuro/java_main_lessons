package telran.lesson7.lesson7_summary;

//Имеется колода карт, сохраненная в виде списка.
//Написать метод по случайному перемешиванию карт колоды.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        List<Integer> cards = new ArrayList<>();
        cards.add(1);
        cards.add(2);
        cards.add(3);
        cards.add(4);
        cards.add(5);
        cards.add(6);
        cards.add(7);
        cards.add(8);
        cards.add(9);
        cards.add(10);

        System.out.println("Original cards: " + cards);

        System.out.println(shuffle(cards));

        System.out.println(cards);
    }

    private static List<Integer> shuffle (List<Integer> cards) {
        List<Integer> victim = new ArrayList<>(cards);
        List<Integer> newCards = new ArrayList<>();
        Random random = new Random();

        int size = victim.size();
        for (int i = 0; i < size; i++){
            int rand = random.nextInt(victim.size());
            newCards.add(victim.remove(rand));
        }
        return newCards;
    }
}
