package com.msg.ems.employee.management.system.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EmployeeDto {

    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
