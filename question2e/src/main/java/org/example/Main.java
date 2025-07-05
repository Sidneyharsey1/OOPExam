package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book description:");

        String bookDescription = scanner.nextLine();

        String lowerCaseDescription = bookDescription.toLowerCase();

        String wordToCount = "uganda";

        int count = 0;

        int index = lowerCaseDescription.indexOf(wordToCount);

        while (index != -1) {
            count++;
            index = lowerCaseDescription.indexOf(wordToCount, index + 1);
        }

        System.out.println("The word 'Uganda' appears " + count + " times in the book description.");

        scanner.close();
    }
}