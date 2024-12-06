package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("personBean")
@Lazy
public class Person {
    private String name;

    public Person(){
        System.out.println("Person obj being created...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
