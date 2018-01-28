package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

       try {
        String result = secondChallenge.probablyIWillThrowException(0.5, 0.6);
       } catch() {

        }
    }
}
