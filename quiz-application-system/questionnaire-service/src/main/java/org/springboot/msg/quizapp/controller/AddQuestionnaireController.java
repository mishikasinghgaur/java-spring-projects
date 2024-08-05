package org.springboot.msg.quizapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springboot.msg.quizapp.dto.QuestionnaireDto;
import org.springboot.msg.quizapp.service.AddQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AddQuestionnaireController {

    @Autowired
    private AddQuestionnaireService addQuestionnaireService;

    @PostMapping(value = "/v1/questions")
    public QuestionnaireDto addQuestion(@RequestBody QuestionnaireDto questions){

        log.info("questions"+ questions);
        log.info("You have entered the Add Questionnaire Controller");
        return addQuestionnaireService.addQuestions(questions);
    }
}
