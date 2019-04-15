package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    private int stone = 1;
    private int paper = 2;
    private int shears = 3;
    private char endGame = 'x';         // zakończenie gry - "Czy na pewno zakończyć grę?"
    private char newSession = 'n';      // uruchomienie gry od nowa - "Czy na pewno zakończyć aktualną grę?"


    // wyświetlenie po uruchomieniu programu

    // pobrranie z klawiatury


    public static void main(String[] args) {

        String userName;
        int games;          // ilość gier do rozegrania
        int finish = 0;         // licznik ilości gier
        int max = 3;
        int min = 1;
        boolean end = false;

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();


        System.out.println("podaj imię");
        userName = scanner.nextLine();      // metoda next albo nextLine / zapisuje to co zostanie podane przez użytkownika

        System.out.println("podaj ilość gier");
        games = scanner.nextInt();

        giveInformation();  // można bez podania klasy i "."
        beginning();        // można bez podania klasy i "."  RpsRunner.beginning();

        Scanner ruch = new Scanner(System.in);
//        while (!end) {
//
//
//            int y = scanner.nextInt();
//            if (y >= 1 && y <= 3) {
//                finish++;
//                Random generator = new Random();
//                int ruchKomputera = generator.nextInt((max - min) + 1) + min;
//                System.out.println("ruch gracza: " + y + " ruch komputera: " + ruchKomputera);
//                if (finish == games) {
//                    end = true;
//                }
//
//            }
//        }
    }

    public static void giveInformation(){
        System.out.println("informacje o grze: stone = 1, paper = 2, shears = 3, endGame = 'x', newSession = 'n'");
        //return giveInformation(); bez zwracania chcemy tylko wyświetlić
    }

    public static void beginning() {
        System.out.println("gra się rozpoczyna");
    }
}