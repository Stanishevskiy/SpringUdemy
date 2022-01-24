package io.tolstjak;

import io.tolstjak.domain.Coach;
import io.tolstjak.domain.TrackCoach;

public class MyApp {

    public static void main(String[] args) {

        Coach coach = new TrackCoach();

        System.out.println(coach.getDailyWorkout());
    }
}
