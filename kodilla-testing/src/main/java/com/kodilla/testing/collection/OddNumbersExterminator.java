package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public OddNumbersExterminator(ArrayList<Integer> list) {
        this.list = list;
    }

    public ArrayList<Integer> getList() {
        return list;
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
