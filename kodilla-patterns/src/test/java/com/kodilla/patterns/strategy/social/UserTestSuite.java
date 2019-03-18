package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("User 1");
        User user2 = new YGeneration("User 2");
        User user3 = new ZGeneration("User 3");

        //When
        String user1posts = user1.sharePost();
        String user2posts = user2.sharePost();
        String user3posts = user3.sharePost();

        //Then
        Assert.assertEquals("Sharing on Facebook.", user1posts);
        Assert.assertEquals("Twitting on Twitter.", user2posts);
        Assert.assertEquals("Showing on Snapchat.", user3posts);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("User 1");

        //When
        user1.setSocialPublisher(new TwitterPublisher());
        String user1posts = user1.sharePost();

        //Then
        Assert.assertEquals("Twitting on Twitter.", user1posts);
    }
}
