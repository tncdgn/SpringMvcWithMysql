package com.springapp.mvc.dao;

import com.springapp.mvc.model.Person;

import java.util.List;

/**
 * Created by Tunç on 15.7.2015.
 */
public interface PersonDao {

    public void insertData(Person person);
    public List<Person> getPersonList();
    public void deletePerson(String id);
    public void updatePerson(Person person);


}
