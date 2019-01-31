package com.nrsc.mockstudy.controller;

import com.nrsc.mockstudy.service.MockDemoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockDemoControllerTest {

    @InjectMocks
    private MockDemoController mockDemoController;

    @Mock
    private MockDemoService mockDemoService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sayHello() {
        String name = "sunchuan";
        Mockito.when(mockDemoService.sayHello(name)).thenReturn("say hello to " + name);
        String str = mockDemoController.sayHello(name);
        Assert.assertNotNull(str);
    }
}