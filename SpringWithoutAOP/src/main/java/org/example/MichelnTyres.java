package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelnTyres implements Tyres{
    @Override
    public String rotate() {
        return "Vehicle moving with MichelnTyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with MichelnTyres";
    }
}
