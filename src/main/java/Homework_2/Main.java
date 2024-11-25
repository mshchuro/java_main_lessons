package Homework_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2.
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) * 2 + " ");
        }
        System.out.println();

        //2. у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String.
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("My");
        strings.add("Name");
        strings.add("Is");
        strings.add("Max");

        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i).length() + " ");
        }
        System.out.println();

        //3. у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа.
        List<Integer> integers2 = new ArrayList<>();
        integers2.add(1);
        integers2.add(2);
        integers2.add(3);
        integers2.add(4);
        integers2.add(5);

        for (int i = 0; i < integers2.size(); i++) {
            if (integers2.get(i) % 2 != 0) {
                System.out.print(integers2.get(i) + " ");
            }
        }
        System.out.println();

        //4. у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
        List<String> strings2 = new ArrayList<>();
        strings2.add("Hello");
        strings2.add("Hello");
        strings2.add("Name");
        strings2.add("Is");
        strings2.add("Max");

        List<String> noDuplicates = new ArrayList<>();

        for (String str : strings2) {
            if (!noDuplicates.contains(str)) {
                noDuplicates.add(str);
            }
        }

        for (String str : noDuplicates) {
            System.out.print(str + " ");
        }
        System.out.println();

        //5. у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
        List<String> strings3 = new ArrayList<>();
        strings3.add("Hello");
        strings3.add("My");
        strings3.add("Name");
        strings3.add("Is");
        strings3.add("Max");

        for (String str : strings3) {
            System.out.print(str + " ");
        }
        System.out.println();

        // 6.у вас есть список значений int и вы должны вернуть их максимум или минимум
        List<Integer> integers3 = new ArrayList<>();
        integers3.add(1);
        integers3.add(2);
        integers3.add(3);
        integers3.add(4);
        integers3.add(5);

        System.out.println("Min num is: " + findMinInt(integers3) + " ");
        System.out.println("Max num is: " + findMaxInt(integers3));

        //7. у вас есть список String и вы должны вернуть максимальную длину
        List<String> strings4 = new ArrayList<>();
        strings4.add("Hello");
        strings4.add("My");
        strings4.add("Name");
        strings4.add("Is");
        strings4.add("Max");

        System.out.println(findMaxString(strings4));
        System.out.println(findMinString(strings4));

    }

    private static int findMaxInt(List<Integer> integers3) {
        int maxNum = integers3.get(0);

        for (Integer min : integers3) {
            maxNum = Math.max(maxNum, min);
        }
        return maxNum;
    }

    private static int findMinInt(List<Integer> integers3) {
        int minNum = integers3.get(0);

        for (Integer min : integers3) {
            minNum = Math.min(minNum, min);
        }
        return minNum;
    }

    private static int findMaxString(List<String> strings4) {
        int maxString = strings4.get(0).length();

        for (String max : strings4) {
            maxString = Math.max(maxString, max.length());
        }
        return maxString;
    }

    private static int findMinString(List<String> strings4) {
        int minString = strings4.get(0).length();

        for (String min : strings4) {
            minString = Math.min(minString, min.length());
        }
        return minString;
    }
}
