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

        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean("vehicleservicebean", VehicleService.class);

        System.out.println("vehicleService1 hashCode: "+vehicleService1.hashCode());
        System.out.println("vehicleService2 hashCode: "+vehicleService2.hashCode());

        if(vehicleService1 == vehicleService2)
            System.out.println("Both are referring to same object");
        else
            System.out.println("VehicleService is prototyped");
    }
}
