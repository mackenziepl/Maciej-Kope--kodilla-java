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
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> test = Numbers.exterminate(num);
        System.out.println(test);
        //Then
        Assert.assertEquals(0, test.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator Numbers = new OddNumbersExterminator();
        //When
        ArrayList<Integer> num = new ArrayList<Integer>();
        int i = 0, k = 0;
        while (num.size() < 20) {
            i++;
            num.add(i);
            if(i%2==0)
                k++;
        }
        ArrayList<Integer> test = Numbers.exterminate(num);
        System.out.println(test);
        //Then
        Assert.assertEquals(k, test.size());
    }
}
