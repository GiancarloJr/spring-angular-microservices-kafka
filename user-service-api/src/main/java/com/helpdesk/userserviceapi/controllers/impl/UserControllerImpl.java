package com.helpdesk.userserviceapi.controllers.impl;

import com.helpdesk.userserviceapi.controllers.UserController;
import com.helpdesk.userserviceapi.services.UserServices;
import lombok.RequiredArgsConstructor;
import models.requests.UserRequest;
import models.responses.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserControllerImpl implements UserController {

    private final UserServices userServices;

    @Override
    public ResponseEntity<Void> save(UserRequest userRequest) {
        userServices.save(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<List<UserResponse>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> update(Long id, UserRequest userRequest) {
        return null;
    }
}
