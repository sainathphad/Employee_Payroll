package com.bridgelabz;

public class EmpWageBuilder {

    //CONSTANTS
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    //EMPLOYEE WAGE COMPUTATION
    public void calculateEmpWage(CompanyEmpWage companyEmpWage) {
        //VARIABLES
        int empHours;
        int dailyEmpWage;
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

            dailyEmpWage = empHours * companyEmpWage.wagePrHr;

            companyEmpWage.empMonthlyWages += dailyEmpWage;
        }
        System.out.println( "Total Wage Of " + companyEmpWage.companyName + " Employee is: " + companyEmpWage.empMonthlyWages );

    }
    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println( " Welcome to Employee Wage Computation Program " );

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        // DECLARATION OF ARRAY
        CompanyEmpWage[] company = new CompanyEmpWage[3];
        // OBJECT CREATION
        company[0] = new CompanyEmpWage("DMart",20,40,20);
        empWageBuilder.calculateEmpWage(company[0]);
        company[1] = new CompanyEmpWage("Bridgelabz",25,60,20);
        empWageBuilder.calculateEmpWage(company[1]);
        company[2] = new CompanyEmpWage("Reliance",15,45,25);
        empWageBuilder.calculateEmpWage(company[2]);

    }
}
// CLASS COMPANY EMP WAGE
class CompanyEmpWage {
    int wagePrHr, maxHr, maxDay, empMonthlyWages;
    String companyName;
    //CONSTRUCTOR
    public CompanyEmpWage(String companyName, int wagePrHr, int maxHr, int maxDay) {
        this.companyName = companyName;
        this.wagePrHr = wagePrHr;
        this.maxHr = maxHr;
        this.maxDay = maxDay;
    }

}