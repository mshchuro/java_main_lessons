package telran.summary_lessons.summary06122024.book_task;

public enum Genre {

    FICTION(16),
    NON_FICTION(10),
    NOVEL(21);

    private final int category;

    Genre(int category) {
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return super.toString() + " " + category;
    }
}
