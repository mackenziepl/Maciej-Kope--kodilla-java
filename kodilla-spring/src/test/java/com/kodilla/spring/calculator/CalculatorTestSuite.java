package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = calculator.dd(2,2);
        double result2 = calculator.sub(2,2);
        double result3 = calculator.mul(2,2);
        double result4 = calculator.div(2,2);

        //Then
        Assert.assertEquals(4,result1,0.01);
        Assert.assertEquals(0,result2,0.01);
        Assert.assertEquals(4,result3,0.01);
        Assert.assertEquals(1,result4,0.01);
    }
}
