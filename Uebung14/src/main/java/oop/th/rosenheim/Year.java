package oop.th.rosenheim;

import java.util.Scanner;

public class Year {
    private int year;

    public Year() {
       this.year = 0;
    }

    public Year(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int requestBirthYear() {
        Scanner scanner = new Scanner(System.in);
        int year;
        while (true){
            try {
                System.out.println("Enter your birth year:");
                year = Integer.parseInt(scanner.nextLine());
                break; // Exit loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year.");
                e.printStackTrace(System.out);
            }
        }
        return year;
    }
}
