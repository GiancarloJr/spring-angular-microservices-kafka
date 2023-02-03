package com.helpdesk.userserviceapi.services;

import com.helpdesk.userserviceapi.UserMapper.UserMapper;
import com.helpdesk.userserviceapi.entities.User;
import com.helpdesk.userserviceapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import models.requests.UserRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServices {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User save(final UserRequest userRequest){
        return userRepository.save(userMapper.from(userRequest));
    }

}
