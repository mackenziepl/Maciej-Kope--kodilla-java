package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.completeTask(TaskFactory.SHOPPINGTASK);

        //Then
        Assert.assertEquals("Buy 2.0 Bread", shopping.executeTask());
        Assert.assertEquals("Bakery", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.completeTask(TaskFactory.PAINTINGTASK);

        //Then
        Assert.assertEquals("Paint Wall in Blue", painting.executeTask());
        Assert.assertEquals("Flat", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.completeTask(TaskFactory.DRIVINGTASK);

        //Then
        Assert.assertEquals("Drive using Car to Kielce", driving.executeTask());
        Assert.assertEquals("Trip", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}
