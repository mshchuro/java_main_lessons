package telran.lesson7.summary;

import java.util.Arrays;
import java.util.List;

public class HWR {

    public static void main(String[] args) {
            List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println(findMax(integerList));
        System.out.println(findMin(integerList));
    }

    private static int findMax(List<Integer> integerList) {
        int max = integerList.get(0);

        for (Integer value : integerList) {
            max = Math.max(max, value);
//            if (value > max) {
//                max = value;
//            }
        }
        return max;
    }

    private static int findMin(List<Integer> integerList) {
        int min = integerList.get(0);

        for (Integer value : integerList) {
            min = Math.min(min, value);
        }
        return min;
    }
}
