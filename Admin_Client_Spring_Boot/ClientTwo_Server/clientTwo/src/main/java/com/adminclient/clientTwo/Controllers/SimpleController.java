package com.adminclient.clientTwo.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping(value="/helloSimpleEndpointClientTwo", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> helloSimpleEndpoint() {
        return ResponseEntity.ok().body("This is hello simple endpoint from client Two");
    }
}