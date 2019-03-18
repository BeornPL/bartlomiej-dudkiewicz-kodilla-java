package com.kodilla.patterns.strategy.social;

public class SnapchatPublishher implements SocialPublisher {
    @Override
    public String share() {
        return "Showing on Snapchat.";
    }
}
