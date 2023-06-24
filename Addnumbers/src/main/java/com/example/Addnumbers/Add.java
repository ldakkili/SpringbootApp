package com.example.Addnumbers;

import org.springframework.web.bind.annotation.*;

@RestController
public class Add {
    @PostMapping(value="/add/{a}/{b}", produces= "application/json")
    public int add1(@PathVariable int a, @PathVariable int b){

        return  a+b;
    }
    @PostMapping (value = "/add")
    public int add(@RequestBody Model model) {
        return model.getNum1() + model.getNum2();

    }
}
