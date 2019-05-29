package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User userOfFacebook = new Millenials("Janek");
        User userOfTwitter = new YGeneration("Kuba");
        User userOfSnapchat = new ZGeneration("Ania");
        //When
        String faceGuyUses = userOfFacebook.sharePost();
        String twitterGuyUses = userOfTwitter.sharePost();
        String snapGuyUses = userOfSnapchat.sharePost();
        //Then
        Assert.assertEquals(" share post from Facebook ", faceGuyUses);
        Assert.assertEquals(" share 'twit' ", twitterGuyUses);
        Assert.assertEquals(" share post from Snapchat ", snapGuyUses);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User userOfFacebook = new Millenials("Janek");
        //When
        userOfFacebook.setSocialPublisher(new TwitterPublisher());
        //Then
        Assert.assertEquals(" share 'twit' ", userOfFacebook.sharePost());
    }
}
