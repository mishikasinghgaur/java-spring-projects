package org.springboot.msg.quizapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Document("questionnaire")
public class Questionnaire {
    @Id
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

