package com.springbootsecurity.springboot.service;

import com.springbootsecurity.springboot.model.User;
import com.springbootsecurity.springboot.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
