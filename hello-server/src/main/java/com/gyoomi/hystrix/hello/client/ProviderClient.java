/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.hystrix.hello.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * The description of interface
 *
 * @author Leon
 * @date 2019-10-16 16:14
 */
@FeignClient(name = "sc-provider-service")
public interface ProviderClient {

    @GetMapping(value = "/getDashboard")
    List<String> getProviderData();
}
