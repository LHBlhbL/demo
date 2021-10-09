package com.example.demo.controller;

import com.example.demo.domain.Focus;
import com.example.demo.properties.BlogProperties;
import com.example.demo.service.FocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {


    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private FocusService service;

    @RequestMapping("/")
    List<Focus> index() {
        List<Focus> ans = service.all();
        return ans;
    }
}
