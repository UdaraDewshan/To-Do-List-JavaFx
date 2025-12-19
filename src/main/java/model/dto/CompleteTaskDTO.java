package model.dto;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class CompleteTaskDTO {
    private String title;
    private String description;
    private Date date;
}
