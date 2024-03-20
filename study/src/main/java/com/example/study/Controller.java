package com.example.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication

@RestController
public class Controller {


    @GetMapping("first_page")
        public String first_page(@RequestParam(value="name",defaultValue="World" )String name){
        return "hello"+name;
    }
    @PostMapping("second_page")
    public String second(@RequestBody String body) {
        System.out.println(body);
        return "hello";
    }
}

