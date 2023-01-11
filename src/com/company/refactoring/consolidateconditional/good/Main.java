package com.company.refactoring.consolidateconditional.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;

        if (!extraSalary()) {
            return result;
        }

        // Calculate extra salary:
        // ...
        return result;

    }

    public boolean extraSalary() {
        boolean estudios = education < 1 || seniority < 1;
        boolean antiguedad = incidents > 10 || certification;

        return estudios || antiguedad;
    }
}
