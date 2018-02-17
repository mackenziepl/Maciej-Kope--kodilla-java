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
        Assert.assertEquals("Bakery", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted(shopping.executeTask()));
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.completeTask(TaskFactory.PAINTINGTASK);

        //Then
        Assert.assertEquals("Flat", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted(painting.executeTask()));
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.completeTask(TaskFactory.DRIVINGTASK);

        //Then
        Assert.assertEquals("Trip", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted(driving.executeTask()));
    }
}
