package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    public ArrayList<Integer> number() {
        Random random = new Random();
        ArrayList<Integer> num = new ArrayList<>();
        while(num.size()<20) {
            num.add(random.nextInt(100));
        }
        return num;
    }

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
