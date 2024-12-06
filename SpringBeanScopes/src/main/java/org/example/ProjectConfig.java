package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

   /* @Bean
    public Person person(){
        Person per=new Person();
        per.setName("Anandi");
        return per;
    }

    @Bean
    public Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean
    public VehicleService vehicleService(){
        VehicleService veh = new VehicleService();
        return veh;
    }

    @Bean
    @Primary
    public Sony sony(){
        Sony sony = new Sony();
        return sony;
    }

    @Bean
    public Bose bose(){
        Bose bose = new Bose();
        return bose;
    }

    @Bean
    public BridgeStoneTyres bridgeStoneTyres(){
        BridgeStoneTyres bridgeStoneTyres = new BridgeStoneTyres();
        return bridgeStoneTyres;
    }

    @Bean
    @Primary
    public MichelinTyres michelinTyres(){
        MichelinTyres michelinTyres = new MichelinTyres();
        return michelinTyres;
    }*/
}
