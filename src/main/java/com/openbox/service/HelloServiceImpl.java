package com.openbox.service;

import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * @author: luming.shi   Created on 18/3/2.
 */
@Service
public class HelloServiceImpl implements IHelloService{

    @Override
    public void sayHi() {
        System.out.println("hello world");
    }
}
