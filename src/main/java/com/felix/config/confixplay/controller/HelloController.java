package com.felix.config.confixplay.controller;

import com.felix.config.confixplay.model.ExampleObject;
import com.felix.config.confixplay.model.ExampleObjectList;
import com.felix.config.confixplay.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Felix Porres on 14/01/2019.
 */
@RestController
public class HelloController {

    private ExampleService exampleService;
    @Autowired
    public HelloController(ExampleService exampleService){
        this.exampleService = exampleService;
    }

    @GetMapping("/hello")
    public ExampleObject[] Hello() {
        return this.exampleService.getExampleDate();
    }

}