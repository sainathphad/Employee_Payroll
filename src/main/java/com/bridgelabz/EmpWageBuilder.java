package com.bridgelabz;

public class EmpWageBuilder {

    //CONSTANTS
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int MONTHLY_WORKING_DAYS = 20;
    public static final int TOTAL_WORKING_HOURS = 100;

    public static int calculateEmpWage() {
        //VARIABLES
        int empHours;
        int dailyEmpWage;
        int empMonthlyWages = 0;
        int workingHours = 0;
        int workingDays = 0;

        //COMPUTATION
        while (  workingHours < TOTAL_WORKING_HOURS && workingDays < MONTHLY_WORKING_DAYS )    {
            workingDays++;
            int empCheck = (int) (Math.random() * 10 ) % 3;
            switch (empCheck)  {
                case IS_FULL_TIME:
                    System.out.println("Employee is Present");
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee Present Part Time");
                    empHours = 4;
                    break;
                default:
                    System.out.println("Employee Absent");
                    empHours = 0;
            }
            workingHours += empHours;
            //EMPLOYEE WAGE COMPUTATION
            dailyEmpWage = empHours * WAGE_PER_HOUR;
            empMonthlyWages += dailyEmpWage;
            System.out.println("Daily Employee Wage: " + dailyEmpWage);
        }
        System.out.println("Monthly Employee Wages: " + empMonthlyWages);
        return empMonthlyWages;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        calculateEmpWage();

    }
}