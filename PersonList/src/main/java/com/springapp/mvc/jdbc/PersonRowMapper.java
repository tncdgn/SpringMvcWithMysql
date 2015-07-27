package com.springapp.mvc.jdbc;

import com.springapp.mvc.model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Tunç on 15.7.2015.
 */
public class PersonRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int line) throws SQLException {
        PersonExtractor userExtractor = new PersonExtractor();
        return userExtractor.extractData(resultSet);
    }
}
