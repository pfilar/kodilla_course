package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void makeLog() {
        Logger.getInstance().log("Log from our program");
    }

    @Test
    public void testGetLastLog() {
        // Given
        // When
        String makeLog = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + makeLog);
        // Then
        Assert.assertEquals("Log from our program", makeLog);
    }
}
