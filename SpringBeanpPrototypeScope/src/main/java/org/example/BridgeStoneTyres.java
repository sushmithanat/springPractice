package org.example;

import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres{
    public BridgeStoneTyres(){
        System.out.println("BridgeStoneTyres Bean created");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating tyres using BridgeStoneTyres");
    }
}
