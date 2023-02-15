package lab01;

public class DietService {
	double dietServiceFee;
	String dietType;
	static {
		System.out.println("SIB - Diet Service");
	}
	//Setter
	public void setFee(double dietServiceFee) {
		this.dietServiceFee = dietServiceFee;
	}
	public void setDietType(String dietType) {
		this.dietType = dietType;
	}
	public void dietServiceInfo() {
		System.out.println(dietType + " will cost you " + dietServiceFee);
	}
}
