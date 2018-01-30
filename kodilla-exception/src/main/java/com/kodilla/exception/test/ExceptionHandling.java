package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

       try {
           String result = secondChallenge.probablyIWillThrowException(1.5, 0.6);
       } catch(Exception e) {
           System.out.println("Problem " + e);
       } finally {
           System.out.println("I am gonna be here... always!");
       }
    }
}
