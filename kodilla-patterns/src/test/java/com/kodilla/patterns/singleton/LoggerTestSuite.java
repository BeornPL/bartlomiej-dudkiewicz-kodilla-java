package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("Test1");
        //Then
        Assert.assertEquals("Test1", Logger.getInstance().getLastLog());
    }
}
