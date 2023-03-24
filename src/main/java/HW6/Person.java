package HW6;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;

@Data
@AllArgsConstructor
public class Person {

    private int id;

    private String name;

    private String surname;

    private int age;

    private String gender;

    private LocalDate birthday;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name)
                && Objects.equals(surname, person.surname) && Objects.equals(gender, person.gender)
                && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, gender, birthday);
    }

}
