package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");

        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        System.out.println("Vehicle name : "+vehicle.getName());
        vehicle.printHello("UK");
    }
}
