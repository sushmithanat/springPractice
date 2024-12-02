package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random rand=new Random();
        int randNum = rand.nextInt(10);
        System.out.println("random number "+randNum);

        if(randNum % 2 == 0){
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        }
        else{
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volkswagenVehicle = null;
        Vehicle audiVehicle = null;

        try{
            volkswagenVehicle = context.getBean("volkswagen", Vehicle.class);
        }
        catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating volkswagen Vehicle");
        }

        try{
            audiVehicle = context.getBean("audi", Vehicle.class);
        }
        catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Audi Vehicle");
        }

        if(volkswagenVehicle != null){
            System.out.println("Vehicle name from Spring context "+volkswagenVehicle.getName());
        }
        else{
            System.out.println("Vehicle name from Spring context "+audiVehicle.getName());
        }
    }
}
