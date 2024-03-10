package com.mustafa.employeewagecom;

import java.util.Random;

public class EmpWageComputation 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee wage Computation Program on Master Branch");
		int attendance = 0;
		int emp_type = 0;
		int daily_wage = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		

		Random rm = new Random();
		attendance = rm.nextInt(9)%2;
		
		
		if(attendance == 0)
		{
			System.out.println("\nEmployee is absent");
		}
		else 
		{
			System.out.println("\nEmployee is present");
			emp_type = rm.nextInt(9)%2;
			if(emp_type == 0)
			{
				System.out.println("\nEmployee is Full Timer");
				daily_wage = FULL_TIME_HR * WAGE_PER_HR;
					
			}
			else
			{
				System.out.println("\nEmployee is Part Timer");
				daily_wage = PART_TIME_HR * WAGE_PER_HR;	
			}
			System.out.println("Employee Wage =" + daily_wage);

		}
	}		
}