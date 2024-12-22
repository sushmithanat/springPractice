package com.example.services;

import com.example.Song;
import com.example.Speakers;
import com.example.Tyres;
import com.example.interfaces.LogAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleService {
    private Logger logger = Logger.getLogger(VehicleService.class.getName());

    public VehicleService(){
        System.out.println("Vehicle Services Obj created");
    }


    private Speakers speakers;
    private Tyres tyres;

    @Autowired
    public VehicleService(Speakers speakers, Tyres tyres){
        this.tyres =  tyres;
        this.speakers = speakers;
    }

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song){
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted){
//        throw new NullPointerException("Damn! null pointer exception occurred!");
        return tyres.rotate();
    }

    public String applyBrakes(boolean vehicleStarted){
        return tyres.stop();
    }
}
