package org.springboot.msg.quizapp.service;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.modelmapper.ModelMapper;
import org.springboot.msg.quizapp.dto.QuestionnaireDto;
import org.springboot.msg.quizapp.entity.Questionnaire;
import org.springboot.msg.quizapp.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ViewQuestionnaireService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    public List<Questionnaire> viewQuestions(){

        val questionEntity = questionnaireRepository.findAll();
        return questionEntity;
    }
}
