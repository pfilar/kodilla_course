package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindingCompanyAndEmployeeFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(FindingCompanyAndEmployeeFacade.class);

    public List<Company> findCompanyByPartOfName(String partOfName) throws FindingCompanyAndEmployeeException {
        List<Company> companies = companyDao.retrieveCompaniesContainString(partOfName);

        if (companies.isEmpty()) {
            throw new FindingCompanyAndEmployeeException((FindingCompanyAndEmployeeException.ERR_COMPANY_NOT_FOUND));
        }
        return companies;
    }

    public List<Employee> findEmployeeByPartOfName(String partOfName) throws FindingCompanyAndEmployeeException {
        List<Employee> employees = employeeDao.retrieveEmployeesContainString(partOfName);

        if (employees.isEmpty()) {
            throw new FindingCompanyAndEmployeeException((FindingCompanyAndEmployeeException.ERR_EMPLOYEE_NOT_FOUND));
        }
        return employees;
    }
}
