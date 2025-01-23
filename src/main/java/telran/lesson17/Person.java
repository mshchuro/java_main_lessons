package telran.lesson17;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Person {

    private Long id;

    private String name;

    private String surname;
}
