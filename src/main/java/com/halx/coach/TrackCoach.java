package com.halx.coach;

import com.halx.fortune.FortuneService;
import com.halx.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {


    private FortuneService fortuneService;

    @Value("${dog.team}")
    private String teamName = "";

    public TrackCoach() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - TrackCoach : In no-arg constructor required for setter DI");
    }

    @Autowired
    public TrackCoach(@Qualifier("motivationalFortuneService") FortuneService theFortuneService) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - TrackCoach : In arg constructor setting up "+theFortuneService+" object");
     this.fortuneService = theFortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - TrackCoach : In FortuneService setter setting up "+fortuneService+" object");
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

    public void doStartupStuff() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - TrackCoach : In startup method launched with bean initialisation");
    }

    public void doCleanUpStuff() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - TrackCoach : In cleanup method launched with bean destruction");
    }
}
