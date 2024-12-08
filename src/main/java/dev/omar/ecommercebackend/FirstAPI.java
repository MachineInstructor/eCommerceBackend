package dev.omar.ecommercebackend;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAPI {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping("/hello/{name}")
    public String sayHelloToAPerson(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}