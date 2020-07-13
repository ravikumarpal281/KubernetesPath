package com.k8s.demo.app.K8S.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8SCotroller {

    @GetMapping("/hello")
    public String k8sHello(){
        return "Hello K8S";
    }
}
