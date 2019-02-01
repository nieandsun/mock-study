package com.nrsc.mockstudy.controller;

import com.nrsc.mockstudy.service.MockDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MockDemoController {

    @Autowired
    private MockDemoService mockDemoService;

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {

        String res = null;
        try {
            res = mockDemoService.sayHello(name);
        } catch (Exception e) {
            log.error("【to say hello to {}出错】", name);
        }
        return res;
    }
}
