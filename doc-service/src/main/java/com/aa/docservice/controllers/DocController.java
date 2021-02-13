package com.aa.docservice.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doc")
@Log4j2
public class DocController {

    @GetMapping("/fetch")
    public ResponseEntity<Map<String, String>> getDoc() {

        log.info("Received fetching doc request");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("test", "value");

        log.info("Returning doc");
        return new ResponseEntity<>(hashMap, HttpStatus.OK);
    }
}
