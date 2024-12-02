package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Primary Annotaion: "+vehicle.getName());

        vehicle = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle nme: "+vehicle.getName());

        vehicle = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle nme: "+vehicle.getName());

        vehicle = context.getBean("BMWVehicle",Vehicle.class);
        System.out.println("Vehicle nme: "+vehicle.getName());


    }
}
