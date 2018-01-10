package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator(5,4);

        int result1 = calculator.add(5,4);

        if (result1 == 9)
            System.out.println("test OK");
        else
            System.out.println("Error!");

        int result2 = calculator.subtract(5,4);

        if (result2 == 1)
            System.out.println("test OK");
        else
            System.out.println("Error!");
    }
}
