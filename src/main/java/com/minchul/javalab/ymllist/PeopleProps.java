package com.minchul.javalab.ymllist;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class PeopleProps {

    private List<Person> people;

    record Person(String name, long age) {
    }
}
