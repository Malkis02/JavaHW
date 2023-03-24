package HW6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"Jack","Daniels",32,"Male", LocalDate.of(1995,5,20)));
        personList.add(new Person(2,"Jack","Sparrow",21,"Male", LocalDate.of(1956,3,16)));
        personList.add(new Person(3,"Suzi","Petrova",40,"Female", LocalDate.of(1968,2,26)));
        personList.add(new Person(4,"Ivan","Pupkin",19,"Male", LocalDate.of(1949,8,10)));
        personList.add(new Person(5,"Pupa","Ivanov",18,"Male", LocalDate.of(1997,12,8)));
        personList.add(new Person(6,"Lupa","Vasilyev",20,"Male", LocalDate.of(1991,1,3)));

        System.out.println(personList.stream().filter(p -> p.getAge() >= 20 ).collect(Collectors.toList()));
    }
}
