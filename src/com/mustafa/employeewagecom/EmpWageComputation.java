package com.mustafa.employeewagecom;

import java.util.*;

public class EmpWageComputation 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee wage Computation Program ");
		int attendance;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the attendance: [1-Present / 0=Absent]:");
		attendance = sc.nextInt();
		if(attendance == 1)
		{
			System.out.println("\nEmployee is present");
		}
		else 
		{
			System.out.println("\nEmployee is absent");
		}

		
	}
}