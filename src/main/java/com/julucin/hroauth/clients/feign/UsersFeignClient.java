package com.julucin.hroauth.clients.feign;

import com.julucin.hroauth.dtos.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-users", path = "/users")
public interface UsersFeignClient {

    @GetMapping("/{email}")
    ResponseEntity<UserDto> retrieveUserByEmail(@PathVariable String email);

}
