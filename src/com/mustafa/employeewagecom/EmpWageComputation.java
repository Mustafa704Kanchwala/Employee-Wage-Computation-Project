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
		int total_working_hr = 0;
		int total_working_days = 1;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WORK_DAYS = 20;
	
		while(total_working_hr <=100 && total_working_days <= 20)
		{
			
			System.out.println("Day:-"+ total_working_days);
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
					total_working_hr += FULL_TIME_HR;
					break;
				case 1:
					System.out.println("Employee is Part Timer");
					daily_wage = PART_TIME_HR * WAGE_PER_HR;
					total_working_hr += PART_TIME_HR;
					break;
				}
				total_wage += daily_wage;
				System.out.println("Employee Wage =" + daily_wage);
				break;
			}
			System.out.println("Total Working Hours:-"+total_working_hr);
			System.out.println("----------------------");
			total_working_days++;
		}
		System.out.println("Monthly Wages:-"+total_wage);
		
	}		
}