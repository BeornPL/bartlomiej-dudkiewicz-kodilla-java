package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    int usersNumber;
    int postsNumber;
    int commentsNumber;
    double averagePostsNumberPerUser;
    double averageCommentsNumberPerUser;
    double averageCommentsNumberPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        averagePostsNumberPerUser = (double)postsNumber/usersNumber;
        averageCommentsNumberPerUser = (double)commentsNumber/usersNumber;
        averageCommentsNumberPerPost = (double)commentsNumber/postsNumber;
    }

    public void showStatistics() {
        System.out.println("Stats:");
        System.out.println("Users: " + usersNumber + ". Published: " + postsNumber + " posts and " + commentsNumber +
                " comments.");
        System.out.println("Average posts number per user: " + averagePostsNumberPerUser + ".");
        System.out.println("Average comments number per user: " + averageCommentsNumberPerUser + ".");
        System.out.println("Average comments number per post: " + averageCommentsNumberPerPost + ".");
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public double getAverageCommentsNumberPerUser() {
        return averageCommentsNumberPerUser;
    }

    public double getAverageCommentsNumberPerPost() {
        return averageCommentsNumberPerPost;
    }
}
