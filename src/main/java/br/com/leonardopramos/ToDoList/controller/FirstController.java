package br.com.leonardopramos.ToDoList.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FirstController {

    @GetMapping("/msg")
    public String firstMsg(){
        return "Worked";
    }
}
