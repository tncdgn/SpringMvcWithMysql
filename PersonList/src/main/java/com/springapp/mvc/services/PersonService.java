package com.springapp.mvc.services;

import com.springapp.mvc.Model.Person;

import java.util.List;

/**
 * Created by Tunç on 15.7.2015.
 */
public interface PersonService {
    public void insertData(Person person);
    public List<Person> getPersonList();
    public void deletePerson(String id);
    public void updatePerson(Person person);
}
