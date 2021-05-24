package com.bridgelabz;

public class EmpWageBuilder {

    //CONSTANTS
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;


    public static int calculateEmpWage(String companyName, int wagePrHr, int maxHr, int maxDay) {
        //VARIABLES
        int empHours;
        int dailyEmpWage;
        int empMonthlyWages = 0;
        int workingHours = 0;
        int workingDays = 0;

        //COMPUTATION

        while (  workingHours < maxHr && workingDays < maxDay )    {
            workingDays++;
            int empCheck = (int) (Math.random() * 10 ) % 3;
            switch (empCheck)  {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            workingHours += empHours;
            //EMPLOYEE WAGE COMPUTATION
            dailyEmpWage = empHours * wagePrHr;
            empMonthlyWages += dailyEmpWage;
        }
        System.out.println("Monthly Emp Wage For company: " +companyName+ " is: " +empMonthlyWages);
        return empMonthlyWages;
    }

    public static void main(String[] args) {

        calculateEmpWage("Dmart",20,5,10);
        calculateEmpWage("CG",10,6,20);


    }
}