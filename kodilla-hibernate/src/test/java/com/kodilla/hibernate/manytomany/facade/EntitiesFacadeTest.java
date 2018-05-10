package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntitiesFacadeTest {

    @Autowired
    EntitiesFacade entitiesFacade;

    @Test
    public void facadeCompanyTest() {
        //Given
        Employee johnSmith1 = new Employee("John", "Smith");
        Employee stephanieClarckson1 = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky1 = new Employee("Linda", "Kovalsky");

        Company softwareMachine1 = new Company("Software Machine");
        Company dataMaesters1 = new Company("Data Maesters");
        Company greyMatter1 = new Company("Grey Matter");

        softwareMachine1.getEmployees().add(johnSmith1);
        dataMaesters1.getEmployees().add(stephanieClarckson1);
        dataMaesters1.getEmployees().add(lindaKovalsky1);
        greyMatter1.getEmployees().add(johnSmith1);
        greyMatter1.getEmployees().add(lindaKovalsky1);

        johnSmith1.getCompanies().add(softwareMachine1);
        johnSmith1.getCompanies().add(greyMatter1);
        stephanieClarckson1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(greyMatter1);

        entitiesFacade.save(softwareMachine1);
        int softwareMachineId = softwareMachine1.getId();
        entitiesFacade.save(dataMaesters1);
        int dataMaestersId = dataMaesters1.getId();
        entitiesFacade.save(greyMatter1);
        int greyMatterId = greyMatter1.getId();

        System.out.println(softwareMachineId);
        System.out.println(dataMaestersId);
        System.out.println(greyMatterId);

        List<Company> threeFirstLetters = null;
        try {
            threeFirstLetters = entitiesFacade.searchCompany("Sof");
        } catch (EntitiesFacadeException e) {
            e.printStackTrace();
        }

        System.out.println(threeFirstLetters);

        //When && Than
        try {
        //List<Employee> threeFirstLetters = entitiesFacade.searchEmployee("Smith");



           //Assert.assertEquals(1, threeFirstLetters.size());
           Assert.assertEquals(1, threeFirstLetters.size());



                int x = entitiesFacade.quantityCompany();
                System.out.println(x);
                entitiesFacade.cleanUp(x);
        } catch (Exception e){
        }
        //CleanUp
//        entitiesFacade.delete(softwareMachineId);
//        entitiesFacade.delete(dataMaestersId);
//        entitiesFacade.delete(greyMatterId);
    }

    @Test
    public void facadeEmployeeTest() {
        //Given
        Employee johnSmith1 = new Employee("John", "Smith");
        Employee stephanieClarckson1 = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky1 = new Employee("Linda", "Kovalsoky");

        Company softwareMachine1 = new Company("Software Machine");
        Company dataMaesters1 = new Company("Data Maesters");
        Company greyMatter1 = new Company("Grey Matter");

        softwareMachine1.getEmployees().add(johnSmith1);
        dataMaesters1.getEmployees().add(stephanieClarckson1);
        dataMaesters1.getEmployees().add(lindaKovalsky1);
        greyMatter1.getEmployees().add(johnSmith1);
        greyMatter1.getEmployees().add(lindaKovalsky1);

        johnSmith1.getCompanies().add(softwareMachine1);
        johnSmith1.getCompanies().add(greyMatter1);
        stephanieClarckson1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(greyMatter1);

        entitiesFacade.save(softwareMachine1);
        int softwareMachineId = softwareMachine1.getId();
        entitiesFacade.save(dataMaesters1);
        int dataMaestersId = dataMaesters1.getId();
        entitiesFacade.save(greyMatter1);
        int greyMatterId = greyMatter1.getId();

        System.out.println(softwareMachineId);
        System.out.println(dataMaestersId);
        System.out.println(greyMatterId);

        //When && Than
        try {
            List<Employee> lastname = entitiesFacade.searchEmployee("Smith");

            System.out.println(lastname);

            Assert.assertEquals(1, lastname.size());

            //CleanUp
            entitiesFacade.delete(softwareMachineId);
            entitiesFacade.delete(dataMaestersId);
            entitiesFacade.delete(greyMatterId);

//                int x = entitiesFacade.quantityCompany();
//                System.out.println(x);
//                entitiesFacade.cleanUp(x);
        } catch (Exception e){

        }
    }
}
