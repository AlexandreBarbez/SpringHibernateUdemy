package com.halx.coach;

import com.halx.fortune.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    private String teamName;

    public TrackCoach() {
        System.out.println("TrackCoach : In no-arg constructor required for setter DI");
    }

    public TrackCoach(FortuneService theFortuneService) {
        System.out.println("TrackCoach : In arg constructor");
     this.fortuneService = theFortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TrackCoach : In FortuneService setter");
        this.fortuneService = fortuneService;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Run for the "+this.teamName+" !!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.provideFortune();
    }
}
