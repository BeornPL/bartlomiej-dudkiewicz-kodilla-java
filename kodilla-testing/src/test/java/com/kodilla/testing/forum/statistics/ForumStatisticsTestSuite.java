package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

import static java.lang.Double.NaN;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testOne() {
        //Test One: users=0, posts=0, comments=0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int usersNumber = forumStatistics.getUsersNumber();
        int postsNumber = forumStatistics.getPostsNumber();
        int commentsNumber = forumStatistics.getCommentsNumber();
        double averagePostsNumberPerUser = forumStatistics.getAveragePostsNumberPerUser();
        double averageCommentsNumberPerUser = forumStatistics.getAveragePostsNumberPerUser();
        double averageCommentsNumberPerPost = forumStatistics.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(0, usersNumber);
        Assert.assertEquals(0, postsNumber);
        Assert.assertEquals(0, commentsNumber);
        Assert.assertEquals(NaN, averagePostsNumberPerUser, 0.01);
        Assert.assertEquals(NaN, averageCommentsNumberPerUser, 0.01);
        Assert.assertEquals(NaN, averageCommentsNumberPerPost,0.01);
    }
    @Test
    public void testTwo() {
        //Test One: users=100, posts=1000, comments=750 < 1000
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        for (int i=0; i<100; i++) {
            usersNamesList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(750);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int usersNumber = forumStatistics.getUsersNumber();
        int postsNumber = forumStatistics.getPostsNumber();
        int commentsNumber = forumStatistics.getCommentsNumber();
        double averagePostsNumberPerUser = forumStatistics.getAveragePostsNumberPerUser();
        double averageCommentsNumberPerUser = forumStatistics.getAverageCommentsNumberPerUser();
        double averageCommentsNumberPerPost = forumStatistics.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(100, usersNumber);
        Assert.assertEquals(1000, postsNumber);
        Assert.assertEquals(750, commentsNumber);
        Assert.assertEquals(10.0, averagePostsNumberPerUser, 0.01);
        Assert.assertEquals(7.5, averageCommentsNumberPerUser, 0.01);
        Assert.assertEquals(0.75, averageCommentsNumberPerPost,0.01);
    }
    @Test
    public void testThree() {
        //Test One: users=100, posts=1000, comments=1250 > 1000
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        for (int i=0; i<100; i++) {
            usersNamesList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1250);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int usersNumber = forumStatistics.getUsersNumber();
        int postsNumber = forumStatistics.getPostsNumber();
        int commentsNumber = forumStatistics.getCommentsNumber();
        double averagePostsNumberPerUser = forumStatistics.getAveragePostsNumberPerUser();
        double averageCommentsNumberPerUser = forumStatistics.getAverageCommentsNumberPerUser();
        double averageCommentsNumberPerPost = forumStatistics.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(100, usersNumber);
        Assert.assertEquals(1000, postsNumber);
        Assert.assertEquals(1250, commentsNumber);
        Assert.assertEquals(10.0, averagePostsNumberPerUser, 0.01);
        Assert.assertEquals(12.5, averageCommentsNumberPerUser, 0.01);
        Assert.assertEquals(1.25, averageCommentsNumberPerPost,0.01);
    }
}
