/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.hystrix.hello.controller;

import com.gyoomi.hystrix.hello.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-16 16:17
 */
@RestController
public class HelloController {

    @Autowired
    private IHelloService userService;

    @GetMapping("/getProviderData")
    public List<String> getProviderData(){
        return userService.getProviderData();
    }

    /**
     * test
     *
     * @return
     */
    @RequestMapping(value = "/helloService", method = RequestMethod.GET)
    public String getHelloServiceData() {
        return "hello Service";
    }
}
