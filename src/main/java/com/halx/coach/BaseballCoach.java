package com.halx.coach;

import com.halx.fortune.FortuneService;
import com.halx.utils.Utils;

import java.util.Date;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    private String teamName;

    public BaseballCoach() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - BaseBallCoach : In no-arg constructor needed for setter DI");
    }

    public BaseballCoach(FortuneService theFortuneService) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - BaseBallCoach : In arg constructor setting up "+fortuneService+" object");
        this.fortuneService = theFortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - BaseBallCoach : In fortuneService setter method setting up "+fortuneService+" object");
        this.fortuneService = fortuneService;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit that ball ! make the "+this.teamName+" proud bro !";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.provideFortune();
    }


}
