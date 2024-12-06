package telran.summary_lessons.summary06122024;

/**
 * При создании через String value = "Hello", сначала в пуле уникальных строк
 * проверяется есть ли строка с таким содержанием, если строка с таким
 * содержанием в пуле есть, то в переменную value присваивается ссылка
 * на уже существующую строку
 *
 * Когда создаем через String value = new String("Hello");
 * В переменную value присваивается ссылка на новый объект в памяти
 *
 * intern() помещает строку в пул уникальных строк.
 * Проверяется есть ли в пуле уникальных строк строка с таким содержимым,
 * если есть, то данный метод возвращает ссылку на строку из пула
 * Если нет такой строки в пуле, то он ее поместит в пул и вернет ссылку
 * на эту строку
 */
public class TestApp {

    public static void main(String[] args) {
        String one = "Hello!";
        String two = "Hello!";

        String three = new String("Hello!");

        boolean resultOne = one == two;
        boolean resultTwo = one == three;

        System.out.println(resultOne);
        System.out.println(resultTwo);

        //pool string
        three = three.intern();
        System.out.println("one == three " + (one == three));


    }
}
