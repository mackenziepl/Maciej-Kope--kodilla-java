package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator Numbers = new OddNumbersExterminator();
        //When
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        ArrayList<Integer> test = Numbers.exterminate(num1);
        System.out.println(test);
        //Then
        Assert.assertEquals(num2, test);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator Numbers = new OddNumbersExterminator();
        //When
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(0,1);
        num1.add(1,2);
        num1.add(2,3);
        num1.add(3,4);
        num1.add(4,5);
        num1.add(5,6);
        num1.add(6,7);
        num1.add(7,8);
        num1.add(8,9);
        num1.add(9,10);
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(0,2);
        num2.add(1,4);
        num2.add(2,6);
        num2.add(3,8);
        num2.add(4,10);
        ArrayList<Integer> test = Numbers.exterminate(num1);
        System.out.println(test);
        //Then
        Assert.assertEquals(num2, test);
    }
}
