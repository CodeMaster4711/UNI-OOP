package oop.th.rosenheim;

import java.util.Scanner;

public class Day {
    private int day;

    public Day() {
        this.day = 0;
    }

    public Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static int requestBirthDay(int month, int year) {
        Scanner scanner = new Scanner(System.in);
        int day;
        while (true){
            try {
                System.out.println("Enter your birth day:");
                day = Integer.parseInt(scanner.nextLine());
                validateDay(day, month, year);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid day.");
                e.printStackTrace(System.out);
            } catch (IllegalDayException e) {
                System.out.println(e.getMessage());
                e.printStackTrace(System.out);
            }
        }
        return day;
    }

    public static void validateDay (int day, int month, int year) throws IllegalDayException {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int maxDaysInMonth = switch (month) {
            case 2 -> isLeapYear ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
        if (day < 1 || day > maxDaysInMonth) {
            throw new IllegalDayException("Invalid day. Please enter a valid day.");
        }
    }
}
