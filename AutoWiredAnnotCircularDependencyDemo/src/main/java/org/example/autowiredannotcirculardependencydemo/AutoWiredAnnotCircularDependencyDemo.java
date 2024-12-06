package org.example.autowiredannotcirculardependencydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AutoWiredAnnotCircularDependencyDemo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person per = context.getBean(Person.class);
//        Vehicle veh = context.getBean(Vehicle.class);

        System.out.println("Person name from Spring context is: "+per.getName());
//        System.out.println("Vehicle name from Spring context is: "+veh.getName());
        System.out.println("Vehicle that Person own is: "+per.getVehicle());
    }

}
