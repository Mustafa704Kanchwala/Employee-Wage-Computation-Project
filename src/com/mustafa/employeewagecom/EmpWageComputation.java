package com.mustafa.employeewagecom;

import java.util.Random;

public class EmpWageComputation 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee wage Computation Program on Master Branch");
		int attendance;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int DAILY_EMP_WAGE = 0;

		Random rm = new Random();
		attendance = rm.nextInt(9)%2;
		if(attendance == 1)
		{
			System.out.println("\nEmployee is present");
			DAILY_EMP_WAGE = FULL_DAY_HOUR * WAGE_PER_HOUR;
			System.out.println("Employee Wage =" + DAILY_EMP_WAGE);
			
		}
		else 
		{
			System.out.println("\nEmployee is absent");
		}
	}
}