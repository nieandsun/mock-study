package com.nrsc.mockstudy.service.impl;

import com.nrsc.mockstudy.repository.MockDemoRepository;
import com.nrsc.mockstudy.service.MockDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockDemoServiceImpl implements MockDemoService {

    @Autowired
    private MockDemoRepository mockDemoRepository;


    @Override
    public String sayHello(String name) {
        return mockDemoRepository.sayHello(name);
    }
}
