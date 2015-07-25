package com.springapp.mvc.services;

import com.springapp.mvc.Model.Person;
import com.springapp.mvc.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Tunç on 15.7.2015.
 */
public  class PersonServiceImpl implements PersonService{
   @Autowired
    PersonDao personDao;
    @Override
    public void insertData(Person person) {
    personDao.insertData(person);
    }

    @Override
    public List<Person> getPersonList() {
        return personDao.getPersonList();
    }

    @Override
    public void deletePerson(String id) {
        personDao.deletePerson(id);
    }

    @Override
    public void updatePerson(Person person) {
        personDao.updatePerson(person);
    }


}
