package lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client3 {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CogentApplicationConfig.class);
		SportsClub sportsClub = (SportsClub)ctx.getBean("sportsClub");
		sportsClub.becomeMember();
	}
	
}
