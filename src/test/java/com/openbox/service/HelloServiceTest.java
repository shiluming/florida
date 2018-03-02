package com.openbox.service;

import com.openbox.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 描述:
 *
 * @author: luming.shi   Created on 18/3/2.
 */
public class HelloServiceTest extends BaseTest{

    @Autowired
    IHelloService helloService;

    @Test
    public void testHello() {
        helloService.sayHi();
    }



}
