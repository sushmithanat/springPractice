package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres{

    public MichelinTyres(){
        System.out.println("MichelinTyres Bean created");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating tyres using MichelinTyres");
    }
}
