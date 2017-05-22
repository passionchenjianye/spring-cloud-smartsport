package com.xunyijia.smartsport.service.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: DiskClient.java
 * @Description:
 * @Author: Tony
 * @Date: 2017-05-22 13:09
 */
@Service
public class DiskClient {

    @Autowired
    RestTemplate restTemplate;

    public String getProfile() {
        return restTemplate.getForObject("http://base-disk-service/profile", String.class);
    }
}
