package telran.lesson5;

public enum Season {

    WINTER("Very cold", "December"),
    SPRING("Green", "March"),
    SUMMER("Hot", "June"),
    AUTUMN("Rain", "September");

    private String description;

    private String startMonth;

    Season(String description, String startDate) {
        this.description = description;
        this.startMonth = startDate;
    }

    public String getDescription() {
        return description;
    }

    public String getStartMonth() {
        return startMonth;
    }
}
