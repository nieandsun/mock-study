package com.nrsc.mockstudy.repository.impl;

import com.nrsc.mockstudy.repository.MockDemoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MockDemoRepositoryImpl implements MockDemoRepository {
    @Override
    public String sayHello(String name) {
        return "say hello to " + name;
    }
}
