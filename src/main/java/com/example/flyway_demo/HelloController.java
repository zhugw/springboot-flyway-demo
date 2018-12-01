package com.example.flyway_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhuguowei
 * @date 2018-12-01
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public Map sayHi(String name) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("hello", name);
        return map;
    }
}
