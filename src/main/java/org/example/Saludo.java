package org.example;

import org.springframework.stereotype.Component;

@Component
public class Saludo {

    public Saludo() {
    }

    public void imprimirSaludo(){
        System.out.println("Imprimiendo saludo");
    }

}
