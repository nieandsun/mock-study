package com.nrsc.mockstudy.controller;

import com.nrsc.mockstudy.service.MockDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockDemoController {

    @Autowired
    private MockDemoService mockDemoService;

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return mockDemoService.sayHello(name);
    }
}
