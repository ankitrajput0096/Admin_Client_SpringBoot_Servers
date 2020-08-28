package com.adminclient.clientOne.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping(
            value="/helloSimpleEndpointClientOne",
            method = RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity<String> helloSimpleEndpoint() {
        return ResponseEntity.ok()
                .body("This is hello simple endpoint from client One");
    }
}