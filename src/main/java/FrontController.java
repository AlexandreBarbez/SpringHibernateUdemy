import com.halx.coach.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theFirstCoach = applicationContext.getBean("myCoach", Coach.class);
        Coach theSecondCoach = applicationContext.getBean("myCoach", Coach.class);

        applicationContext.close();

        String firstCoachOrder = theFirstCoach.getDailyWorkout()+" "+theFirstCoach.getDailyFortune()+"Object reference : "+theFirstCoach;
        String secondCoachOrder = theSecondCoach.getDailyWorkout()+" "+theSecondCoach.getDailyFortune()+"Object reference : "+theSecondCoach;

        return firstCoachOrder+"<br>"+secondCoachOrder;
    }

    public static void main(String[] args) {
        SpringApplication.run(FrontController.class, args);
    }
}
