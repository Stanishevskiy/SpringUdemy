package io.tolstjak;

import io.tolstjak.domain.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach myCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(myCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
