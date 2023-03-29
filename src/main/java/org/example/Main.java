package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        //Ejercicio 1
        Saludo saludo = (Saludo) context.getBean("saludo");
        saludo.imprimirSaludo();

        //Ejercicio 2
        UserService userService = (UserService) context.getBean("userService");
        userService.notificationService.printSaludo();




    }
}