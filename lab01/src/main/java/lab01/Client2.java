package lab01;

public class Client2 {
	public static void main(String[] args) {
		//Task1: Create & Initizlize DietService
		DietService dietService = new DietService();
		dietService.setDietType("Protein Diet");
		dietService.setFee(100);
		
		//Task2: Create & Initialize TrainingService
		TrainingService trainingService = new TrainingService(200, "Cardio");
		
		SportsClub sportsClub = new SportsClub();
		
		//Task3: Inject Dependencies
		sportsClub.setDietService(dietService);
		sportsClub.setTrainingService(trainingService);
	}
}
