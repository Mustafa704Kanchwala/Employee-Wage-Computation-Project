package com.mustafa.employeewagecom;

import java.util.Random;

public class EmpWageComputation 
{
	int attendance = 0;
	int emp_type = 0;
	int daily_wage = 0;
	int total_wage = 0;
	int total_working_hr = 0;
	int total_working_days = 1;
	int wage_per_hr;
	final int FULL_TIME_HR = 8;
	final int PART_TIME_HR = 4;
	int work_days ;
	
	public void empWageCalc(int work_days , int wage_per_hr, int total_workings_days ){
		
		this.wage_per_hr = wage_per_hr;
		this.work_days = work_days;
		while(total_working_hr <= total_working_hr && total_working_days <=work_days)
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
					daily_wage = FULL_TIME_HR * wage_per_hr;
					total_working_hr += FULL_TIME_HR;
					break;
				case 1:
					System.out.println("Employee is Part Timer");
					daily_wage = this.PART_TIME_HR * wage_per_hr;
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

	public static void main(String[] args) 
	{
		EmpWageComputation empWageComputation = new EmpWageComputation();
		//(WORK_DAYS, WAGE_PER_HR, TOTAL_WORKING_DAYS);
		empWageComputation.empWageCalc(20, 20, 20);
		
		EmpWageComputation cmp2 = new EmpWageComputation();
		cmp2.empWageCalc(10, 30, 21);
		
		
		
	}		
}