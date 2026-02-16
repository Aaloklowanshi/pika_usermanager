package com.pikauser.pika_user_manager.service;

import com.pikauser.pika_user_manager.entity.User;
import com.pikauser.pika_user_manager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void createUser(@RequestBody User user) {
        this.userRepository.save(user);
//        return new Response(userRepository.save(user), "ok", HttpStatus.CREATED);
    }
}
