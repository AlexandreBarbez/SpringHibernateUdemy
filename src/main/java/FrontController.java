import com.halx.SportConfig;
import com.halx.coach.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class FrontController {

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
        String firstBBCoachOrder = theFirstBBCoach.getDailyWorkout()+" "+theFirstBBCoach.getDailyFortune()+"Object reference : "+theFirstBBCoach;
        String secondBBCoachOrder = theSecondBBCoach.getDailyWorkout()+" "+theSecondBBCoach.getDailyFortune()+"Object reference : "+theSecondBBCoach;

        Coach theFirstTCoach = applicationContext.getBean("trackCoach", Coach.class);
        Coach theSecondTCoach = applicationContext.getBean("trackCoach", Coach.class);
        String firstTCoachOrder = theFirstTCoach.getDailyWorkout()+" "+theFirstTCoach.getDailyFortune()+"Object reference : "+theFirstTCoach;
        String secondTCoachOrder = theSecondTCoach.getDailyWorkout()+" "+theSecondTCoach.getDailyFortune()+"Object reference : "+theSecondTCoach;


        applicationContext.close();
        return firstBBCoachOrder+"<br>"+secondBBCoachOrder+"<br><br>"+firstTCoachOrder+"<br>"+secondTCoachOrder;
    }

    public static void main(String[] args) {
        SpringApplication.run(FrontController.class, args);
    }
}
