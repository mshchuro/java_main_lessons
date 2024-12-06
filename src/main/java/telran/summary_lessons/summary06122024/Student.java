package telran.summary_lessons.summary06122024;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Student {

    private String name;

    private String surname;

    @EqualsAndHashCode.Exclude
    private int age;
}
