package com.springbootsecurity.springboot.service;

import com.springbootsecurity.springboot.model.User;
import com.springbootsecurity.springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
