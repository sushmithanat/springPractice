package org.example;

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

    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public String playMusic(boolean vehicleStarted, Song song){
        Instant start = Instant.now();
        logger.info("method execution started");
        String music=null;
        if(vehicleStarted){
            music = speakers.makeSound(song);
        }
        else{
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        logger.info("method execution stopped");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method: "+timeElapsed);
        return music;
    }

    public String moveVehicle(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method execution started");
        String move=null;
        if(vehicleStarted){
            move = tyres.rotate();
        }
        else{
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        logger.info("method execution stopped");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method: "+timeElapsed);
        return move;
    }

    public String applyBrakes(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method execution started");
        String status=null;
        if(vehicleStarted){
            status = tyres.stop();
        }
        else{
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        logger.info("method execution stopped");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method: "+timeElapsed);
        return status;
    }
}
