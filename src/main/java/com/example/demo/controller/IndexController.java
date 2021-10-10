package com.example.demo.controller;

import com.example.demo.domain.Focus;
import com.example.demo.properties.BlogProperties;
import com.example.demo.service.FocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
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

    @RequestMapping("/view")
    String view(Model model){
        List<Focus> ans = service.all();
        model.addAttribute("tem",ans);
        return "view";
    }
}
