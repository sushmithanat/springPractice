package org.example;

import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres{
    @Override
    public String rotate() {
        return "Vehicle moving with BridgeStoneTyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with BridgeStoneTyres";
    }
}
