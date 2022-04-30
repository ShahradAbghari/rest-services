package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class HelloController {


    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHi() {
        return "hello";
    }

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHello() {
        return "hi";
    }


    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public String sayHiEveryBody() {
        return "hello every body";
    }


    @RequestMapping(value = "person", method = RequestMethod.GET)
    public Person getPerson() {
        Person person = new Person();
        return person;
    }

    @RequestMapping(value = "personlist", method = RequestMethod.GET)
    public List<Person> addPerson(@RequestBody Person person) {

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        personList.add(person1);
        personList.add(person);
        return personList;
    }

}
