package co.edu.demoAcademico.controllers;

import co.edu.demoAcademico.exception.EmailAlreadyExists;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EmailAlreadyExists.class)
    public String emailAlreadyExists(EmailAlreadyExists exception){
        return exception.getMessage();
    }
}
