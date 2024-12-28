package Homework_4_solitaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        List<Cards> deck = new ArrayList<>();

        for (String suit : suits){
            for (String rank : ranks){
                deck.add(new Cards(rank, suit));
            }
        }

        Collections.shuffle(deck);
        Stack<Cards> stack = new Stack<>();

        for (Cards card : deck) {
            stack.push(card);
        }

        while (stack.size() > 4) {
            if (stack.peek().suit.equals(stack.get(stack.size() - 2).suit)) {
                stack.pop();
                stack.remove(stack.size() - 1);
            } else {
                break;
            }
        }

        if (stack.size() == 4) {
            System.out.println("You win");
        } else {
            System.out.println("Unlucky");
        }

        System.out.println("Cards left: " + stack);
    }
}
