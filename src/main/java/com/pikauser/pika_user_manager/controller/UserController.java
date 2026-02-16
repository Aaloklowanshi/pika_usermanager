package com.pikauser.pika_user_manager.controller;

import com.pikauser.pika_user_manager.dto.Response;
import com.pikauser.pika_user_manager.dto.UserDto;
import com.pikauser.pika_user_manager.entity.User;
import com.pikauser.pika_user_manager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final ModelMapper modelMapper;

    @PostMapping("/user")
    public ResponseEntity<Response> createUser(final @RequestBody UserDto userRequested) {
        System.out.println("triggerd");
        User user = modelMapper.map(userRequested, User.class);
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
