package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
    //Given
        int[] number = new int[] {1,3,4,6,8};
    //When
        Double average = ArrayOperations.getAverage(number);
    //Then
        Assert.assertEquals(4.4, average,1);
    }
}
