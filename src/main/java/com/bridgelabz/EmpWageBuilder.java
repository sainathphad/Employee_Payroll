package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

interface empWageMethod {

    public void calculateEmpWage(CompanyEmpWage obj);
}

public class EmpWageBuilder implements empWageMethod {

    //CONSTANTS
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    //EMPLOYEE WAGE COMPUTATION
    public void calculateEmpWage(CompanyEmpWage companyEmpWage) {
        //VARIABLES
        int empHours;
        int workingHours = 0;
        int workingDays = 0;

        while (  workingHours < companyEmpWage.maxHr && workingDays < companyEmpWage.maxDay )    {
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

            companyEmpWage.dailyEmpWage = empHours * companyEmpWage.wagePrHr;

            System.out.println("Day#: " + workingDays + " Emp Hr: " + empHours);
            System.out.println("Daily Wage of " + companyEmpWage.companyName + " Employee is: " + companyEmpWage.dailyEmpWage + "\n");
        }
        companyEmpWage.empMonthlyWages = workingHours * companyEmpWage.wagePrHr;

        System.out.println( "Total Wage Of " + companyEmpWage.companyName + " Employee is: "
                                                           + companyEmpWage.empMonthlyWages + "\n" );

    }

    //COMPANY QUERY METHOD
    public static void companyQuery(){

        Scanner scanner = new Scanner(System.in);

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        // DECLARATION OF ARRAY
        ArrayList<CompanyEmpWage> company = new ArrayList<>();

        System.out.println("Enter Option To Query About Company Employee Wage: " + "\n 1.Dmart \n 2.Bridgelabz \n 3.Reliance");
        int option = Integer.valueOf(scanner.next());
        switch(option) {

            case 1:
                company.add(new CompanyEmpWage("DMart", 20, 40, 20));
                empWageBuilder.calculateEmpWage(company.get(0));
                break;

            case 2:
                company.add(new CompanyEmpWage("Bridgelabz", 25, 60, 20));
                empWageBuilder.calculateEmpWage(company.get(0));
                break;

            case 3:
                company.add(new CompanyEmpWage("Reliance", 15, 45, 25));
                empWageBuilder.calculateEmpWage(company.get(0));
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println( " Welcome to Employee Wage Computation Program " );

        companyQuery();
    }
}

// CLASS COMPANY EMP WAGE
class CompanyEmpWage {
    int wagePrHr, maxHr, maxDay, dailyEmpWage, empMonthlyWages;
    String companyName;

    //CONSTRUCTOR
    public CompanyEmpWage(String companyName, int wagePrHr, int maxHr, int maxDay) {
        this.companyName = companyName;
        this.wagePrHr = wagePrHr;
        this.maxHr = maxHr;
        this.maxDay = maxDay;
    }

}