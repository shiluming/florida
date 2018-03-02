package com.openbox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author: luming.shi   Created on 18/3/2.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hi, world");
        return "hi, world";
    }
}
