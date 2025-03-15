package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void countTotalNumberOfColoredCellsTest() {

        assertEquals(1, LeetCodeAttempt.countTotalNumberOfColoredCells(1));
        assertEquals(5, LeetCodeAttempt.countTotalNumberOfColoredCells(2));

    }

}
