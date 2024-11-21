package telran.lesson6;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        // Dynamic Array
        // ArrayList - реализация структуры данных динамического массива в Java
        // внутри класса ArrayList есть обычный массив типа Object[] elementData
        // при создании ArrayList, создается внутренний массив размером 10 элементов

        //структура данных Dynamic Array, но называем его список, лист, ArrayList
        //еще одно понятие списка - список значений
        ArrayList<Integer> list = new ArrayList<>(); // array size 10

        // add element to array : Time complexity 0(1)
        // array[1] = 2;

        // add element to list : Time complexity 0(1) (to end)
        // add(value) - добавляем элемент в конец нашего списка

        list.add(3); // elementData[0] = 3;
        list.add(6); // elementData[1] = 6;

        //Элементы внутри списка хранятся в порядке добавления их в список
        System.out.println("List contains: " + list);

        list.add(5); // elementData[2] = 5;
        list.add(3); // elementData[3] = 3;
        list.add(2); // elementData[4] = 2;
        list.add(5); // elementData[5] = 5;
        list.add(7); // elementData[6] = 7;
        list.add(6); // elementData[7] = 6;
        list.add(9); // elementData[8] = 9;
        list.add(10); // elementData[9] = 10;
        // 1) При попытке добавить элемент в массив, который оказался полностью заполнен
        // внутри класса ArrayList был создан массив в 1.5 раза больше чем текущий
        // в данном случае из 15 элементов

        // 2) Все элементы старого массива были скопированы в новый массив
        // в нашем случае - получили новый массив из 15 элементов, 10 из которых
        // заполнены из старого массива

        // 3) В переменную elementData, которая хранит массив в классе ArrayList
        // была присвоена ссылка на новый массив из 15 элементов

        //4) Все ссылки на старый массив были очищены и он стал доступен для удаления

        list.add(1); // elementData[10] = 1;
        list.add(8); // elementData[11] = 8;

        System.out.println("List contains: " + list);

        // get element from array: Time complexity 0(1)
        // int element = array[1];

        // get element from list by index: Time complexity 0(1)
        // get(index) - получаем элемент по индексу

        int element = list.get(2);
        System.out.println("Element by index 2 is: " + element);

        // add element by index: Time complexity 0(n) , n - count of elements
        // [15, 3, 6, 5, 3, 2, 5, 7, 6, 9, 10, 1, 8]
        // add(index, value) - добавление элемента по индексу
        list.add(0, 15);
        System.out.println(list);

        //set element by index: Time complexity 0(1)
        list.set(0, 25); // перезаписать элемент по индексу
        System.out.println(list);

        System.out.println("Size out list " + list.size());
        System.out.println("List is empty? " + list.isEmpty());

        //contains - метод проверки содержания элемента в списке(простой перебор всех элементов и поиск)
        //Time complexity 0(n) , n - count of elements
        System.out.println("List contains 9? " + list.contains(9));

        //remove(index) - удаление по индексу Time complexity 0(n) , n - count of elements
        //remove(Object) - удаление объекта Time complexity 0(n) , n - count of elements
        //remove(1) - удалить элемент по индексу 1
        // [3, 6, 5, 3, 2, 5, 7, 6, 9, 10, 1, 8]
        // [3, 5, 3, 2, 5, 7, 6, 9, 10, 1, 8, null]
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(9));
        System.out.println(list);

        //for
        for (int i = 0; i < list.size(); i++) {
            System.out.print("" + list.get(i) + " ");
        }

        System.out.println();

        //foreach
        for (int value : list) {
            System.out.print("" + value + " ");
        }
    }
}
