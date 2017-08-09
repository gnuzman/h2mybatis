package com.zzh.h2mybatis.mappers;

import com.zzh.h2mybatis.entities.PersonEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {
    Long addPerson(PersonEntity personEntity);
}
