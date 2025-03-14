package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        System.out.println(coloredCells(1));
        System.out.println(coloredCells(2));

    }

    public static long coloredCells(int n) {

        long numBlueCells = 1;
        int addend = 4;

        // Iterate n - 1 times
        while (--n > 0) {
            // Add and update current multiple of 4
            numBlueCells += addend;
            addend += 4;
        }

        return numBlueCells;

    }

}
