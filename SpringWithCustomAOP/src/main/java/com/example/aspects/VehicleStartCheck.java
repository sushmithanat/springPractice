package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class VehicleStartCheck {
    private Logger logger = Logger.getLogger(VehicleStartCheck.class.getName());

    @Before("execution(* com.example.services.*.*(..)) && args(vehicleStarted, ..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted){
        if(!vehicleStarted)
            throw new RuntimeException("Vehicle not started");
    }
}
