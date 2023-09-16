package org.example;

import org.example.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("myBasketBallCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);
        System.out.println(cricketCoach.getDailyWorkout());
    }
}