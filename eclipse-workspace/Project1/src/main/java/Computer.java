
public class Computer {
	private int regNo;
	private String model;
	private float cost;
	public Computer(int regNo, String model, float cost) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.cost = cost;
	}
	public int getRegNo() {
		return regNo;
	}
	public String getModel() {
		return model;
	}
	public float getCost() {
		return cost;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void computerData() {
		System.out.println("Computer Data");
		System.out.println("\tRegisteration no. "+getRegNo());
		System.out.println("\tModel name "+getModel());
		System.out.println("\tCost "+getCost());
	}
	
	
	
	
}
