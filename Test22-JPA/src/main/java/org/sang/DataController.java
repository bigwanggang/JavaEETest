package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    @Autowired
    PersonService personService;

    @RequestMapping("/save")
    public Person save(Person person) {
        return personService.save(person);
    }

    @RequestMapping("/cache")
    public Person q1(Person person) {
        return personService.findOne(person);
    }

    @RequestMapping("/remove")
    public String remove(long id) {
        personService.remove(id);
        return "ok";
    }
}
