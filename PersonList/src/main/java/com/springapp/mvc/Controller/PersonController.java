package com.springapp.mvc.Controller;

import com.springapp.mvc.Model.Person;
import com.springapp.mvc.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.logging.*;

import java.util.*;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;
    static final Logger log=Logger.getLogger(PersonController.class.getName());
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(Map<String,Object> model) {
        //to handle form data
        Person person=new Person();
        model.put("personForm",person);
        //to show all person list
        model.put("person", new Person());
        model.put("listPerson", personService.getPersonList());

        //to edit person
        model.put("personEdit",new Person());

		return "hello";
	}


    @RequestMapping(method = RequestMethod.POST)
    public String save(@ModelAttribute("personForm") Person person,Model model){


        personService.insertData(person);

        return "redirect:person";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public  @ResponseBody String delete(@RequestParam String id) {
        personService.deletePerson(id);
        return "true";
    }
    @RequestMapping(value = "/edit")
    public String editPerson(@ModelAttribute("personEdit") Person person){
        log.info("User id " +person.getPersonId());
        log.info("User name " +person.getName());
        log.info("User surname "+person.getSurname());
        log.info("User address " +person.getAddress());
        log.info("User telephone "+person.getPhoneNumber());
        personService.updatePerson(person);
        return "redirect:/person";
    }
}