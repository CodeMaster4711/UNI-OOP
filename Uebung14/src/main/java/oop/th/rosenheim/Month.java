package oop.th.rosenheim;

import java.util.Scanner;

public class Month {
    private int month;

    public Month() {
        this.month = 0;
    }

    public Month(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public static int requestBirthMonth() {
        Scanner scanner = new Scanner(System.in);
        int month;
        while (true){
            try {
                System.out.println("Enter your birth month:");
                month = Integer.parseInt(scanner.nextLine());
                if(month < 1 || month > 12){
                    throw new IllegalMonthException("Invalid month. Please enter a valid month.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid month.");
                e.printStackTrace(System.out);
            } catch (IllegalMonthException e) {
                System.out.println(e.getMessage());
                e.printStackTrace(System.out);
            }
        }
        return month;
    }
}
