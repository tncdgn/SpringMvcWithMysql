package com.springapp.mvc.jdbc;

import com.springapp.mvc.model.Person;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Tunç on 15.7.2015.
 */
public class PersonExtractor implements ResultSetExtractor<Person> {
    @Override
    public Person extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        Person person = new Person();
        person.setPersonId(resultSet.getString(1));
        person.setName(resultSet.getString(2));
        person.setSurname(resultSet.getString(3));
        person.setAddress(resultSet.getString(4));
        person.setPhoneNumber(resultSet.getString(5));


        return person;

    }


}
