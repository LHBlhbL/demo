package com.example.demo.service;

import com.example.demo.domain.Focus;
import com.example.demo.mapper.FocusMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FocusService {
    @Resource
    private FocusMapper mapper;

    public List<Focus> all(){
        return mapper.queryAll();
    }
}
