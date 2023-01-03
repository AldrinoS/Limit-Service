package com.example.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Configuration config;

    @GetMapping("/limit")
    public ResponseEntity<Limit> getLimits() {
        return new ResponseEntity<>(new Limit(config.getMinimum(),config.getMaximum()), HttpStatus.OK);
    }
}
