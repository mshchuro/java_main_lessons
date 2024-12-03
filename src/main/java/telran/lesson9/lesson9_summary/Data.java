package telran.lesson9.lesson9_summary;

import java.util.Objects;

public class Data {
    private int intData;

    private String stringData;

    public Data(int intData, String stringData) {
        this.intData = intData;
        this.stringData = stringData;
    }

    @Override
    public String toString() {
        return "Data{" +
                "intData=" + intData +
                ", stringData='" + stringData + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return intData == data.intData && Objects.equals(stringData, data.stringData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intData, stringData);
    }
}
