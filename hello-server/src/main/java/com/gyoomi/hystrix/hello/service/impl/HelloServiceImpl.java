/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.hystrix.hello.service.impl;

import com.gyoomi.hystrix.hello.client.ProviderClient;
import com.gyoomi.hystrix.hello.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-16 16:16
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    private ProviderClient providerClient;

    @Override
    public List<String> getProviderData() {
        return providerClient.getProviderData();
    }
}
