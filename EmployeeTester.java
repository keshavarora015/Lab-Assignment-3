package Assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EmployeeTester {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Which Type of Employee category you belong to ");
		System.out.println(" 1. Salaried Employee ");
		System.out.println(" 2. Hourly Employee");
		System.out.println(" 3. Commision Employee");
		int type = Integer.parseInt(input.readLine());

		int typeEmployee = type;
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		if(typeEmployee==1)
		employeeList.add(new SalariedEmployee());
		else if(typeEmployee==2)
		employeeList.add(new HourlyEmployee());
		else if(typeEmployee==3)
		employeeList.add(new CommissionEmployee());

		while (true) {
			System.out.println("What you Want");
			System.out.println("1. Weekly Salary");
			System.out.println("2. Increment Salary");
			System.out.println("3. Set Rate of Employee");
			System.out.println("4. Exit");
			type = Integer.parseInt(input.readLine());

			if (type == 1) {
				if (typeEmployee == 1) {
					double money=0.0;
					for(int i=0;i<employeeList.size();i++)
					{
						if(employeeList.get(i) instanceof SalariedEmployee)
						{
							money=employeeList.get(i).salary();
							break;
						}
					}
					System.out.println(" Salary : " + money);
					
				} else if (typeEmployee == 2) {
					System.out.println("Enter number of hour you worked :");
					double hours = Double.parseDouble(input.readLine());
					double money=0.0;
					for(int i=0;i<employeeList.size();i++)
					{
						if(employeeList.get(i) instanceof HourlyEmployee)
						{
							HourlyEmployee emp= (HourlyEmployee) employeeList.get(i);
							emp.setHours(hours);
							money=employeeList.get(i).salary();
							break;
						}
					}
					System.out.println(" Salary : " + money);
				} else if (typeEmployee == 3) {
					System.out.println("Enter Number of sales you have done");
					double sales = Double.parseDouble(input.readLine());
					double money=0;
					for(int i=0;i<employeeList.size();i++)
					{
						if(employeeList.get(i) instanceof CommissionEmployee)
						{
							CommissionEmployee emp= (CommissionEmployee) employeeList.get(i);
							emp.setSales(sales);
							money=employeeList.get(i).salary();
							break;
						}
					}
					System.out.println(" Salary : " + money);
				}
			} else if (type == 2) {
				if (typeEmployee == 1) {
					System.out.println("Please Enter incremented amount");
					double money = Double.parseDouble(input.readLine());
					double increment= 0;
					for(int i=0;i<employeeList.size();i++)
					{
						if(employeeList.get(i) instanceof SalariedEmployee)
						{
							SalariedEmployee emp= (SalariedEmployee) employeeList.get(i);
							increment=money+emp.getFixMoney();
							emp.setFixMoney(increment);
							break;
			
						}
					}
					System.out.println(" Salary : " + money);
					System.out.println("Increment updated");
				} else if (typeEmployee == 2) {
					System.out.println("Please Enter incremented amount");
					double money = Double.parseDouble(input.readLine());
					double increment=0;
					for(int i=0;i<employeeList.size();i++)
					{
						if(employeeList.get(i) instanceof HourlyEmployee)
						{
							HourlyEmployee emp= (HourlyEmployee) employeeList.get(i);
							increment =money+emp.salary();
							emp.setHourlyMoney(increment);
							break;
						}
					}
					System.out.println(" Salary : " + money);
					System.out.println("Increment updated");
				} else if (typeEmployee == 3) {
					System.out.println("Please Enter incremented amount");
					double money = Double.parseDouble(input.readLine());
					double increment=0;
					for(int i=0;i<employeeList.size();i++)
					{
						if(employeeList.get(i) instanceof CommissionEmployee)
						{
							CommissionEmployee emp= (CommissionEmployee) employeeList.get(i);
							increment =money+emp.salary();
							emp.setPercentage(increment);
							break;
			
						}
					}
					System.out.println(" Salary : " + money);
					System.out.println("Increment updated");
				}
			} else if (type == 3) {
				if (typeEmployee == 1) {
					System.out.println("Enter the new rate you want to set for employee");
					double newRate = Double.parseDouble(input.readLine());
					for(int i=0;i<employeeList.size();i++)
					{
						if(employeeList.get(i) instanceof SalariedEmployee)
						{
							SalariedEmployee emp= (SalariedEmployee) employeeList.get(i);
							emp.setFixMoney(newRate);
							break;
			
						}
					}
					System.out.println("Rate Updated!!");
				} else if (typeEmployee == 2) {
					System.out.println("Enter the new Hourly Money you want to set for an employe");
					double newRate = Double.parseDouble(input.readLine());
					for(int i=0;i<employeeList.size();i++)
					{
						if(employeeList.get(i) instanceof SalariedEmployee)
						{
							HourlyEmployee emp= (HourlyEmployee) employeeList.get(i);
							emp.setHourlyMoney(newRate);
							break;
			
						}
					}
					
					System.out.println("Rate updated!!");
				} else if (typeEmployee == 3) {
					System.out.println("Enter the new Percentage you want to set for Employee");
					double newRate = Double.parseDouble(input.readLine());
					for(int i=0;i<employeeList.size();i++)
					{
						if(employeeList.get(i) instanceof SalariedEmployee)
						{
							CommissionEmployee emp= (CommissionEmployee) employeeList.get(i);
							emp.setPercentage(newRate);
							break;
			
						}
					}
					System.out.println("Rate Updated!!");
				}
			} else if (typeEmployee == 4)
				break;
			System.out.println("Do You Want to Continue");
			System.out.println(" 1.Yes ");
			System.out.println(" 2.No  ");
			type = Integer.parseInt(input.readLine());
			if (type == 2) {
				break;
			}

		}

	}

}
