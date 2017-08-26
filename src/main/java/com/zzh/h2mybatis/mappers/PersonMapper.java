package com.zzh.h2mybatis.mappers;

import com.zzh.h2mybatis.entities.PersonEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    Long addPerson(PersonEntity personEntity);
    List<PersonEntity> getPersons();
}
