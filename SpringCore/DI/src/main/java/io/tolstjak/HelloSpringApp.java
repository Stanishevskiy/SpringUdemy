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

        // let's call our new method for fortunes
        System.out.println(myCoach.getDailyFortune());

        // 2-nd coach
        Coach myCoach2 = context.getBean("myCoach2", Coach.class);
        System.out.println(myCoach2.getDailyWorkout());
        System.out.println(myCoach2.getDailyFortune());

        // close the context
        context.close();
    }
}
