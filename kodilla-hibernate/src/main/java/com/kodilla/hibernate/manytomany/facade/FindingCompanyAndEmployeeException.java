package com.kodilla.hibernate.manytomany.facade;

public class FindingCompanyAndEmployeeException extends Exception{

    public static String ERR_COMPANY_NOT_FOUND = "Company's data not found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee's data not found";

    public FindingCompanyAndEmployeeException(String message) {
        super (message);
    }
}
