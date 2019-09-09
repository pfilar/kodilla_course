package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.FindingCompanyAndEmployeeException;
import com.kodilla.hibernate.manytomany.facade.FindingCompanyAndEmployeeFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FindingCompanyAndEmployeeFacadeTestSuit {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private FindingCompanyAndEmployeeFacade findingFacade;

    @Test
    public void testFindCompanyByPartOfName() throws FindingCompanyAndEmployeeException {
        //Given
        Company asseco = new Company("Asseco");
        Company atos = new Company("Atos");
        Company kodilla = new Company("Kodilla");
        Company codecademy = new Company("Coding academy");
        Company kodlab  = new Company("Kodlab");

        companyDao.save(asseco);
        companyDao.save(atos);
        companyDao.save(kodilla);
        companyDao.save(codecademy);
        companyDao.save(kodlab);

        //When
        List<Company> companies = findingFacade.findCompanyByPartOfName("Kod");


        //Then
        Assert.assertEquals(2, companies.size());

        //CleanUp
        companyDao.delete(asseco);   // companyDao.deleteAll();
        companyDao.delete(atos);
        companyDao.delete(kodilla);
        companyDao.delete(codecademy);
        companyDao.delete(kodlab);
    }

    @Test
    public void FindEmployeeByPartOfName() throws FindingCompanyAndEmployeeException {
        //Given
        Employee one = new Employee("Jack", "White");
        Employee two = new Employee("Arthur", "Black");
        Employee three = new Employee("James", "Blackwood");
        Employee four = new Employee("Alex", "Burn");
        Employee five = new Employee("Thomas", "Strong");

        employeeDao.save(one);
        employeeDao.save(two);
        employeeDao.save(three);
        employeeDao.save(four);
        employeeDao.save(five);

        //When
        List<Employee> employees = findingFacade.findEmployeeByPartOfName("Bla");

        //Then
        Assert.assertEquals(2, employees.size());

        //CleanUp
        employeeDao.delete(one);
        employeeDao.delete(two);
        employeeDao.delete(three);
        employeeDao.delete(four);
        employeeDao.delete(five);
    }
}
