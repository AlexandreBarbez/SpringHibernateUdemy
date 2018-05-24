package com.halx.coach;

import com.halx.fortune.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {
        System.out.println("BaseBallCoach : In no-arg constructor needed for setter DI");
    }

    public BaseballCoach(FortuneService theFortuneService) {
        System.out.println("BaseBallCoach : In arg constructor");
        this.fortuneService = theFortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("BaseBallCoach : In fortuneService setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit that ball ! ";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.provideFortune();
    }


}
