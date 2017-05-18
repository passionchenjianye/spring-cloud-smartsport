package com.xunyijia.smartsport.base.disk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: FileOperationController.java
 * @Description: 文件处理Controller
 * @Author: Tony
 * @Date: 2017-05-18 14:35
 */
@RestController
public class FileOperationController {

    @Value(value = "${profile}")
    private String profile;

    @GetMapping("/profile")
    String getProfileFromGitRepo() {
        return profile;
    }
}
