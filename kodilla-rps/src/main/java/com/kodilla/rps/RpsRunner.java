package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {




        boolean end = false;
        int i = 0;

        Gamer gamer1 = new Gamer("AAAA");
        Gamer gamer2 = new Gamer("Computer");


        while(!end) {
            i++;
            System.out.println("Runda " + i);
            Scanner scaner = new Scanner(System.in);
            int liczba = scaner.nextInt();
            String choosen1 = gamer1.choosen(liczba).getThingName();
            System.out.println(gamer1.choosen(liczba).getThingName());
            Computer computer = new Computer(gamer2);
            System.out.println(computer.choosen().getThingName());
            String choosen2 = computer.choosen().getThingName();
            if(choosen1.equals()choosen2) {
                System.out.println("Remis");
            } else if(choosen1.equals("Stone") && choosen2.equals()=="Scissors") {
                System.out.println("Wygrywasz!");
            } else {
                System.out.println("Przegrywasz");
            }





            if(i==3) {end = true;}
        }
    }
}
