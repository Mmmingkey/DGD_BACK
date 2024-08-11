package com.dgd.dgdback.simple;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class SimpleController{

    private final SimpleService service;
    private List<String> list = new ArrayList<>();
    @RequestMapping("/message/get")
    public List<String> getMessage(){
        return list;
    }

    @RequestMapping("/message/add")
    public boolean addMessage(@RequestBody(required = false) String msg){
        list.add(0, msg);
        return true;
    }

    @RequestMapping("/test")
    public void test(){
         service.jpaTest();

    }
}
