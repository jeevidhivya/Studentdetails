package com.example.Studentdetails.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalException {
@ExceptionHandler(AgeBelowException.class)
public ResponseEntity<Object>agehandle(AgeBelowException c) {
	return new ResponseEntity<>(c.getMessage(),HttpStatus.NOT_FOUND);
}

}
