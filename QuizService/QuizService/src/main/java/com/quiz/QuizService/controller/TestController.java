package com.quiz.QuizService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-test")
public class TestController {

    public String quizTest(){
        return "This is Quiz Test Controller";
    }
}
