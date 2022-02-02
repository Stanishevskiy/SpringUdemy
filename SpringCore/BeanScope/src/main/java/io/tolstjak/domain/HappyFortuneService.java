package io.tolstjak.domain;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private final String[] fortuneVars = {
            "Today is your lucky day!",
            "Something lucky will happen!",
            "Nothing interesting today will happen!"};

    private final Random random = new Random();

    @Override
    public String getFortune() {

        int i = random.nextInt(fortuneVars.length);

        return fortuneVars[i];
    }
}
