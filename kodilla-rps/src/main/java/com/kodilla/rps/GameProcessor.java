package com.kodilla.rps;

import java.util.Scanner;

public class GameProcessor {

    public void menu() {
        System.out.println("==========>> GRA W PAPIER, KAMIEN, NOŻYCE <<==========");
        System.out.println();
        System.out.println(">> Zagranie kamień - klawisz '1'");
        System.out.println(">> Zagranie papier - klawisz '2'");
        System.out.println(">> Zagranie nożyce - klawisz '3'");
        System.out.println(">> Nowa gra - klawisz 'n'");
        System.out.println(">> Koniec gry - klawisz 'x' ");

        System.out.println();
    }

    public int catCH(Thing thing) {
        int c = 0;
        if (thing == null) {
            System.out.println("Czy na pewno zakończyć aktualną grę? " + " T/N");
            char b;
            do {
                b = scanerChar();
            } while (b != 116 && b != 110);
            if (b == 116) c = 0;
            else c = 1;
        }
        return c;
    }

    public Thing switchGame(char b) {

        while(b!=49 && b!=50 && b!=51 && b!=120 && b!=110) {
            b = scanerChar();
        }
        switch(b) {
            case 49:
            case 50:
            case 51:{
                return choosen1(b);
            }
            case 120: {

                break;
            }
            case 110: {

                break;
            }

            default: {
                System.out.println("Ta gra nie obsługuje tego klawisza.");
                return null;
            }
        }
        return null;
    }

    public int scanerInt() {
        Scanner scaner = new Scanner(System.in);
        int x = scaner.nextInt();
        return x;
    }

    public char scanerChar() {
        Scanner scaner = new Scanner(System.in);
        char a = scaner.next().charAt(0);
        return a;
    }


    public Thing choosen(int liczba) {
        Thing object;
        if(liczba == 1) {
            object = new Stone();
        } else if(liczba == 2) {
            object = new Paper();
        } else {
            object = new Scissors();
        }
        return object;
    }

    public Thing choosen1(char liczba) {
        Thing object;
        if(liczba == 49) {
            object = new Stone();
        } else if(liczba == 50) {
            object = new Paper();
        } else {
            object = new Scissors();
        }
        return object;
    }

    public int resultInt(char gamer1, int gamer2) {
            int gamer3 = gamer1-'0';
        if (gamer3 == gamer2) {
            System.out.println("Remis");
            return 0;
        } else if ((gamer3 == 3 && gamer2 == 2) || (gamer3 == 2 && gamer2 == 1)
                || gamer3 == 1 && gamer2 == 3) {
            System.out.println("Wygrywasz!");
            return 1;
        } else {
            System.out.println("Przegrywasz!");
            return 2;}
    }


    public void result(int wyn1, int wyn2) {
        if(wyn1 > wyn2) {
            System.out.println("Wygrywasz grę : " + wyn1 + " do " + wyn2);
        } else if (wyn1 < wyn2) {
            System.out.println("Przegrywasz grę : " + wyn1 + " do " + wyn2);
        } else {
            System.out.println("Remis: " + wyn1 + " do " + wyn2);
        }
        System.out.println();
    }

    }
