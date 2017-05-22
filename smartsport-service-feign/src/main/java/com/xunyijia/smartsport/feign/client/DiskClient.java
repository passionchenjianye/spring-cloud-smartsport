package com.xunyijia.smartsport.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: DiskClient.java
 * @Description:
 * @Author: Tony
 * @Date: 2017-05-19 08:43
 */
@FeignClient(value = "base-disk-service")
public interface DiskClient {

    @GetMapping(value = "/profile")
    String getProfile();

}
