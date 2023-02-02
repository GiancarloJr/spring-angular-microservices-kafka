package com.helpdesk.userserviceapi.controllers;

import models.requests.UserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserController {

    ResponseEntity<Void> save(@RequestBody UserRequest userRequest);

}
