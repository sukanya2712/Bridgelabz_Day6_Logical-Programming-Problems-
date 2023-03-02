package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to start the stopwatch.");
        scanner.nextLine(); // Wait for the user to press Enter
        long startTime = System.currentTimeMillis(); // Get the current time in milliseconds
        System.out.println("Press Enter again to stop the stopwatch.");
        scanner.nextLine(); // Wait for the user to press Enter again
        long endTime = System.currentTimeMillis(); // Get the current time in milliseconds
        long elapsedTime = endTime - startTime; // Calculate the elapsed time in milliseconds
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
    }
}
