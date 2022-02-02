package io.tolstjak;

import io.tolstjak.domain.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // bean scope: singleton
        Coach myCoach1 = context.getBean("myCoach", Coach.class);
        Coach myCoach2 = context.getBean("myCoach", Coach.class);
        System.out.println("Pointing to the same object: " + (myCoach1 == myCoach2));
        System.out.println(myCoach1);
        System.out.println(myCoach2);
        System.out.println("-----");
        // bean scope: prototype
        Coach myCoach21 = context.getBean("myCoach2", Coach.class);
        Coach myCoach22 = context.getBean("myCoach2", Coach.class);
        System.out.println("Pointing to the same object: " + (myCoach21 == myCoach22));
        System.out.println(myCoach21);
        System.out.println(myCoach22);

        context.close();
    }
}
