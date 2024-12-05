package org.example.autowiringbeanapproach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle veh=new Vehicle();
        veh.setName("Toyoto");
        return veh;
    }

    @Bean
    public Person person(Vehicle vehicle){
        Person person = new Person();
        person.setName("Lucky");
        person.setVehicle(vehicle());
        return person;
    }
}
