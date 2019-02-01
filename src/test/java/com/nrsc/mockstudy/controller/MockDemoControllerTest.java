package com.nrsc.mockstudy.controller;

import com.nrsc.mockstudy.service.MockDemoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)  //与@Before以及@Rule效果相同
public class MockDemoControllerTest extends Assert {

    @InjectMocks  //可以理解为mock(虚拟)出MockDemoController对象
    private MockDemoController mockDemoController;

    @Mock  //mock出MockDemoService对象
    private MockDemoService mockDemoService;

//    @Before //将本类中有@Mock注解的对象注入到 @InjectMock中的对象中
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }


//    @Rule //与上面注释掉的代码效果相同
//    public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Test
    public void sayHello() {
        String name = "张三";

        /**
         *
         */
        Mockito.when(mockDemoService.sayHello(name)).thenReturn("say hello to " + name);
        String str1 = mockDemoController.sayHello(name);
        assertNotNull(str1);

        Mockito.doThrow(new RuntimeException("exception")).when(mockDemoService).sayHello(name);
        String str = mockDemoController.sayHello(name);
        assertNull(str);
    }
}