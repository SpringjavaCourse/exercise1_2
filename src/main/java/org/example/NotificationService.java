package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {



    public void printSaludo(){
        System.out.println("Souy un saludo desde NotificationService");
    }
}
