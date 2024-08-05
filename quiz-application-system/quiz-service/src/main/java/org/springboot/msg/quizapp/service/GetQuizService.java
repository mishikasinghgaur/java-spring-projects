package org.springboot.msg.quizapp.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springboot.msg.quizapp.repository.GetQuestionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class GetQuizService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RestTemplate restTemplate;

    public List viewQuestions(){

        List<Question> allQuestions = restTemplate.getForObject("http://localhost:8081/v1/questions/all", List.class);
        allQuestions.stream().filter()
        return null;

    }
}
