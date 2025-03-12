package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(countTotalNumberOfColoredCells(1));
        System.out.println(countTotalNumberOfColoredCells(2));

    }

    public static int countTotalNumberOfColoredCells(int n) {

        int coloredCells = 1;

        for (int i = 2; i <= n; i++) {

            coloredCells = coloredCells + (4 * (i - 1));

        }

        return coloredCells;

    }

}
