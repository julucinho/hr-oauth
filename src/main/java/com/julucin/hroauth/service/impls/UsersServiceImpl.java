package com.julucin.hroauth.service.impls;

import com.julucin.hroauth.clients.feign.UsersFeignClient;
import com.julucin.hroauth.dtos.UserDto;
import com.julucin.hroauth.service.UsersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsersServiceImpl implements UsersService {

    private final UsersFeignClient usersFeignClient;

    @Override
    public Optional<UserDto> retrieveUserBy(String email) {
        log.info("Calling hr-users to retrieve user by email ".concat(email));
        var retrievementResponse = this.usersFeignClient.retrieveUserByEmail(email);
        return Optional.ofNullable(retrievementResponse.getBody());
    }

    @Override
    public UserDetails loadUserByUsername(String emailAsUsername) throws UsernameNotFoundException {
        return this.retrieveUserBy(emailAsUsername)
                .orElseThrow(() -> new UsernameNotFoundException(emailAsUsername.concat(" is not a available username.")));
    }
}
