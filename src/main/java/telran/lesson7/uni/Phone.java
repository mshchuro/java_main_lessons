package telran.lesson7.uni;

public class Phone {

    private String operator;

    private String number;

    public Phone(String operator, String number) {
        this.operator = operator;
        this.number = number;
    }

    public String getOperatorCode() {
        return operator;
    }

    public String getNumber() {
        return number;
    }

    public String getFullNumber() {
        return operator + number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "operator=" + operator +
                ", number=" + number +
                '}';
    }
}
