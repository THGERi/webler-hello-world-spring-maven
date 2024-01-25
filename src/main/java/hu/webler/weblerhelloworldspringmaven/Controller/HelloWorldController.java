package hu.webler.weblerhelloworldspringmaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/maven/hello")
    public String hello() {
        return "Hello World! from Maven!";
    }
}