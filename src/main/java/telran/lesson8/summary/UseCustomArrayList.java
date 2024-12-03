package telran.lesson8.summary;
import java.util.Iterator;

public class UseCustomArrayList {

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList(new String[]{"A", "B", "C", "D", "E"});

        for (String element : customArrayList) {
            System.out.print(element + " ");
        }

        // A B C D E
        // E D C B A

//        Iterator<String> iterator = customArrayList.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());


    }


}