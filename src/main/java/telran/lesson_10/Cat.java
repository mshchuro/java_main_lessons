package telran.lesson_10;

import java.util.Objects;

public class Cat {

    private String name;

    private int age;

    private Color color;

    //Контракт между equals and hashcode
    //Если у объекта разный hashcode то это точно разные объекты
    //У одинаковый объектов, всегда одинаковые hashcode
    //У разных объектов может быть одинаковый hashcode (коллизия) (здест однозначно нужно
    // проверять через equals)

    //Сначала сравнивается hashcode, если он разный у двух объектов,
    //то это 100% разные объекты и дальше сравнивать не нужно

    //Если hashcode одинаковый у двух объектов (одинаковые объекты или коллизия)
    //в этом случае нужно испольховать equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && color == cat.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}
