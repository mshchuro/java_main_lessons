package telran.summary_lessons.summary23012025;

import java.util.Objects;

public class Adress implements Cloneable{

    private String adress;

    public Adress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress1 = (Adress) o;
        return Objects.equals(adress, adress1.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(adress);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "adress='" + adress + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
