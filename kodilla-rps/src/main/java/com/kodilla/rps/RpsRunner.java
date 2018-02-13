package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        int runda = 0;
        int wynik1 = 0;
        int wynik2 = 0;
        GameProcessor gameProcessor = new GameProcessor();


        while(!end) {

            GameProcessor game = new GameProcessor();
            game.menu();
            System.out.print("Podaj swoje imie: ");
            Scanner scaner1 = new Scanner(System.in);
            String name = scaner1.nextLine();
            System.out.print("Podaj ile rund chcesz rozegrać: ");
            int ileRound = game.scanerInt();
            Gamer gamer1 = new Gamer(name);
            Gamer gamer2 = new Gamer("Computer");
            System.out.println();

            for(int i=0; i<ileRound; i++) {
                runda++;
                System.out.println("Runda " + runda);

                System.out.println("Zagrywa: " + gamer1.getGamer());
                char liczba = game.scanerChar();
                game.gamee(liczba);
                //char liczba = game.scanerChar();
                //int liczba = game.scanerInt();
                //System.out.println(liczba);
                System.out.println(gameProcessor.choosen1(liczba).getThingName());

                System.out.println("Zagrywa: " + gamer2.getGamer());
                Computer computer = new Computer(gamer2);
                int liczba2 = computer.random();




                System.out.println(liczba2);
                System.out.println(gameProcessor.choosen(liczba2).getThingName());

                //System.out.println(gameProcessor.resultString(liczba, liczba2));
                //System.out.println(gameProcessor.resultInt(liczba, liczba2));
                int z = gameProcessor.resultInt(liczba, liczba2);
                if(z>0) {
                    if(z==1) {
                        wynik1++;
                    } else wynik2++;
                }



                System.out.println("Aktualny wynik gry: " + wynik1 + " do " + wynik2);
                System.out.println();

            }
            gameProcessor.result(wynik1, wynik2);
            System.out.println();
            System.out.println("<> klawisz x - zakończenie gry");
            System.out.println("<> klawisz n - uruchomienie gry od nowa");
            System.out.println();
            char key = game.scanerChar();
            end = game.gameOver(key);


        }


            


    }
}
