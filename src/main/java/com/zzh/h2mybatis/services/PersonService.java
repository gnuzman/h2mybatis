package com.zzh.h2mybatis.services;

import com.zzh.h2mybatis.entities.PersonEntity;
import com.zzh.h2mybatis.mappers.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public Long addPerson(PersonEntity personEntity) {
        return personMapper.addPerson(personEntity);
    }
}
