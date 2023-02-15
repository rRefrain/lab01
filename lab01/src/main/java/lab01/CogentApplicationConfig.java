package lab01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CogentApplicationConfig {
	@Bean
	public DietService getDietService() {
		DietService dietService = new DietService();
		dietService.setDietType("Protien Diet");
		dietService.setFee(100);
		return dietService;
	}
	
	@Bean
	public TrainingService getTrainingService() {
		TrainingService trainingService = new TrainingService(200, "Cardio");
		return trainingService;
	}
	
	@Bean("sportsClub")
	public SportsClub getSportsClub(DietService dietService, TrainingService trainingService) {
		SportsClub sportsClub = new SportsClub();
		
		//Task3: Inject Depenedencies
		sportsClub.setDietService(dietService);
		sportsClub.setTrainingService(trainingService);
		return sportsClub;
	}
}
