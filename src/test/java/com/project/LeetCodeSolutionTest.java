package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void coloredCellsTest() {

        assertEquals(1, LeetCodeSolution.coloredCells(1));
        assertEquals(5, LeetCodeSolution.coloredCells(2));

    }

}
