package org.example;

import org.springframework.stereotype.Component;

@Component
public class Bose implements Speaker{

    public Bose(){
        System.out.println("Bose Bean Created");
    }

    public void speak(){
        System.out.println("Listening using Bose");
    }
}
