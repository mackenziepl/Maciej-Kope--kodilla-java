package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntitiesFacadeTest {

    @Autowired
    EntitiesFacade entitiesFacade;

    @Test
    public void facadetest() {
        //Given
        Employee johnSmith1 = new Employee("John", "Smith");
        Employee stephanieClarckson1 = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky1 = new Employee("Linda", "Kovalsky");

        Company softwareMachine1 = new Company("Software Machine");
        Company dataMaesters1 = new Company("Data Maesters");
        Company greyMatter1 = new Company("Grey Matter");

        entitiesFacade.processor(johnSmith1, softwareMachine1);
        entitiesFacade.processor(stephanieClarckson1, dataMaesters1);
        entitiesFacade.processor(lindaKovalsky1, dataMaesters1);
        entitiesFacade.processor(johnSmith1, greyMatter1);
        entitiesFacade.processor(lindaKovalsky1, greyMatter1);

        entitiesFacade.save(softwareMachine1);
        entitiesFacade.save(dataMaesters1);
        entitiesFacade.save(greyMatter1);

        //When
        entitiesFacade.search("Sof", "Smith");

        //Than
       try {
                Assert.assertEquals(1, entitiesFacade.sizeCompany("Sof"));
                Assert.assertEquals(1, entitiesFacade.sizeEmployee("Smith"));
                int x = entitiesFacade.quantityCompany();
                System.out.println(x);
                entitiesFacade.cleanUp(x);
        } catch (Exception a){

        }
    }

}
