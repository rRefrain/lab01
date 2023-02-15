package lab01;

public class TrainingService {
	double trainingServiceFee;
	String trainingType;
	
	static {
		System.out.println("SIB - TrainingService");
	}
	
	public TrainingService(double trainingServiceFee, String trainingType) {
		super();
		this.trainingServiceFee = trainingServiceFee;
		this.trainingType = trainingType;
	}
	public void trainingServiceInfo() {
		System.out.println(trainingType + " training will cost you " + trainingServiceFee);
	}
}
