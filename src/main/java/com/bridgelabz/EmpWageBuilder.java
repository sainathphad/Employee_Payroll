package com.bridgelabz;

public class EmpWageBuilder {


    public static void main(String[] args) {
        //CONSTANTS
         int IS_FULL_TIME = 1;
         int WAGE_PER_HOUR = 20;

        //VARIABLES
        int empHours = 0;
        int dailyEmpWage = 0;
         System.out.println("Welcome to Employee Wage Computation Program");

             //COMPUTATION
         double empCheck = Math.floor(Math.random() * 10) % 2;
         if(empCheck == IS_FULL_TIME)
            empHours = 8;
         else
            empHours = 0;

        //EMPLOYEE WAGE COMPUTATION
        dailyEmpWage = empHours * WAGE_PER_HOUR;
        System.out.println("Daily Employee Wage: "+ dailyEmpWage);
    }
}