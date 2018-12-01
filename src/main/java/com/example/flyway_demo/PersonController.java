package com.example.flyway_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by zhuguowei on 2018-12-01.
 */
@RestController
@RequestMapping("persons")
public class PersonController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable int id) {
        String sql = "select id, name from person where id = ?";
        List<Person> list = jdbcTemplate.query(sql, new Object[]{id}, (rs, rowNum) -> new Person(rs.getInt("id"), rs.getString("name")));
        return list.isEmpty() ? null : list.get(0);
    }

}
