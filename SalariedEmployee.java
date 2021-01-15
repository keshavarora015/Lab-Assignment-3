package Assignment3;

public class SalariedEmployee extends Employee {
	private double fixMoney=20000;
		
	public double getFixMoney() {
		return fixMoney;
	}

	public void setFixMoney(double money) {
		fixMoney = money;
	}
	
	public double salary()
	{
		return fixMoney;
	}
}
