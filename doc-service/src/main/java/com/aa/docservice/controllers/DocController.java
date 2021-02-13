package com.aa.docservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doc")
public class DocController {

    @GetMapping("/fetch")
    public ResponseEntity<Map<String, String>> getDoc() {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("test", "value");
        return new ResponseEntity<>(hashMap, HttpStatus.OK);
    }
}
