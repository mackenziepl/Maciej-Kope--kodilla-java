package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numberEnd = new ArrayList<>();
        for(Integer select :numbers) {
            if(select %2==0) {
               numberEnd.add(select);
            }
        }
        return numberEnd;
    }
}
