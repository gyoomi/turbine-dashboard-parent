/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.hystrix.provider.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The description of interface
 *
 * @author Leon
 * @date 2019-10-16 15:36
 */
@FeignClient(value = "sc-hello-service")
public interface ConsumerClient {

    /**
     * invoke method
     *
     * @return
     */
    @GetMapping(value = "/helloService")
    String getHelloServiceData();
}
