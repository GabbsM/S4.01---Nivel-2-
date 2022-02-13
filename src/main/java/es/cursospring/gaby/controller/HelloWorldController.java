package es.cursospring.gaby.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/v1")
public class HelloWorldController {
    @GetMapping("/hello/{user}")
    public String helloUser(@PathVariable(name="user") String user){
        return "Hello " + user + "!";
    }
}
