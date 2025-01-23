package telran.lesson17.lesson17_summary;

/**
 * 1)
 * 	for (String s : strings) {
 * 		System.out.println(s);
 * 	    }
 *
 * 2)
 * 	public static List<String> method(List<String> strings) {
 * 		List<String> result = new ArrayList<>();
 * 		for (String s : strings) {
 * 			if (!result.contains(s)) {
 * 				result.add(s);
 *            }
 *        }
 * 		return result;
 *    }
 *
 * 3)
 * 	public static void feed(List<Cat> catList) {
 *         for (int i = 0; i < catList.size(); i++) {
 *             if (catList.get(i).isHungry()) {
 *                 catList.get(i).setHungry(false);
 *             }
 *         }
 *    }
 * 4)
 * 	List<Double> doubles = new ArrayList<>();
 * 	for (Double d : doubleList) {
 * 		if (d % 2 == 1) {
 * 			doubles.add(d);
 *        }
 *    }
 * 	System.out.println(doubles);
 *
 * 5)
 * 	String word = null;
 * 	for (String t : list){
 * 		if (t.length() == 3) {
 * 			word = t;
 * 			break;
 *        }
 *    }
 * 	System.out.println(word);
 */
public class Task1 {

    public static void main(String[] args) {
        //1)
        //	for (String s : strings) {
        //		System.out.println(s);
        //	    }

    }
}
