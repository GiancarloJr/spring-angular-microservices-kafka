package com.helpdesk.userserviceapi.controllers;

import models.requests.UserRequest;
import models.responses.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface UserController {

    @PostMapping
    ResponseEntity<Void> save(@RequestBody UserRequest userRequest);

    @GetMapping
    ResponseEntity<List<UserResponse>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<UserResponse> findById(@PathVariable("id") Long id);

    @PatchMapping("/{id}")
    ResponseEntity<UserResponse> update(@PathVariable("id") Long id, @RequestBody UserRequest userRequest);

}
