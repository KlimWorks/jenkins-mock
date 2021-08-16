package com.example.demo;

import com.example.demo.gen.Person;
import com.example.demo.gen.PersonInBlackList;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class PersonRepository {

    private static final Map<String, PersonInBlackList> persons = new HashMap<>();

    @PostConstruct
    public void initData() {

//        Person person = new Person();
//        person.setFullName("Иванов Иван Иванович");
//        person.setDULSeries("QWE123");
//        person.setDULNumber(123456);

        PersonInBlackList personInBlackList = new PersonInBlackList();
        personInBlackList.setName("Иванов Иван Иванович");
//        personInBlackList.setFullName(person.getFullName());
//        personInBlackList.setDULNumber(person.getDULNumber());
        personInBlackList.setDULSeries("QWE123");
        personInBlackList.setBlackList(false);

        persons.put("Иванов Иван Иванович", personInBlackList);

    }

    public PersonInBlackList findPerson(String name) {
        return persons.get(name);
    }
}
