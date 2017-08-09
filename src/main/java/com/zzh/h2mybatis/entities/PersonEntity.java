package com.zzh.h2mybatis.entities;

public class PersonEntity {
    Long id;
    String firstName;
    String lastName;

    public PersonEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return lastName;
    }

    public void setSecondName(String secondName) {
        this.lastName = secondName;
    }
}
