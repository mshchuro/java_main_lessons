package telran.lesson12;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {

    public static void main(String[] args) {
        String st = "asfdsaaaaghfdsytrd,.mneoci=jid.,axmcn";

        HashMap<Character, Integer> hashMap = new HashMap<>();

//        for (int i = 0; i < st.length(); i++) {
//            char c = st.charAt(i);
//            if (hashMap.containsKey(c)) {
//                int value = hashMap.get(c);
//                value++;
//                hashMap.put(c, value);
//            } else {
//                hashMap.put(c, 1);
//            }
//        }

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            int value = hashMap.getOrDefault(c, 0);
            hashMap.put(c, ++value);
        }

        //1
        hashMap.forEach((character, integer) -> System.out.println(character + " " + integer));

        //2
        System.out.println(hashMap);
    }
}
