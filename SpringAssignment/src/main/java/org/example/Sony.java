package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sony implements Speaker{

    public Sony(){
        System.out.println("Sony Bean created");
    }

    public void speak(){
        System.out.println("Listening using Sony");
    }
}
