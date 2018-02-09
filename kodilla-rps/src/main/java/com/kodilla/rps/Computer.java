package com.kodilla.rps;

import java.util.Random;

public class Computer {
    Gamer gamer2;

    public Computer(Gamer gamer2) {
        this.gamer2 = gamer2;
    }

    public Thing choosen(){
            Thing theThing;
            Random generator = new Random();
            int random = generator.nextInt(3);
            if (random == 0) {
                theThing = new Paper();
            } else if (random == 1) {
                theThing = new Stone();
            } else {
                theThing= new Scissors();
            }
            return theThing;
    }
}
