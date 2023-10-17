package com.parameter.notificationservice.service.impl;

import com.parameter.notificationservice.service.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public String sendEmail() {
        return "Email has sent!";
    }
}
