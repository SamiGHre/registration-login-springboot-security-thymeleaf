package com.springbootsecurity.springboot.service;

import com.springbootsecurity.springboot.model.User;
import com.springbootsecurity.springboot.repository.UserRepository;
import com.springbootsecurity.springboot.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User();
    }
}
