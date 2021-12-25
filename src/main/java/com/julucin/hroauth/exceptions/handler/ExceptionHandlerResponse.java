package com.julucin.hroauth.exceptions.handler;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
class ExceptionHandlerResponse {

    static ExceptionHandlerResponse of(RuntimeException exception){
        var exceptionHandlerResponse = new ExceptionHandlerResponse();
        exceptionHandlerResponse.setMessage(exception.getMessage());
        return exceptionHandlerResponse;
    }

    private String message;

}
