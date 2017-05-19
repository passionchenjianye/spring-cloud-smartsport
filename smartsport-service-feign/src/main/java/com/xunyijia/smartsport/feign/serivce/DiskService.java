package com.xunyijia.smartsport.feign.serivce;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: DiskService.java
 * @Description:
 * @Author: Tony
 * @Date: 2017-05-19 08:43
 */
@FeignClient(value = "base-disk-service")
public interface DiskService {

    @GetMapping(value = "/profile")
    String getProfile();

}
