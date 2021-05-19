package com.bridgelabz;

public class EmpWageBuilder {


    public static void main(String[] args) {
        //CONSTANTS
         int IS_FULL_TIME = 1;
         int IS_PART_TIME = 2;
         int WAGE_PER_HOUR = 20;
         int IS_ABSENT = 0;
        //VARIABLES
        int empHours = 0;
        int dailyEmpWage = 0;
         System.out.println("Welcome to Employee Wage Computation Program");

             //COMPUTATION
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

        //EMPLOYEE WAGE COMPUTATION
        dailyEmpWage = empHours * WAGE_PER_HOUR;
        System.out.println("Daily Employee Wage: "+ dailyEmpWage);
    }
}