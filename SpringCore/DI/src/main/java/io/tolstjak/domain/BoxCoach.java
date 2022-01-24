package io.tolstjak.domain;

public class BoxCoach implements Coach {

    private final FortuneService fortuneService;

    BoxCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Boxing 5 rounds";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
