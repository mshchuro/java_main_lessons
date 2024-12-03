package telran.lesson9.lesson9_summary;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Data data1 = new Data(1, "A");
        Data data2 = new Data(2, "B");
        Data data3 = new Data(3, "C");

//        Set<Data> set1 = new TreeSet<>();
//        set1.add(data1);
//        set1.add(data2);
//        set1.add(data3);

        Set<Data> set2 = new HashSet<>();
        set2.add(data1);
        set2.add(data2);
        set2.add(data3);
        System.out.println(set2);

        Set<String> stringSet = Set.of("A", "B", "C");

    }
}
