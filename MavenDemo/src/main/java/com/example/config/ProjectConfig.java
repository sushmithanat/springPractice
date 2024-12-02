package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="audiVehicle")
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi 8");
        return vehicle;
    }

    @Bean(value="hondaVehicle")
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Primary
    @Bean("BMWVehicle")
    Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }
}
