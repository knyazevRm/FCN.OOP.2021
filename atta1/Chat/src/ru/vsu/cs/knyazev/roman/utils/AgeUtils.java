package ru.vsu.cs.knyazev.roman.utils;

public class AgeUtils {
    public static int[] limit(int age) {
        int[] result = new int[]{age, age};
        if (age >= 3 && age <= 5) {
            return result = writeToMass(3, 5);
        } else if (age >= 6 && age <= 10) {
            return result = writeToMass(6, 10);
        } else if (age >= 11 && age <= 15) {
            return result = writeToMass(11, 15);
        } else if (age >= 16 && age <= 19) {
            return result = writeToMass(16, 19);
        } else if (age >= 20 && age <= 30) {
            return result = writeToMass(20, 30);
        } else if (age >= 31 && age <= 42) {
            return result = writeToMass(31, 42);
        } else if (age >= 43 && age <= 55) {
            return result = writeToMass(43, 55);
        } else if (age >= 56 && age <= 65) {
            return result = writeToMass(56, 65);
        } else if (age >= 65 && age <= 78) {
            return result = writeToMass(65, 78);
        } else if (age >= 79 && age <= 130) {
            return result = writeToMass(79, 130);
        }

        return result;
    }

    private static int[] writeToMass(int low, int high) {
        return new int[]{low, high};
    }
}
