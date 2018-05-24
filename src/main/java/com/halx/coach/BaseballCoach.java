package com.halx.coach;

import com.halx.fortune.FortuneService;

public class BaseballCoach implements Coach {

    FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
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
