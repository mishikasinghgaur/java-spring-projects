package org.springboot.msg.quizapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springboot.msg.quizapp.entity.Quiz;
import org.springboot.msg.quizapp.service.GetQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class GetQuizController {

    @Autowired
    private GetQuizService viewQuestionnaireService;

    @GetMapping(value = "/v1/questions/all")
    public List<Quiz>  viewAllQuestion(){

        log.info("You have entered the View Questionnaire Controller to view all questions");
        return viewQuestionnaireService.viewQuestions();
    }
}
