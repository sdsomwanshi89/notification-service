package com.parameter.notificationservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailSenderRequestDto {
    private String name;
    private String email;
    private String subject;
    private String message;
}
