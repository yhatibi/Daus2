package com.company;

import java.util.Scanner;

public class Menu {
    JocDaus jocDaus = new JocDaus();
    private Scanner sc = new Scanner(System.in);

    public void show() {
        menuPricipal();
    }

    private void menuPricipal() {
        int option;
        do {
            System.out.println("========");
            System.out.println("1. Daus");
            System.out.println("2. Parxis");
            System.out.println("3. Tic Tac Toe");
            System.out.println("4. Exit");
            System.out.println("========");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    jocDaus.play();
                    break;
                case 2:
                    //parxis();
                    break;
                case 3:
                    //ticTacToe();
                    break;
                case 4:
                    //exit();
                    break;
                default:
                    System.out.println("ATENCIÓ!!!! ha de ser 1,2,3 o 4");
            }
        } while(option != 4 && option != 1);
    }



}
