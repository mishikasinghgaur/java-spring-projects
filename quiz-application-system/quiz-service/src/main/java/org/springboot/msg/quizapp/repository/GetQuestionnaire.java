package org.springboot.msg.quizapp.repository;

import org.springboot.msg.quizapp.entity.Quiz;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface GetQuestionnaire extends MongoRepository {
    @GetMapping("/v1/questions/all")
    List<Quiz> getQuestions();
}
