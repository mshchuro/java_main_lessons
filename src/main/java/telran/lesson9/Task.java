package telran.lesson9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task {

    public static void main(String[] args) {
        String text = "agsfdfgdsdytsqdtydjhgffdyufyuafyfqyufdyuwfasxsajkhdg";
        //1
//        Set<Character> set = new HashSet<>();
//        char[] charText = text.toCharArray();
//
//        for (int i = 0; i < charText.length ; i++) {
//            set.add(charText[i]);
//        }
//        System.out.println(set.size() + " unique characters");
//        for (Character value : set) {
//            System.out.print(value + " ");
//        }

//        System.out.println();
        //2
        Set<Character> set1 = new HashSet<>();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            //Если элемент добавлен, то будет возвращено true
            //если в сете уже есть такой элемент и новый не будет добавлен
            //то метод add вернет false
            if (!set1.contains(c)) {
                set1.add(c);
            } else {
                count++;
            }

//            if (!set1.add(c)){
//                count++;
//            }
        }
        System.out.println(set1);
        System.out.println("Number of duplicates = " + count);
    }
}
