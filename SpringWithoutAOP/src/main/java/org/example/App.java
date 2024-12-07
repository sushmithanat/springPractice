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
        VehicleService vehicleServices = context.getBean(VehicleService.class);
        System.out.println(vehicleServices.getClass());

        Song song = new Song();
        song.setTitle("Black Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = false;
        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
        String applyBrakesStatus = vehicleServices.applyBrakes(vehicleStarted);
    }
}
