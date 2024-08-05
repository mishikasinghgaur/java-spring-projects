package org.springboot.msg.quizapp.service;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.modelmapper.ModelMapper;
import org.springboot.msg.quizapp.dto.QuestionnaireDto;
import org.springboot.msg.quizapp.entity.Questionnaire;
import org.springboot.msg.quizapp.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddQuestionnaireService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    public QuestionnaireDto addQuestions(QuestionnaireDto questionnaireDto){

        val questionEntity = questionnaireRepository.save(modelMapper.map(questionnaireDto, Questionnaire.class));
        log.info("entity" + questionEntity);
        return modelMapper.map(questionEntity, QuestionnaireDto.class);
    }
}
