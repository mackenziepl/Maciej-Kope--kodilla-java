package com.kodilla.rps;

import java.util.Scanner;

public class GameProcessor {

    public void menu() {
        System.out.println("==========>> GRA W PAPIER, KAMIEN, NOŻYCE <<==========");
        System.out.println();
        System.out.println("1. Zagranie kamień");
        System.out.println("2. Zagranie papier");
        System.out.println("3. Zagranie nożyce");
        System.out.println("4. Zakończenie gry - X");
        System.out.println("5. Uruchomienie gry od nowa - N");
        System.out.println();
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
                } else {
                    System.out.println("Przegrywasz grę : " + wyn1 + " do " + wyn2);
                }

        System.out.println();
    }

        public boolean gameOver(char a ) {
        boolean x;

                if(a==120){
                    System.out.println("Czy na pewno zakończyć grę? " + " T/N");
                    a = scanerChar();
                    if(a==116) {x = true;
                    } else {x = false;}
                } else if(a==110){
                    System.out.println("Czy na pewno zakończyć aktualną grę? " + " T/N");
                    a = scanerChar();
                    if(a==116) {x = true;
                    } else {x = false;}
                }
                    else  {x = false;}


            return x;
        }

        public void gamee(char a) {

            if(a==49 || a==50 || a==51) {choosen1(a);}
            else if(a==120 || a==110) {gameOver(a);}
            else {
                System.out.println("Niedozwolony klawisz. Spróbuj jeszcze raz.");
                while (a!=49 || a!=50 || a!=51 || a!=120 || a!=110) {
                    scanerChar();
                }
            }


        }




   }
