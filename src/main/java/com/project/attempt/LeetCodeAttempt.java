package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(countTotalNumberOfColoredCells(1));
        System.out.println(countTotalNumberOfColoredCells(2));

    }

    // This method count the total number of colored cells after int n minutes.
    public static int countTotalNumberOfColoredCells(int n) {

        // During the first minute, we know the number of colored cells is 1.
        int coloredCells = 1;

        // Each following minute, the number of colored cells should increase by the
        // amount dictated by the following formula. The formula was obtained from
        // looking at the outputs for each minute and deciphering the pattern between
        // the output values of each successive minute.
        for (int i = 2; i <= n; i++) {

            coloredCells = coloredCells + (4 * (i - 1));

        }

        // Finally, we return the number of colored cells.
        return coloredCells;

    }

}
