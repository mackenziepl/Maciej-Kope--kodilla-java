package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        int runda = 0;
        int wynik1 = 0;
        int wynik2 = 0;
        GameProcessor game = new GameProcessor();
        game.menu();
        System.out.print("Podaj swoje imie: ");
        Scanner name = new Scanner(System.in);
        String nick = name.nextLine();
        Gamer gamer1 = new Gamer(nick);
        Gamer gamer2 = new Gamer("Computer");

        while(!end) {

            System.out.print("Podaj ile rund chcesz rozegrać: ");
            int ileRound = game.scanerInt();

            System.out.println();

            for(int i=0; i<ileRound; i++) {
                runda++;
                System.out.println("Runda " + runda);

                System.out.println("Zagrywa: " + gamer1.getGamer());
                char liczba = game.scanerChar();
                if(liczba==110) {
                    System.out.println("Czy na pewno zakończyć aktualną grę? " + " T/N");
                    liczba = game.scanerChar();
                    if(liczba==116) {break;
                    } else {System.out.println("Zagrywa: " + gamer1.getGamer());game.scanerChar(); continue; }
                }
                game.gamee(liczba);

                System.out.println(game.choosen1(liczba).getThingName());

                System.out.println("Zagrywa: " + gamer2.getGamer());
                Computer computer = new Computer(gamer2);
                int liczba2 = computer.random();
                //System.out.println(liczba2);
                System.out.println(game.choosen(liczba2).getThingName());

                int z = game.resultInt(liczba, liczba2);
                if(z>0) {
                    if(z==1) {
                        wynik1++;
                    } else wynik2++;
                }

                if (runda<ileRound) {System.out.println("Aktualny wynik gry: " + wynik1 + " do " + wynik2);}
                System.out.println();

            }
            game.result(wynik1, wynik2);
            runda = 0;
            System.out.println();
            System.out.println(">> Zakończenie gry - wciśnij klawisz 'x' ");

            System.out.println();
            char over = game.scanerChar();
            if(over==120) {
                System.out.println("Czy na pewno zakończyć aktualną grę? " + " T/N");
                over = game.scanerChar();
                if(over==116) {end = true;
                } else {game.menu();}
            }



        }





    }
}
