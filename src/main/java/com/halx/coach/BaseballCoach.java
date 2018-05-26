package com.halx.coach;

import com.halx.fortune.FortuneService;
import com.halx.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class BaseballCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Value("${bird.team}")
    private String teamName ;

    public BaseballCoach() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - BaseBallCoach : In no-arg constructor needed for setter DI");
    }

    public BaseballCoach(FortuneService theFortuneService) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - BaseBallCoach : In arg constructor setting up "+theFortuneService+" object");
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

    @PostConstruct
    public void doStartupStuff() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - BaseBallCoach : In startup method launched with bean initialisation");
    }

    @PreDestroy
    public void doCleanUpStuff() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - BaseBallCoach : In cleanup method launched with bean destruction");
    }



}
