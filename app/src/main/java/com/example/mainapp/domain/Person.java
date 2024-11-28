package com.example.mainapp.domain;

import java.util.Objects;

public class Person {

    private String email;
    private String password;
    private String city;
    private String nickname;

    public Person(String email, String password,
                  String city, String nickname) {
        this.email = email;
        this.password = password;
        this.city = city;
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return Objects.equals(email, person.email)
                && Objects.equals(password, person.password)
                && Objects.equals(city, person.city)
                && Objects.equals(nickname, person.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, city, nickname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
