package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vehicleservicebean")
@Scope(scopeName = "singleton")
public class VehicleService {
    @Autowired
    private Speaker speaker;

    @Autowired
    private Tyres tyres;

    public VehicleService(){
        System.out.println("VehicleService Bean created");
    }

    public void playMusic(){
        speaker.speak();
    }

    public void moveVehicle(){
        tyres.rotate();
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public Tyres getTyres() {
        return tyres;
    }

}
