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
        System.out.println("Before calling Person Bean");
        Person per = context.getBean(Person.class);
        System.out.println("After calling Person Bean");
    }
}
