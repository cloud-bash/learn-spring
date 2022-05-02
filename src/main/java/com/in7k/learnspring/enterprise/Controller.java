package com.in7k.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//send responses in correct format
@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;

    // "/sum" => 100
    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }
}