package telran.lesson5;

public class EnumExample {

    public static void main(String[] args) {
        //Colors: Red, White, Black etc
        //Days : Monday, Tuesday etc
        //Accepted, Rejected etc

        Color white = new Color("White");
        Color red = new Color("Red");

        Day friday = Day.FRIDAY;
        System.out.println(friday);

        //Получение всех значений enum
        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day);
        }

        //Получение порядкового номера enum
        int ordinal = Day.MONDAY.ordinal();
        System.out.println(ordinal);

        //Получение enum из строкового значения
        String monday = "MONDAY";
        Day day = Day.valueOf(monday);
        System.out.println(day);

        //Получение строкового представления enum
        String name = Day.WEDNESDAY.name();
    }
}