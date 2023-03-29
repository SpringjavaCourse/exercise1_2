package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService notificationService;

    @Autowired // Para establecer cual constructor se ejecutara
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
