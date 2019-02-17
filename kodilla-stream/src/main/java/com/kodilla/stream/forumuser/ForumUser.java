package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int iD;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsPublished;

    public ForumUser(final int iD, final String username, final char sex, final LocalDate birthDate, final int postsPublished) {
        this.iD = iD;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsPublished = postsPublished;
    }

    public int getiD() {
        return iD;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsPublished() {
        return postsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "iD=" + iD +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsPublished=" + postsPublished +
                '}';
    }
}
