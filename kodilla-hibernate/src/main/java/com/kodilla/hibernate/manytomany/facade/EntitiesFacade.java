package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class EntitiesFacade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public void processor(Employee employee, Company company) {
        employee.getCompanies().add(company);
        company.getEmployees().add(employee);
    }

    public void save(Company company) {
        companyDao.save(company);
    }


    public void search(String findCompany, String findEmployee) {
        List<Company> threeFirstLetters = companyDao.retrieveWithThreeFirstLetters(findCompany);
        List<Employee> lastname = employeeDao.retrieveWithLastname(findEmployee);
    }


    public int sizeCompany(String findCompany) {
        List<Company> threeFirstLetters = companyDao.retrieveWithThreeFirstLetters(findCompany);
        for (Company theList : threeFirstLetters) {
            System.out.println(theList);
        }
        return threeFirstLetters.size();
    }

    public int sizeEmployee(String findEmployee) {
        List<Employee> lastname = employeeDao.retrieveWithLastname(findEmployee);
        for (Employee theList : lastname) {
            System.out.println(theList);
        }
        return lastname.size();
    }

    public int quantityCompany() {
        long quantity = companyDao.count();
        return (int)quantity;
    }

    public void cleanUp(int x) {
        for (int i=x; i>0; i--)
        companyDao.delete(i);

    }
}
