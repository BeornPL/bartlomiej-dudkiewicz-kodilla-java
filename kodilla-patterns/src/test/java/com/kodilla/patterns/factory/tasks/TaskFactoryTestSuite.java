package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.executeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping task.", task.getTaskName());
        Assert.assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.executeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting task.", task.getTaskName());
        Assert.assertEquals(false, task.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.executeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving task.", task.getTaskName());
        Assert.assertEquals(false, task.isTaskExecuted());
    }
}
