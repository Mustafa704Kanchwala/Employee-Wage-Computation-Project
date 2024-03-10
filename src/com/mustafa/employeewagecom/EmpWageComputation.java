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
		int total_wage = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WORK_DAYS = 20;
	
		for(int i = 1; i <= WORK_DAYS; i++)
		{
			System.out.println("Day:-"+i);
			Random rm = new Random();
			attendance = rm.nextInt(9)%2;
			
			switch(attendance) {
			case 0:
				System.out.println("Employee is absent");
				break;
			case 1:
				System.out.println("Employee is present");
				emp_type = rm.nextInt(9)%2;
				switch(emp_type) {
				case 0:
					System.out.println("Employee is Full Timer");
					daily_wage = FULL_TIME_HR * WAGE_PER_HR;
					break;
				case 1:
					System.out.println("Employee is Part Timer");
					daily_wage = PART_TIME_HR * WAGE_PER_HR;
					break;
				}
				total_wage += daily_wage;
				System.out.println("Employee Wage =" + daily_wage);
				break;
			}
			System.out.println("----------------------");
		}System.out.println("Monthly Wages:-"+total_wage);
		
	}		
}