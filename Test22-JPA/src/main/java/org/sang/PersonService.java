package org.sang;

public interface PersonService {
    Person save(Person person);
    void remove(Long id);
    Person findOne(Person person);

}
