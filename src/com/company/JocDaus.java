package com.company;

import java.util.Scanner;

public class JocDaus {
    Dau dau = new Dau();
    int lostGames;
    int winGames;
    int playedGames;
    private Scanner sc = new Scanner(System.in);

    public void start() {
        new Menu().show();
    }

    public void play() {
        boolean sonIguals = false;
        int option;
        boolean tirarSortir = true;
        do {
            System.out.println("========");
            System.out.println("1. Tirar Daus");
            System.out.println("2. Sortir");
            System.out.println("========");

            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    break;
                case 2:
                    tirarSortir = false;
            }
            if (tirarSortir == false) {
                break;
            }


            int dau1 = dau.tirarDau();
            int dau2 = dau.tirarDau();
            int dau3 = dau.tirarDau();

            System.out.println("Dau 1º: " + dau1);
            System.out.println("Dau 2º: " + dau2);
            System.out.println("Dau 3º: " + dau3);
            System.out.println();

            if (dau1 == dau2 && dau2 == dau3 ){
                System.out.println("HAS GUANYAT: son iguals!");
                winGames++;
            } else {
                System.out.println("HAS PERDUT: no son iguals!");
                lostGames++;
            }

            playedGames++;
        } while (tirarSortir != false);

        System.out.println("Partides jugades: " + playedGames + ":");
        System.out.println("Has PERDUT " + lostGames + " vegades.");
        System.out.println("Has GUANYAT " + winGames + " vegades.");

        start();

    }
}
