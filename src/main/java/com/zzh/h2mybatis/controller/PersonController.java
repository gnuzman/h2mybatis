package com.zzh.h2mybatis.controller;

import com.zzh.h2mybatis.entities.PersonEntity;
import com.zzh.h2mybatis.mappers.PersonMapper;
import com.zzh.h2mybatis.services.PersonService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMapper personMapper;

    @PostMapping("h2/add-person")
    public Long addPerson(@RequestBody PersonEntity personEntity) throws Exception {
        return personService.addPerson(personEntity);
    }

    @GetMapping("h2/get-persons")
    public List<PersonEntity> getPersons() {
        return personMapper.getPersons();
    }

    @PostMapping("h2/test")
    public String headTest(@RequestHeader(value = "hd1") String h1,
                   @RequestHeader(value = "hd2") String h2) {
        return "success";
    }
}
