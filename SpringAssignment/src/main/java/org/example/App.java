package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());

        Vehicle vehicle = person.getVehicle();
        System.out.println(vehicle.getName());

        VehicleService vehicleService = vehicle.getVehicleService();
        vehicleService.playMusic();
        vehicleService.moveVehicle();

    }
}
