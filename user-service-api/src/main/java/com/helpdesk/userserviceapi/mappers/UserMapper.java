package com.helpdesk.userserviceapi.mappers;


import com.helpdesk.userserviceapi.entities.User;
import models.requests.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = ALWAYS,
        nullValuePropertyMappingStrategy = IGNORE
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User from(UserRequest userRequest);

}
