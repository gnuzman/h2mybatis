package com.zzh.h2mybatis.controller;

import com.zzh.h2mybatis.entities.PersonEntity;
import com.zzh.h2mybatis.services.PersonService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;

@RestController
@Api(tags = "person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("h2/add-person")
    public Long addPerson(@RequestBody PersonEntity personEntity) throws Exception {
        return personService.addPerson(personEntity);
    }
}
