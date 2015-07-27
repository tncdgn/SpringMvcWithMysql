package com.springapp.mvc.dao;

import com.springapp.mvc.model.Person;
import com.springapp.mvc.jdbc.PersonRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tunç on 15.7.2015.
 */
public class PersonDaoImp implements PersonDao {
    @Autowired
    DataSource dataSource;

    @Override
    public void insertData(Person person) {
    String sql="insert into contact "+"(name,surname,address,telephone) values (?,?,?,?)";
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql,new Object[]{person.getName(),person.getSurname(),person.getAddress(),person.getPhoneNumber()});

    }

    @Override
    public List<Person> getPersonList() {
        List personList=new ArrayList();
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        String sql="select * from contact";
        personList=jdbcTemplate.query(sql,new PersonRowMapper());

        return personList;
    }

    @Override
    public void deletePerson(String id) {

        String sql="delete  from contact where contact_id =" +id;
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql);
    }

    @Override
    public void updatePerson(Person person) {
    String sql="update contact set name=?,surname=?,address=?,telephone=? where contact_id=?";
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql,new Object[]{person.getName(),person.getSurname(),person.getAddress(),person.getPhoneNumber(),person.getPersonId()});
    }


}
