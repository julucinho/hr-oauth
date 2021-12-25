package com.julucin.hroauth.service;

import com.julucin.hroauth.dtos.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UsersService extends UserDetailsService {

    Optional<UserDto> retrieveUserBy(String email);

}
