package com.bridgelabz;

public class EmpWageBuilder {


    public static void main(String[] args) {
        //CONSTANTS
         int IS_FULL_TIME = 1;
         int IS_PART_TIME = 2;
         int WAGE_PER_HOUR = 20;
         int IS_ABSENT = 0;
         int MONTHLY_WORKING_DAYS = 20;
         int TOTAL_WORKING_HOURS = 100;

        //VARIABLES
        int empHours = 0;
        int dailyEmpWage = 0;
        int empMonthlyWages = 0;
        int workingHours = 0;
        int workingDays = 0;
         System.out.println("Welcome to Employee Wage Computation Program");

             //COMPUTATION
        while (  workingHours < TOTAL_WORKING_HOURS && workingDays < MONTHLY_WORKING_DAYS )    {
                workingDays++;
             int empCheck = (int) (Math.random() * 10 ) % 3;
             switch (empCheck)  {
                 case 1:
                         System.out.println("Employee is Present");
                         empHours = 8;
                         break;
                 case 2:
                         System.out.println("Employee Present Part Time");
                         empHours = 4;
                         break;
                 case 0:
                         System.out.println("Employee Absent");
                         empHours = 0;
            }
                    workingHours += empHours;
             //EMPLOYEE WAGE COMPUTATION
             dailyEmpWage = empHours * WAGE_PER_HOUR;
             empMonthlyWages += dailyEmpWage;
             System.out.println("Daily Employee Wage: "+ dailyEmpWage);
        }
            System.out.println("Monthly Employee Wages: " + empMonthlyWages);
    }
}