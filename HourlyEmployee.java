package Assignment3;

public class HourlyEmployee extends Employee {
	private double hourlyMoney=1000;
	private double hours;
	public HourlyEmployee()
	{}
	HourlyEmployee(double hours)
	{
		this.hours=hours;
	}
	public void setHours(double hour)
	{
		this.hours=hour;
	}
	public double getHourlyMoney()
	{
		return hourlyMoney;
	}
	public void setHourlyMoney(double money)
	{
		this.hourlyMoney=money;
	}
	public double salary()
	{
		return hours*hourlyMoney; 
	}
}
