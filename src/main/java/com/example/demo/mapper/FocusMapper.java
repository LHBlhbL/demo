package com.example.demo.mapper;

import com.example.demo.domain.Focus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface FocusMapper {
    List<Focus> queryAll();
   // int user_id(int id);
}
