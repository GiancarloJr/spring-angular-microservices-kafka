package com.helpdesk.userserviceapi.UserMapper;


import com.helpdesk.userserviceapi.entities.User;
import models.requests.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User from(UserRequest userRequest);

}
