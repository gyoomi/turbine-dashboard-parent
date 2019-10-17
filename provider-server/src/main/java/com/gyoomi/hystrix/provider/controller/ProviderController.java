/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.hystrix.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-16 15:35
 */
@RestController
public class ProviderController {

    @Autowired
    private ConsumerClient consumerClient;


    /**
     * test get hello service data
     *
     * @return result
     */
    @GetMapping(value = "/helloService")
    public String getHelloService() {
        return consumerClient.getHelloServiceData();
    }

    /**
     * test get some info
     *
     * @return
     */
    @GetMapping(value = "/getDashboard")
    public List<String> getProviderData() {
        List<String> provider = new ArrayList<String>();
        provider.add("hystrix dashboard");
        return provider;
    }
}
