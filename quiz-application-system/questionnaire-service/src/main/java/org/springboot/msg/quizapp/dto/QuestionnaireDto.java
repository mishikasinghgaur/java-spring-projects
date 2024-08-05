package org.springboot.msg.quizapp.dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class QuestionnaireDto {

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

