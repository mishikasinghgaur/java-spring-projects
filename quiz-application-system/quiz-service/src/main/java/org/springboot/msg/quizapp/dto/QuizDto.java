package org.springboot.msg.quizapp.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class QuizDto {

    String id;
    String question;
    String category;
    String difficultyLevel;
    String option1;
    String option2;
    String option3;
    String option4;
    String rightAnswer;
}

