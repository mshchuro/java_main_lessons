package telran.lesson17.lesson17_summary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Cat {
    private String name;

    private int age;

    private String colour;

    private boolean isHungry;
}
