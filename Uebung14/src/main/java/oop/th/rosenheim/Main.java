package oop.th.rosenheim;

public class Main {
    public static void main(String[] args) {
        try {
            int year = Year.requestBirthYear();
            int month = Month.requestBirthMonth();
            int day = Day.requestBirthDay(month, year);
            System.out.printf("Valid date entered: %d-%02d-%02d\n", year, month, day);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}