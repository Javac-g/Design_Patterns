package com.company.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Immutable {
    private final int num;
    private final Person person;
    private final List<Person> people ;

    public Immutable(int num,Person person, List<Person> people){
        this.num = num;
        this.person = new Person(person.getAge(), person.getName());
        this.people = new ArrayList<>(people);
    }

    public int getNum() {
        return num;
    }

    public Person getPerson() {
        return new Person(person.getAge(), person.getName());
    }

    public List<Person> getPeople() {
        ArrayList<Person> anmpeople = new ArrayList<>(people);
        return Collections.unmodifiableList(anmpeople);
    }
    public Immutable addPerson(Person person){
        List<Person> people1 = new ArrayList<>(people);
        people1.add(person);
        return new Immutable(getNum(),getPerson(),people1);
    }
}
