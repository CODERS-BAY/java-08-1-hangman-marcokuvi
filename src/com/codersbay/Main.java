package com.codersbay;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your word");
        String scanWord = scan.nextLine();

        char[] scanWordArray = scanWord.toCharArray();
        String guessWord = "_".repeat(scanWord.length());
        System.out.println(guessWord);
        int count = 0;

        while (!guessWord.equals(scanWord)) {
            if (count == 7) {
                break;
            }
            char[] guessWordArray = guessWord.toCharArray();
            System.out.println("Enter your letter:");
            char letter = scan.next().charAt(0);

            if (scanWord.contains(String.valueOf(letter))) {
                for (int i = 0; i < scanWordArray.length; i++) {
                    if (scanWordArray[i] == letter) {
                        guessWordArray[i] = letter;
                    }
                }

                guessWord = new String(guessWordArray);
                System.out.println(guessWord);

            } else {
                count++;
                if (count == 1) {
                    System.out.println("Wrong guess, try again");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("___|___");
                    System.out.println();
                }
                if (count == 2) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }
                if (count == 3) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   | ");
                    System.out.println("___|___");
                }
                if (count == 4) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }
                if (count == 5) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }
                if (count == 6) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |          / \\ ");
                    System.out.println("___|___      /   \\");
                }
                if (count == 7) {
                    System.out.println("GAME OVER!");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |          _|_");
                    System.out.println("   |         / | \\");
                    System.out.println("   |          / \\ ");
                    System.out.println("___|___      /   \\");
                    System.out.println("GAME OVER! The word was ");
                }
            }
        }
    }
}
