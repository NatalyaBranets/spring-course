package com.natali.spring.dao;

import com.natali.spring.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT = 0;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Tom", 13, "tom@email.com"));
        people.add(new Person(++PEOPLE_COUNT, "Bob", 24, "bob@email.com"));
        people.add(new Person(++PEOPLE_COUNT, "Kate", 15, "kate@email.com"));
        people.add(new Person(++PEOPLE_COUNT, "Natali", 31, "natali@email.com"));
    }

    public List<Person> getAll() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person ->person.getId()==id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }

}
