package Assignment3;

public class CommissionEmployee extends Employee {
	private double percentage=25;
	private double sales;
	
	public CommissionEmployee() {
	}
	
	
	public void setSales(double sales)
	{
		this.sales=sales;
	}
	public void setPercentage(double percent)
	{
		this.percentage=percent;
	}
	public double getPercentage()
	{
		return percentage;
	}
	
	public double salary()
	{
		return (percentage *sales)/100.0;
	}
}
