package com.halx.spring;

import com.halx.spring.coach.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SportController {

    /**
     * Main mapping on "/" url
     * @return the message to be printed when visiting "/" url on server
     */
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "It works";
    }

    /**
     * Mapping for Coach exercise on IoC and DI
     * @return the message to be printed when visiting "/coach" url on server
     */
    @RequestMapping("/coach")
    @ResponseBody
    String printCoachOrder(){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theFirstBBCoach = applicationContext.getBean("baseballCoach", Coach.class);
        Coach theSecondBBCoach = applicationContext.getBean("baseballCoach", Coach.class);
        String firstBBCoachOrder = "Object reference : "+theFirstBBCoach+" : <br> Workout of the day : "+theFirstBBCoach.getDailyWorkout()+" Fortune of the day :"+theFirstBBCoach.getDailyFortune();
        String secondBBCoachOrder = "Object reference : "+theSecondBBCoach+" : <br> Workout of the day : "+theSecondBBCoach.getDailyWorkout()+" Fortune of the day :"+theSecondBBCoach.getDailyFortune();

        Coach theFirstTCoach = applicationContext.getBean("trackCoach", Coach.class);
        Coach theSecondTCoach = applicationContext.getBean("trackCoach", Coach.class);
        String firstTCoachOrder = "Object reference : "+theFirstTCoach+" : <br> Workout of the day : "+theFirstTCoach.getDailyWorkout()+" Fortune of the day :"+theFirstTCoach.getDailyFortune();
        String secondTCoachOrder = "Object reference : "+theSecondTCoach+" : <br> Workout of the day : "+theSecondTCoach.getDailyWorkout()+" Fortune of the day :"+theSecondTCoach.getDailyFortune();

        applicationContext.close();

        return "<h2>Two different objects because of the prototype scope of the Spring bean :</h2>"+firstBBCoachOrder+"<br><br>"+secondBBCoachOrder+"<br><br><h2>Two time calling the same object because basic scope setting is Singleton : </h2>"+firstTCoachOrder+"<br><br>"+secondTCoachOrder;
    }

    public static void main(String[] args) {
        SpringApplication.run(SportController.class, args);
    }
}
