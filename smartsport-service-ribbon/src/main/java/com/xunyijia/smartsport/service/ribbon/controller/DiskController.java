package com.xunyijia.smartsport.service.ribbon.controller;

import com.xunyijia.smartsport.service.ribbon.client.DiskClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DiskController.java
 * @Description:
 * @Author: Tony
 * @Date: 2017-05-22 13:12
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
