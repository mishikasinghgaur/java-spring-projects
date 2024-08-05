package org.springboot.msg.quizapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springboot.msg.quizapp.dto.QuestionnaireDto;
import org.springboot.msg.quizapp.entity.Questionnaire;
import org.springboot.msg.quizapp.service.ViewQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class ViewQuestionnaireController {

    @Autowired
    private ViewQuestionnaireService viewQuestionnaireService;

    @GetMapping(value = "/v1/questions/all", produces = "application/json")
    public List<Questionnaire>  getAllQuestion(){

        log.info("You have entered the View Questionnaire Controller to view all questions");
        return viewQuestionnaireService.viewQuestions();
    }

    @GetMapping(value = "/v1/questions", produces = "application/json")
    public List<Questionnaire>  getQuestionBasedOnType(@PathVariable String type){

        log.info("You have entered the View Questionnaire Controller to view specific type questions");
        return viewQuestionnaireService.viewQuestions();
    }
}
