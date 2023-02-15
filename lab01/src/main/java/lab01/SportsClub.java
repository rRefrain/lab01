package lab01;

public class SportsClub {
	DietService dietService;
	TrainingService trainingService;
	
	static {
		System.out.println("SIB - Sports Club");
	}
	
	public void setDietService(DietService dietService) {
		this.dietService = dietService;
	}
	
	public void setTrainingService(TrainingService trainingService) {
		this.trainingService = trainingService;
	} 
	
	public void becomeMember() {
		dietService.dietServiceInfo();
		trainingService.trainingServiceInfo();
	}
}
