package com.xunyijia.smartsport.feign.controller;

import com.xunyijia.smartsport.feign.client.DiskClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DiskController.java
 * @Description:
 * @Author: Tony
 * @Date: 2017-05-19 08:45
 */
@RestController
public class DiskController {

    @Autowired
    private DiskClient diskClient;

    @GetMapping(value = "/profile")
    String readProfile() {
        return diskClient.getProfile();
    }
}
