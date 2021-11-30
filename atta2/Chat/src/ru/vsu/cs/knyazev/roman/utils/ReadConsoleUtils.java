package ru.vsu.cs.knyazev.roman.utils;

import java.util.Scanner;

public class ReadConsoleUtils {

    private Scanner scanner = new Scanner(System.in);

    public int getAgeFrom() {
        return scanner.nextInt();
    }

    public char getGenderFrom() {
        return scanner.next().charAt(0);
    }

    public String getTownFrom() {
        return scanner.nextLine();
    }

    public String getMusicFrom() {
        return scanner.nextLine();
    }
}
