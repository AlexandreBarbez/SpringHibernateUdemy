package com.halx.coach;

import com.halx.fortune.FortuneService;

public class TrackCoach implements Coach {

    private final FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService) {
     this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run !!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.provideFortune();
    }
}
