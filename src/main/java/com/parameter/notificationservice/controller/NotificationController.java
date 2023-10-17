package com.parameter.notificationservice.controller;

import com.parameter.notificationservice.dto.EmailSenderRequestDto;
import com.parameter.notificationservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;
    @PostMapping("sendEmail")
    public ResponseEntity<String> sendEmailNotification(
            @RequestBody EmailSenderRequestDto emailSenderRequestDto
    ) {
        String response = notificationService.sendEmail();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
