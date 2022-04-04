package com.example.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") //http://localhost:8080/api/get/hello
    public String getHello() {
        return "get Hello";
    }


    // http://localhost:8080/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
//    public String pathVariable(@PathVariable String name) {
//        System.out.println("PathVariable : " + name);
//        return name;
//    }
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    // http://localhost:8080/api/get/query=param?user=steve&email=steve@gmail.com&age=30
}
