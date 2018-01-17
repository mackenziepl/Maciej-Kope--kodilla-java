package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetDatasOfStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void calculateAdvStatistics1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("Maciek");
        userNames.add("Krzysztof");
        userNames.add("Pawel");
        userNames.add("Piotr");

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        GetDatasOfStatistics getDatasOfStatistics = new GetDatasOfStatistics();

        //When
        getDatasOfStatistics.calculateAdvStatistics(statisticsMock);
        getDatasOfStatistics.ShowStatistics();

        //Then
        Assert.assertEquals(4,getDatasOfStatistics.users);
    }
    @Test
    public void calculateAdvStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("Maciek");
        userNames.add("Krzysztof");
        userNames.add("Pawel");
        userNames.add("Piotr");

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        GetDatasOfStatistics getDatasOfStatistics = new GetDatasOfStatistics();

        //When
        getDatasOfStatistics.calculateAdvStatistics(statisticsMock);
        getDatasOfStatistics.ShowStatistics();

        //Then
        Assert.assertEquals(4,getDatasOfStatistics.users);
    }
    @Test
    public void calculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("Maciek");
        userNames.add("Krzysztof");
        userNames.add("Pawel");
        userNames.add("Piotr");

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        GetDatasOfStatistics getDatasOfStatistics = new GetDatasOfStatistics();

        //When
        getDatasOfStatistics.calculateAdvStatistics(statisticsMock);
        getDatasOfStatistics.ShowStatistics();

        //Then
        Assert.assertEquals(4,getDatasOfStatistics.users);
    }
    @Test
    public void calculateAdvStatistics4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("Maciek");
        userNames.add("Krzysztof");
        userNames.add("Pawel");
        userNames.add("Piotr");

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(200);
        GetDatasOfStatistics getDatasOfStatistics = new GetDatasOfStatistics();

        //When
        getDatasOfStatistics.calculateAdvStatistics(statisticsMock);
        getDatasOfStatistics.ShowStatistics();

        //Then
        Assert.assertEquals(4,getDatasOfStatistics.users);
    }
    @Test
    public void calculateAdvStatistics5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("Maciek");
        userNames.add("Krzysztof");
        userNames.add("Pawel");
        userNames.add("Piotr");

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);
        GetDatasOfStatistics getDatasOfStatistics = new GetDatasOfStatistics();

        //When
        getDatasOfStatistics.calculateAdvStatistics(statisticsMock);
        getDatasOfStatistics.ShowStatistics();

        //Then
        Assert.assertEquals(4,getDatasOfStatistics.users);
    }
    @Test
    public void calculateAdvStatistics6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        GetDatasOfStatistics getDatasOfStatistics = new GetDatasOfStatistics();

        //When
        getDatasOfStatistics.calculateAdvStatistics(statisticsMock);
        getDatasOfStatistics.ShowStatistics();

        //Then
        Assert.assertEquals(0,getDatasOfStatistics.users);
    }
    @Test
    public void calculateAdvStatistics7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for(int i =0; i<100; i++) {
            userNames.add("User nr " + i);
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        GetDatasOfStatistics getDatasOfStatistics = new GetDatasOfStatistics();

        //When
        getDatasOfStatistics.calculateAdvStatistics(statisticsMock);
        getDatasOfStatistics.ShowStatistics();

        //Then
        Assert.assertEquals(100,getDatasOfStatistics.users);
    }
}
