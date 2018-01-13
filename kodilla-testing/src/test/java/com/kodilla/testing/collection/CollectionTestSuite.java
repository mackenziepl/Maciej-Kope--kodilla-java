package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    private static ArrayList<Integer> number() {
        ArrayList<Integer> num = new ArrayList<>();
        int i =0;
        while(num.size()<20) {
            i++;
            num.add(i);
        }
        return num;
    }
    private static ArrayList<Integer> num;

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
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
    public void testOddNumbersExterminatorList() {
        //Given
        OddNumbersExterminator Numbers = new OddNumbersExterminator(number());
        //When
        ArrayList<Integer> test = Numbers.exterminate(number());
        System.out.println(test);
        //Then
        Assert.assertNotEquals(number(),test);

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator Numbers = new OddNumbersExterminator(number());
        //When
        ArrayList<Integer> test = Numbers.getList();
        System.out.println(test);
        //Then
        Assert.assertEquals(number(), test);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator Numbers = new OddNumbersExterminator(num);
        //When
        ArrayList<Integer> test = Numbers.getList();
        System.out.println(test);
        //Then
        Assert.assertEquals(num, test);
    }
}
