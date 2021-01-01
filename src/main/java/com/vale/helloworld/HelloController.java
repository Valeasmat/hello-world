package com.vale.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String greeting(@PathVariable String name){
        return "Hi "+name+", welcome from kubectl";
    }
}
