package com.kodilla.rps;

public class Gamer {
    private String gamer;

    public Gamer(String gamer) {
        this.gamer = gamer;
    }

    public String getGamer() {
        return gamer;
    }

    public Thing choosen(int liczba){
        Thing theThing;
         if (liczba == 0) {
            theThing = new Paper();
        } else if (liczba == 1) {
            theThing = new Stone();
        } else {
            theThing= new Scissors();
        }
        return theThing;
    }
}
