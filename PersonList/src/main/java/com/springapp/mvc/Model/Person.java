package com.springapp.mvc.model;

/**
 * Created by Tunç on 13.7.2015.
 */
public class Person {
    String name;
    String surname;
    String address;
    String phoneNumber;
    String personId;
    String selectedPerson;

    public String getSelectedPerson() {
        return selectedPerson;
    }

    public void setSelectedPerson(String selectedPerson) {
        this.selectedPerson = selectedPerson;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
