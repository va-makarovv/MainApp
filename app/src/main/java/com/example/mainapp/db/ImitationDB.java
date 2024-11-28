package com.example.mainapp.db;

import com.example.mainapp.domain.Person;

public class ImitationDB {

    private String email;
    private String password;
    private String city;
    private String nickname;

    private int size = 10;
    private Person[] people = new Person[10];

    public ImitationDB() {
        people[0] = new Person("email1", "pass1", "city1", "nick1");
        people[1] = new Person("email2", "pass2", "city2", "nick2");
        people[2] = new Person("email3", "pass3", "city3", "nick3");
    }

    public Person[] getPeople() {
        return people;
    }

    public Person getPersonByEmail(String email){
        for (Person p: people) {
            if(p != null && p.getEmail().equalsIgnoreCase(email))
                return p;
        }
        return null;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {return password;}

    public String getCity() {
        return city;
    }

    public String getNickname() {
        return nickname;
    }

    public int getSize() {
        return size;
    }

    public Person addToDB(Person person){
        if (person == null)
            return null;
        for (int i = 0; i < people.length; i++) {
            if(people[i] == null){
                people[i] = person;
                return person;
            }
        }
        return null;
    }
    private void upgradeArray(){
        Person[] newPeople = new Person[size * 2];
        size *= 2;
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        people = newPeople;
    }
}
