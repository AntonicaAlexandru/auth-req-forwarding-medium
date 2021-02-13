package com.aa.authservice.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/authorize")
@Log4j2
public class AuthorizeRequestController {


    private static final String TEST_HEADER = "test-header";
    @GetMapping("/request")
    public void authorizeRequest(HttpServletRequest request) throws Exception {

        log.info("Started checking the request");
        // For testing purposes
        String header = request.getHeader(TEST_HEADER);
        if (isNull(header)) {
            log.info("Request failed the check, throwing 500");
            throw new Exception("Throw me a 500");
        }

        log.info("Request passed the check, returning 200");
    }

}
